public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person originalPerson = new Person("Alice", 30);

        // Using the copy constructor to create a new Person object as a copy
        Person copiedPerson = new Person(originalPerson);

        System.out.println("Original Person: Name - " + originalPerson.getName() + ", Age - " + originalPerson.getAge());
        System.out.println("Copied Person: Name - " + copiedPerson.getName() + ", Age - " + copiedPerson.getAge());
    }
}
