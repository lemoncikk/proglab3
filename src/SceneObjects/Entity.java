package SceneObjects;

public abstract class Entity {
    private static long next_id = 0;
    protected final long id;
    protected final String name;
    protected Entity(String name) {
       this.name = name;
       this.id = next_id++;
    }

    protected Entity(Entity o) {
        this.name = o.name;
        this.id = next_id++;
    }
    public abstract String getName();
    public abstract Entity copy();
    public long getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        var e = (Entity)o;
        return (id == e.id && name.equals(e.name));
    }
}
