public class Segment {
    public Point p,q;
    public Segment(Point p, Point q){
        this.p=p;
        this.q=q;
    }
    public float length(){
        return (float) Math.hypot(p.getX() - q.getX(), p.getY() - q.getX());
    }
}
