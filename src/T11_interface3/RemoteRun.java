package T11_interface3;

public class RemoteRun {
	public static void main(String[] args) {
		Product product = new Product();
		product.remoteName("TV");
		product.switchOn("TV");
		product.setVolume(5);
		product.setVolume(15);
		product.setVolume(-15);
		product.switchOff("TV");
		System.out.println();
		
		product.remoteName("Audio");
		product.switchOn("Audio");
		product.setVolume(5);
		product.setVolume(15);
		product.setVolume(-15);
		product.switchOff("Audio");
		System.out.println();
	}
}
