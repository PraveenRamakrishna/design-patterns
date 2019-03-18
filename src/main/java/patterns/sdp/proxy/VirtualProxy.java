package patterns.sdp.proxy;

interface Image {
	public void displayImage();
}

// On System A
class RealImage implements Image {

	private String filename;

	public RealImage(final String filename) {
		this.filename = filename;
		loadImageFromDisk();
	}

	private void loadImageFromDisk() {
		System.out.println("Loading   " + filename);
	}

	public void displayImage() {
		System.out.println("Displaying " + filename);
	}

}

// On System B
class ProxyImage implements Image {

	private RealImage image;
	private String filename;

	public ProxyImage(final String filename) {
		this.filename = filename;
	}

	public void displayImage() {
		if (image == null) {
			image = new RealImage(filename);
		}
		image.displayImage();
	}

}

public class VirtualProxy {
	public static void main(String[] args) {
		 final Image image1 = new ProxyImage("HiRes_10MB_Photo1");
	        final Image image2 = new ProxyImage("HiRes_10MB_Photo2");
	        image1.displayImage(); // loading necessary
	        image1.displayImage(); // loading unnecessary
	        image2.displayImage(); // loading necessary
	        image2.displayImage(); // loading unnecessary
	        image1.displayImage(); // loading unnecessary
	}
}
