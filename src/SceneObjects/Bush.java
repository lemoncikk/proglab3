package SceneObjects;

import Interfaces.NavigatebleThrow;

public class Bush extends Entity implements NavigatebleThrow {
    public Bush(String name) {
        super(name);
    }
    public Bush(Bush b) {
        super(b.name);
    }

    public Bush() {
        super("");
    }

    @Override
    public String navigateThrow(Entity e) {
        return e.toString() + " проходит сквозь " + this;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String toString() {
        return name + "(куст?)";
    }

    @Override
    public Entity copy() {
        return new Bush(this);
    }
}
