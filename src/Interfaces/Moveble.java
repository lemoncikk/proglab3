package Interfaces;
import SceneObjects.CompassDirection;
import SceneObjects.Entity;

public interface Moveble {
    String moveTo(Entity obj);
    String moveTo(CompassDirection direction);
}
