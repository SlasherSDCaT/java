package practiePac.practice3.page2;

public class Test {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(1, 1, 2, 3);
        System.out.println(p);
        p.moveUp();
        p.moveRight();
        System.out.println(p);

        MovableCircle c = new MovableCircle(2, 3, 1, 1, 3);
        System.out.println(c);
        c.moveDown();
        c.moveLeft();
        System.out.println(c);

        MovableRectangle r = new MovableRectangle(2, 4, 1, 2, 4, 2);
        System.out.println(r);
        r.moveUp();
        System.out.println(r);
        r.moveRight();
        System.out.println(r);
    }
}
