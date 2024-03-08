package T5_protected.mbc;

import T5_protected.kbs.Aa;

public class Cc extends Aa {
	
	public void test() {
		b = 200; // protected 필드 상속받는 애는 다른 패키지에 있어도 사용가능
	}
}
