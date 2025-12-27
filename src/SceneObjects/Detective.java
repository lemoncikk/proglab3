package SceneObjects;

import Exceptions.CantBeChasedException;
import Interfaces.Hunter;

import java.util.Objects;
import java.util.Stack;

public class Detective extends Person implements Hunter {
    private Stack<Entity> prayList = new Stack<>();
    public Detective(String name, Sex sex) {
        super(name, sex);
    }

    public Detective(String name, Sex sex, Dog pet) {
        super(name, sex, pet);
    }

    public Detective(Detective person) {
        super(person);
        prayList = person.prayList;
    }

    public Entity getPrey() {
        return prayList.peek().copy();
    }

    public void removePray() {
        prayList.pop();
    }

    @Override
    public Detective copy() {
        return new Detective(this);
    }

    @Override
    public String toString() {
        return super.toString() + "(детектив)";
    }

    @Override
    public String chase(Entity e) throws CantBeChasedException {
        if (!(e instanceof Person || e instanceof Pet)) {
           throw new CantBeChasedException();
        }
        if (!prayList.contains(e)) {
            prayList.add(e);
        }
        return name + " и его собака по кличке " + ((Dog)getPet()).chase(getPrey());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Detective detective = (Detective) o;
        return id == detective.id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }
}
