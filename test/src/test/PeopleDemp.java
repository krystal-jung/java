package test;
public class PeopleDemp {

	public static void main(String[] args) {
		People person=new People("ÕÅÈý",15,100);
		System.out.println(person.toString());
		person.num=200;
		System.out.println(person.toString());
		person.setAge(50);
		System.out.println(person.toString());
		System.out.println(person.getAge());
		
	}

}
class People{
	private String name;
	private int age;
	public int num;
	public People (String name,int age,int num) {
		this.name=name;
		this.age=age;
		this.num=num;
	}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age=age;
}

public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num=num;
}


public String toString() {
	return"People[name="+name+",age="+age+",num="+num+"]";
}
}