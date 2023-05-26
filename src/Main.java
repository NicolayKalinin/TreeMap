import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Sonya", "Иванова-Смирнова-Романова", 35));
        persons.add(new Person("Ruslan", "Иванов-Романов", 33));
        persons.add(new Person("Salavat", "Иванов", 23));
        persons.add(new Person("Sasha", "Антонова", 31));
        persons.add(new Person("Svetlana", "Мусина-Пушкина", 38));
        persons.add(new Person("Olya", "Воронцова-Вельяминова", 38));

        Collections.sort(persons, (Person o1,Person o2) -> {
            if (calcLenSurname(o1) < calcLenSurname(o2)) {
                return -1;
            }
            if (calcLenSurname(o1) > calcLenSurname(o2)) {
                return 1;
            }
            return o1.getAge() - o2.getAge();
        });

        for (Person person : persons) {
            System.out.println (person);
        }
    }

    private static int calcLenSurname(Person person) {
        String surname = person.getSurname();
        return surname.split("-").length;
    }
}