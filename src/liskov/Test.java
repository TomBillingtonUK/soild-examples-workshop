package liskov;

public class Test {

    static void getAreaTest(Rectangle r) {
        int width = r.getWidth();
        r.setHeight(10);
        System.out.println("Expected area of " + (width * 10) + " got " + r.getArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        getAreaTest(rectangle);

        Rectangle square = new Square();
        square.setWidth(5);
        getAreaTest(square);
    }
}
