package staticExample;

public class Main {
    public static void main(String[] args) {
        Human amaan = new Human(21, "Amaan M", 0);
        Human kutt = new Human(12, "Kutta", 20);
        System.out.println(Human.population);

        kutt.greet();
        greet(kutt.name);
    }

    static void greet(String name) {
        System.out.println("Hello " + name);
    }

}
