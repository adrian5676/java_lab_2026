public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Point point = new Point();
        point.x = 5.4F;
        point.y = 3.3F;

        System.out.println(point.toSvg());
        point.translate(1, 4);
        System.out.println(point.toSvg());

        Point point3 = point.translated(.8F, 2.5F);
        System.out.println(point3.toSvg());

        Segment segment = new Segment();
        segment.p = point;
        segment.q = point3;
        System.out.println(segment.length());
    }
        public class float findMax(Segment[] segments){
        float max = segments[0].length;
        for(Segment s : segments){
            if(max>s.length())
                max=s.length();
        }
        return max;
    }
}
