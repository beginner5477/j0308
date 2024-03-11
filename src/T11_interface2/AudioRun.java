package T11_interface2;

public class AudioRun {
	public static void main(String[] args) {
		Remote audio = new Audio();
		System.out.println("Audio 최대 볼륨: "+ Remote.MAX_VOLUME);
		System.out.println("Audio 최소 볼륨: "+ Remote.MIN_VOLUME);
		
		audio.switchOn();
		audio.remoteName("Audio");
		audio.switchOff();
	}
}
