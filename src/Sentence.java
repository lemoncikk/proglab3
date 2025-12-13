import java.util.Objects;

public class Sentence {
    private StringBuilder text = new StringBuilder();
    private Location location;

    public Sentence(Location location) {
        this.location = location;
    }

    public Sentence(String text, Location location) {
        this.text.append(text);
        this.location = location;
    }

    public Sentence add(String s) {
        text.append(s);
        text.append("\n");
        return this;
    }

    @Override
    public String toString() {
        return "На локации " + location.toString() + " :\n" + text.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(text.hashCode() ^ location.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        return getClass() == o.getClass()
                && hashCode() == o.hashCode()
                && text.toString().contentEquals(((Sentence)o).text)
                && location.equals(((Sentence)o).location);
    }
}
