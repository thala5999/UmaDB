
public class ShallowClonning {
public static void main(String[] args) throws CloneNotSupportedException {

A a=new A();
Hai hai=new Hai(10, a);
Hello hello=new Hello(20, hai);
hello.show();
Hello h2=(Hello) hello.clone();
System.out.println("------------");
System.out.println(h2==hello);
System.out.println(h2.y==hello.y);
System.out.println(h2.hai.x==hello.hai.x);
System.out.println(h2.hai.a.p==hello.hai.a.p);
System.out.println();
h2.show();
}}
class A{
	int p=99;
}
class Hai{
	int x;
	A a;
	Hai(int x,A a){
		this.x=x;
		this.a=a;
	}
}

class Hello implements Cloneable{
	int y;
	Hai hai;
	Hello(int y,Hai hai){
		this.y=y;
		this.hai=hai;
	}
	void show() {
		System.out.println(y);
		System.out.println(hai.x);
		System.out.println(hai.a.p);
//		System.out.println(hai.a);
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}