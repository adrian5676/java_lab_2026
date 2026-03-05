public class Main {
    public static void main(String[] args) {
        Point[] points = new Point[5];
        points[0] = new Point (5.5F,63.2F);
        points[1] = new Point (24.8F,6.5F);
        points[2] = new Point (356.2F,10.2F);
        points[3] = new Point (28.9F,24F);
        points[4] = new Point (252.4F,62.7F);

        Polygon polygon = new Polygon(points);
        points[2] = new Point(3,5);
        Polygon tempPolygon = new Polygon(polygon);
        System.out.println(polygon.toSvg());
    }
}
