import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Иван", "Иванов-Соков", 47));
        persons.add(new Person("Евгений", "Евгенов-Аннова", 28));
        persons.add(new Person("Игорь", "Игорев-Аннова-Соков", 32));
        persons.add(new Person("Анна", "Аннова", 60));
        persons.add(new Person("Борис", "Соков", 13));

        Collections.sort(persons, (o1, o2) -> {
            int length1 = o1.getSurname().split("-").length;
            int length2 = o2.getSurname().split("-").length;
            if(length1 < length2) {
                return -1;
            }
            if(length1 > length2) {
                return 1;
            }
            return o1.getAge() - o2.getAge();
        });

        for (Person person : persons) {
            System.out.println(person);
        }


    }
}