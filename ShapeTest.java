package asmnts;

public class ShapeTest {
	public static void main(String args[]){
		Shape s1,s2,s3,s4;
		
		s1 = new Shape(0,0);
		s2 = new Rectangle(2,2,16,4);
		s3 = new Triangle(3,6,12,6);
		s4 = new Circle(8,9,9);
		
		s1.draw();
		s2.draw();
		s3.draw();
		s4.draw();
	}
}
