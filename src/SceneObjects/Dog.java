package SceneObjects;

import Interfaces.Hunter;

public class Dog extends Pet implements Hunter {
    public Dog(String name, Person owner) {
        super(name, owner);
    }

    @Override
    public String chase(Entity e) {
        return toString() + " преслудует " + e.name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return name + "(Пес)";
    }
}
