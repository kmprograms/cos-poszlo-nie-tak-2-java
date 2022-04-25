import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        var people = List.of(
                new Person("ADAM", 11),
                new Person("EWA", 31),
                new Person("IZA", 18),
                new Person("OLA", 14)
        );

        var peopleList = Person.getAdultPeople(people);
        System.out.println(peopleList);
    }
}
