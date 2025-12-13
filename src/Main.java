import Exceptions.CantBeChasedException;
import SceneObjects.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] strings) {
        var s = new Story();
        var onField = new Sentence(new Location("Поле"));
        var inCave = new Sentence(new Location("Пещера"));
        var hero1 = new Person("Картошечка", Sex.Female);
        var hero2 = new Person("Томатик", Sex.Male);
        hero1.friends.add(hero2);
        var chipolino = new Person("Чиполино", Sex.Male);
        var detectiv = new Detective("Мистер Моркоу", Sex.Male);
        var dog = new Dog("Держи-Хватай", detectiv);
        var bush = new Bush();
        try {
            onField.add(detectiv.moveTo(CompassDirection.North))
                    .add(detectiv.chase(hero1))
                    .add(detectiv.think(hero1))
                    .add(hero1.moveTo(CompassDirection.North))
                    .add(hero1.figthWith(hero2))
                    .add(bush.navigateThrow(hero1));
        }
        catch (CantBeChasedException e) {
            System.out.println(e.getMessage() +
                    "\nВероятно у разработчика кривые руки и он допустил ошибку при написании сценария!");
        }
        inCave.add(chipolino.hide());
        s.addSentance(onField);
        s.addSentance(inCave);
        System.out.println(s.toString());


        //Щас как упадём !
        ArrayList<Long> list = new ArrayList<>();
        long idex = 0;
        while(true) {
            list.add(idex);
            idex++;
        }
    }

}
