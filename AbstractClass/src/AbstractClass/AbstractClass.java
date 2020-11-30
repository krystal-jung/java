package AbstractClass;
abstract class Shape {   
	static final float PI=3.14F;
	public abstract float getPerimeter();
	public abstract float getArea();
}
class Rectangle extends Shape {  
	private float length;
	private float width;
	public Rectangle(float length,float width){
		this.length=length;
		this.width=width;
	}
	public float getPerimeter(){  
		return (length+width)*2;
	}
	public float getArea(){   
		return length*width;
	}
}
class Circle extends Shape {   
	private float radius;
	public Circle(float r){
		radius=r;
	}
	public float getPerimeter(){ 
		return 2*PI*radius;
	}
	public float getArea(){ 
		return radius*radius;
	}
}
public class AbstractClass {
	public static void main(String[] args){
		Rectangle rect=new Rectangle(2,3); 
		Circle c=new Circle(3);
		System.out.println("长方形的周长是："+rect.getPerimeter()+",面积是："+rect.getArea());
		System.out.println("圆形的周长是："+c.getPerimeter()+",面积是"+c.getArea());
	}
}
