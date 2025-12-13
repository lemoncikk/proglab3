package SceneObjects;

import java.util.Objects;

public class Pet extends Entity {
    String name;
    Person owner;

    public Pet(String name, Person owner) {
        super(name);
        this.name = name;
        this.owner = owner;
        if (this.owner != null) {
            this.owner.setPet(this);
        }
    }

    public Pet(Pet p) {
        super(p);
        this.name = p.name;
        this.owner = p.owner;
        if (owner != null) {
            owner.setPet(this);
        }
    }

    @Override
    public Pet copy() {
        return new Pet(this);
    }

    @Override
    public String toString() {
        return name + "(Домашний питомец)";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, owner);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(getClass() != o.getClass()) return false;
        if(!owner.equals(((Pet)o).owner)) return false;
        return super.equals(o);
    }
}
