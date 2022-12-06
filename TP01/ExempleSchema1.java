public class ExempleSchema1 {
	public static void main(String[] args) {
		// Créer deux points et un segment à partir de ces points
		Point p1 = new Point(3, 2);
		Point p2 = new Point(6, 9);
		Point p3 = new Point(11, 4);
		Segment s12 = new Segment(p1, p2);
		Segment s23 = new Segment(p2, p3);
		Segment s31 = new Segment(p3, p1);
		
		double BarycentreX = (p1.getX()+p2.getX()+p3.getX())/3;
		double BarycentreY = (p1.getY()+p2.getY()+p3.getY())/3;
		
		Point Barycentre = new Point(BarycentreX,BarycentreY);
	}
		
		
}
