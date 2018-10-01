
public class DeepClonning {
public static void main(String[] args) throws CloneNotSupportedException {
C c=new C();
Hai1 ha=new Hai1(123, c);
Hello1 h1=new Hello1(45, ha);
h1.y=143;
h1.hai.x=341;
h1.hai.c.p=111;
Hello1 h2=(Hello1) h1.clone();
System.out.println(h1==h2);
System.out.println(h1.hai==h2.hai);

}}
class C{
	int p=99;
}
class Hai1{
	int x;
	C c;
	Hai1(int x,C c){
		this.x=x;
		this.c=c;
	}
}
class Hello1 implements Cloneable{
	int y;
	Hai1 hai;
	Hello1(int y,Hai1 hai){
		this.y=y;
		this.hai=hai;
	}
	void show() {
		System.out.println(y);
		System.out.println(hai.x);
		System.out.println(hai.c.p);
	}
	
	protected Object clone() throws CloneNotSupportedException {
		C c=new C();
		c.p=this.hai.c.p;
		Hai1 ha=new Hai1(this.hai.x,c);
		Hello1 h=new Hello1(this.y, ha);
		return h;
	}
}