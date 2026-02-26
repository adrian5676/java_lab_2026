public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Point point = new Point();
        point.x = 5.4F;
        point.y = 3.3F;
        System.out.println(point.toSvg());;
    }
}
