import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Иван", "Иванов", 47));
        persons.add(new Person("Евгений", "Евгенов", 28));
        persons.add(new Person("Игорь", "Игорев", 32));
        persons.add(new Person("Анна", "Анннова", 60));
        persons.add(new Person("Борис", "Соков", 13));

        Collections.sort(persons, new PersonComparator());

        for (Person person : persons) {
            System.out.println(person);
        }


    }
}