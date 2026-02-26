import java.util.Locale;

public class Point {
    public float x;
    public float y;

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public String toSvg(){
        return String.format(Locale.ENGLISH, "<circle r=\"5\" cx=\"%f\" cy=\"%f\" fill=\"red\" />",x,y);
    }
    public void translate(float dx, float dy){
        x = x + dx;
        y = y + dy;
    }
    public Point translated(float dx, float dy){
        Point point2 = new Point();
        point2.x = this.x + dx;
        point2.y = this.y + dy;

        return point2;
    }
}
