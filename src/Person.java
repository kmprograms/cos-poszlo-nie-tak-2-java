import java.util.List;

public record Person (String name, int age) {
    public boolean isAdult() {
        return age >= 18;
    }

    public static List<Person> getAdultPeople(List<Person> people) {
        return people
                .stream()
                .filter(Person::isAdult)
                .toList();
    }
}
