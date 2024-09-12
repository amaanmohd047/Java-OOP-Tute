package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    static long population;

    public Human(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.population += 1;
    }

    public static void eat() {
        System.out.println("Nawm Nawm!");
    }

    public void greet() {
        System.out.println("Hello, I'm " + this.name);
    }
}
