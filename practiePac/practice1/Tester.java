package practiePac.practice1;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Class Bird");
        Bird b1 = new Bird("Sparrow", 12);
        Bird b2 = new Bird("Raven");
        Bird b3 = new Bird();
        b2.setWingspan(40);
        b3.setWingspan(50);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println("\nClass City");
        City c1 = new City("Novosibirsk", 1621330);
        City c2 = new City("Krasnodar");
        City c3 = new City();
        c2.setSize(1723942);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("\nClass Book");
        Book bk1 = new Book("Lord of the Rings", "J.R.R. Tolkien", 3);
        Book bk2 = new Book("Dead souls", "Nikolai Gogol");
        Book bk3 = new Book();
        System.out.println(bk1);
        System.out.println(bk2);
        System.out.println(bk3);
    }
}