package SceneObjects;

public enum CompassDirection {
    North("Север"),
    South("Юг"),
    East("Восток"),
    West("Запад"),
    NorthEast("Северо-Восток"),
    NorthWest("Северо-Запад"),
    SouthEast("Юго-Восток"),
    SouthWest("Юго-Запад");

    private final String title;
    CompassDirection(String t) {
        title = t;
    }
    String getTitle() {
        return title;
    }
}
