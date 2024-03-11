package T10_abstract3;

public class BunsikRun2 {
	public static void main(String[] args) {
//		Bonsa wanja = new WangjaBunsik();
//		Bonsa seo = new SeoulBunsik();
//		Bonsa woo = new WoojuBunsik();
		
		Bonsa[] data = {new WangjaBunsik(), new SeoulBunsik(), new WoojuBunsik()};
		
		for(int i = 0; i < data.length; i++)
		{
			data[i].ShopName();
			data[i].kimchi();
			data[i].budae();
			data[i].bibim();
			data[i].sundae(); // 판매하지 않음 표기 고쳐야댐 ====================
			data[i].konggi();
			System.out.println();
		}
		
		/*
		wanja.ShopName();
		wanja.kimchi();
		wanja.budae();
		wanja.bibim();
		wanja.sundae(); //이거 고쳐야댐 ==============================================
		wanja.konggi();
		System.out.println("===================================================");
		seo.ShopName();
		seo.kimchi();
		seo.budae();
		seo.bibim();
		seo.sundae();
		seo.konggi();
		System.out.println("===================================================");
		woo.ShopName();
		woo.kimchi();
		woo.budae();
		woo.bibim();
		woo.sundae();
		woo.konggi();
		System.out.println("===================================================");
		*/
	}
}
