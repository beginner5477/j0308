package T10_abstract3;

public class BunsikRun {
	public static void main(String[] args) {
		Bonsa wanja = new WangjaBunsik();
		wanja.ShopName();
		wanja.kimchi();
		wanja.budae();
		wanja.bibim();
		wanja.sundae(); //이거 고쳐야댐 ==============================================
		wanja.konggi();
		System.out.println("===================================================");
		Bonsa seo = new SeoulBunsik();
		seo.ShopName();
		seo.kimchi();
		seo.budae();
		seo.bibim();
		seo.sundae();
		seo.konggi();
		System.out.println("===================================================");
		Bonsa woo = new WoojuBunsik();
		woo.ShopName();
		woo.kimchi();
		woo.budae();
		woo.bibim();
		woo.sundae();
		woo.konggi();
		System.out.println("===================================================");
	}
}
