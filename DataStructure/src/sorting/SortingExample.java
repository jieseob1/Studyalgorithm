package sorting;

public class SortingExample {

    public static void comparableSortExample() {
        Person[] people = {
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        };

        java.util.Arrays.sort(people);

        System.out.println("Sorted by age using Comparable:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age); // compare의 내부 동작은 어떻게 되는지? 그리고 이건 어떻게 동작하는건지
    }
}