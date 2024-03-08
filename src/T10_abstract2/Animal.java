package T10_abstract2;

/*	추상클래스 abstract (팀작업을 위한 작업지시서 총괄지시)
  	만드는 법: 클래스명 앞에 abstract를 붙여준다
  	작업에 필요한 공통적인 사항(필드,주로메소드)를 정의만 한다.
  	추상 메소드의 구체적인 동작 내용은 없다.
  	즉, 추상 메소드 선언부만 있다, 중괄호도 없다.
  	추상클래스는 new로 객체(생성)해서 사용할 수 없다.
  	즉, 실제로 사용하려면 추상클래스를 상속(extends)받은 객체 타입으로 생성해야댐
  	(실체/구현 클래스에서 사용한다는말)
 */
public abstract class Animal {
	public void sori() {}
	public void sound() {}
	public abstract void cry(); //모든 동물의 울음소리 메소드는 cry()로 통일
	
}
