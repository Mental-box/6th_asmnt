package asmnts;

class Shape {
	protected int x,y;
	Shape(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void draw(){
		System.out.println("Shape Draw (x="+x+", y="+y+")");
	}
}

class Rectangle extends Shape{
	private int width, height;
	Rectangle(int x, int y, int width, int height){
		super(x,y);
		this.width=width;
		this.height=height;
	}
	public void draw(){
		System.out.println("Rectangle Draw(x="+x+", y="+y+")");
		System.out.println("\t\twidth="+width+", height="+height);
	}
}

class Triangle extends Shape{
	private int base, height;
	Triangle(int x, int y, int base, int height){
		super(x,y);
		this.base=base;
		this.height=height;
	}
	public void draw(){
		System.out.println("Triangle Draw(x="+x+", y="+y+")");
		System.out.println("\t\tbase="+base+", height="+height);
	}
}

class Circle extends Shape{
	private int radius;
	Circle(int x, int y, int radius){
		super(x,y);
		this.radius=radius;
	}
	public void draw(){
		System.out.println("Circle Draw(x="+x+", y="+y+")");
		System.out.println("\t\tradius="+radius);
	}
}
