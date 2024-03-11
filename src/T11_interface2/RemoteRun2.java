package T11_interface2;

public class RemoteRun2 {
	public static void main(String[] args) {
		Remote audio = new Audio();
		Remote tv = new Tv();
		Remote[] data = {audio, tv};
		String[] titles = {"Audio", "Tv"};
		
		for(int i = 0; i < data.length; i++)
		{
			data[i].switchOn();
			data[i].remoteName(titles[i]);
			data[i].switchOff();
			System.out.println();
		}
//		audio.switchOn();
//		audio.remoteName("오디오");
//		audio.switchOff();
//		System.out.println();
//		
//		tv.switchOn();
//		tv.remoteName("오디오");
//		tv.switchOff();
		
		
	}
}
