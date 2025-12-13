package SceneObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class FriendList implements Iterable<Person> {
    private final ArrayList<Person> friends = new ArrayList<>();

    public ArrayList<Person> getAll() {
        return new ArrayList<Person>(friends);
    }

    public void add(Person p) {
        friends.add(p);
    }

    public void removeFriend(Person p) {
        friends.remove(p);
    }

    @Override
    public Iterator<Person> iterator() {
        return getAll().iterator();
    }

    public Person get(int index) {
        return new Person(friends.get(index));
    }

    public int size() {
        return friends.size();
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        for (var i : friends) {
            sb.append(i.getName());
            sb.append(" ");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FriendList people = (FriendList) o;
        return Objects.equals(friends, people.friends);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(friends);
    }
}
