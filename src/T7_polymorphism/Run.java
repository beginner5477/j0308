package T7_polymorphism;

//업케스팅을 해줘야 다운캐스팅 써먹을수 있음
//왜냐 부모는 자식이 상속받고 있는지 모르니까 내려갈수가 없다 
//업캐스팅 해주면 명확해지니까 가능?
public class Run {
	public static void main(String[] args) {
		Aa aa = new Aa();
		System.out.println();
//		Bb ab = (Bb)(aa); //부모객체를 바로 자식객체로 다운캐스팅 불가능
		Aa ba = new Bb();
		Bb bb = (Bb)ba;
		System.out.println();
		Bb db = new Dd();
		Dd dd = (Dd)db;
		System.out.println();
//		Cc ec = new Ee();
//		Ee ce = (Ee)ec;
//		System.out.println();
//		Aa eca = ec;
//		Cc ecac = (Cc)eca;
		Aa ea = new Ee();
		Ee eae = (Ee)ea;
		
		Cc eac = (Cc)ea;
	}
}
