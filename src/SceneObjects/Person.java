package SceneObjects;

import Interfaces.Combatant;
import Interfaces.Hideble;
import Interfaces.Moveble;
import Interfaces.Thinkable;
import Exceptions.SckrepyMissmatchException;

public class Person extends Entity implements Combatant, Moveble, Thinkable, Hideble {
    private final Sex sex;
    private Pet pet;
    public final FriendList friends = new FriendList();

    public Person(String name, Sex sex) {
        super(name);
        if(sex == Sex.Other) throw new SckrepyMissmatchException();
        this.sex = sex;
        this.pet = null;
    }

    public Person(String name, Sex sex, Pet pet) {
        super(name);
        this.sex = sex;
        this.pet = pet;
    }

    public Person(Person person) {
        super(person);
        this.sex = person.sex;
        this.pet = person.pet;
    }

    @Override
    public Person copy() {
        return new Person(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String figthWith(Entity o) {
        objectAdjectives.add("is in fight");
        return toString() + " сражается с " + o.toString();
    }

    @Override
    public String moveTo(Entity obj) {
        objectAdjectives.add("is moving");
        return toString() + " движется к " + obj.toString();
    }

    @Override
    public String moveTo(CompassDirection direction) {
        objectAdjectives.add("is moving");
        return toString() + " движется в направлении " + direction.getTitle();
    }

    @Override
    public String think(Entity o) {
        objectAdjectives.add("thinks");
        return toString() + " думает о " + o.toString();
    }

    @Override
    public String hide(Entity e) {
        objectAdjectives.add("hides");
        return toString() + " спрятал " + e.toString();
    }

    @Override
    public String hide() {
        objectAdjectives.add("hides itself");
        return toString() + " спраятался ";
    }

    public Sex getSex() {
        return sex;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet p) {
        pet = p;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + " с друзьями("
                + ((friends.size() > 0) ? friends.toString() : "у него нет друзей :( ") + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;
        return (super.equals(obj));
    }
}
