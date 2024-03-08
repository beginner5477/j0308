package T8_polymorphism;

//다쓰고 싶으면 당연히 자식개체 쓰면 됨
//업캐스팅 다운캐스팅은 그 객체에만 접근할수 있음.
public class Run {
	public static void main(String[] args) {
		Bb bb = new Bb();
		System.out.println();
		
		System.out.println("bb.su = " + bb.su);
		bb.modBb();
		bb.modAa();
		System.out.println();
		
		/*-----------Up Casting--------------------*/
		Aa ba = new Bb();
		ba.modAa();
		System.out.println();
		/*-----------Down Casting--------------------*/
		Bb bab = (Bb)ba;
		bab.modAa();
		System.out.println();
		/*--------------------------------------------*/
		Aa ca = new Cc();
		ca.modAa();
		ca.modCc();
		//업캐스팅 하면 결국 자식개체를 부모 객체 역할을 시키는거라서
		//자식객체에 있던 메소드 같은걸 못씀
		//다운캐스팅 또하지말고 부모객체에 있던 메소드 자식객체로 내려서
		//오버라이딩해서 쓰면 부모객체 업캐스팅해서 그객체로 메소드 호출하면 
		//저절로 자식객체에 있는거로 실행됨 great
	}
	
}
