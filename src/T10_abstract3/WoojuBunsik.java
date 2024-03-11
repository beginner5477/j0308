package T10_abstract3;

public class WoojuBunsik extends Bonsa {

//	public SeoulBunsik(String shopName, int kimchi, int budae, int bibim, int sundae, int konggi) {
//		super(shopName, kimchi, budae, bibim, sundae, konggi);
//	}
	public WoojuBunsik() {
		super("우주분식", 6000, 7000, 7000, 6000, 1000);
	}
	@Override
	public void kimchi() {
		System.out.println("김치찌개"+kimchi);
	}
	@Override
	public void budae() {
		System.out.println("부대찌개"+budae);
	}

	@Override
	public void bibim() {
		System.out.println("비빔밥"+bibim);
	}

	@Override
	public void sundae() {
		System.out.println("순대국"+sundae);
	}

	@Override
	public void konggi() {
		System.out.println("공기밥"+konggi);
	}
	
}
