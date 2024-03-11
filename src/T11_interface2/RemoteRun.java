package T11_interface2;

public class RemoteRun {
	public static void main(String[] args) {
		Audio audio = new Audio();
		Tv tv = new Tv();
		
		audio.switchOn();
		audio.remoteName("오디오");
		audio.switchOff();
		System.out.println();
		
		tv.switchOn();
		tv.remoteName("오디오");
		tv.switchOff();
		
		
	}
}
