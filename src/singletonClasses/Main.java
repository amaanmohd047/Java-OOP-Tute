package singletonClasses;

public class Main {
    public static void main(String[] args) {
        Single obj = Single.getInstance();
        Single obj1 = Single.getInstance();
        Single obj2 = Single.getInstance();

    }
}
