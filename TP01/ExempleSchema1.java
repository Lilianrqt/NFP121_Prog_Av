public class ExempleSchema1{
    public static void main(String[] args){
        Point p1 = new Point(2,3);
        Point p2 = new Point(11,4);
        Point p3 = new Point(6,9);

        Segment s12 = new Segment(p1,p2);
        Segment s23 = new Segment(p2,p3);
        Segment s31 = new Segment(p3,p1);

        double BarycentreX =( p1.getX() + p2.getX() + p3.getX() ) / 3;
        double BarycentreY =( p1.getY() + p2.getY() + p3.getY() ) / 3;

        Point barycentre = new Point(BarycentreX,BarycentreY);
    }
}