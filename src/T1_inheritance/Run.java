package T1_inheritance;

public class Run {
	public static void main(String[] args) {
		A a = new A();
		System.out.print("1.");
		a.areaRec(10, 20);
		B b = new B();
		System.out.print("2.");
		b.areaRec(30, 40);
		C c = new C();
		System.out.print("3.");
		c.areaRec(10, 5);
		D d = new D();
		System.out.print("4.");
		d.areaRec(4, 5);
		E e = new E();
		System.out.print("5.");
		e.areaRec(3, 5);
		b.areaPoly(3, 4, 2);
	}
}
