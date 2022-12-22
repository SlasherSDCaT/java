package practiePac.practice2;

public class TesterBall {
    public static void main(String[] args) {
        Ball b = new Ball();
        Ball b2 = new Ball(1.5, 4.3);
        System.out.println(b);
        System.out.println(b2);
        b.setXY(1.1, 3.2);
        b2.move(3.5, 2.2);
        System.out.println(b);
        System.out.println(b2);
    }
}
