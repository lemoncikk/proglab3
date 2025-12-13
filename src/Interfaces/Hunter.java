package Interfaces;
import Exceptions.CantBeChasedException;
import SceneObjects.Entity;

public interface Hunter {
    String chase(Entity e) throws CantBeChasedException;
}
