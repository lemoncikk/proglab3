public record Location(String name) {

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        return (getClass() == o.getClass()
                && hashCode() == o.hashCode()
                && name.equals(((Location) o).name));
    }
}
