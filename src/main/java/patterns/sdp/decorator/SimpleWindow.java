package patterns.sdp.decorator;

public class SimpleWindow implements Window {

	public void draw() {
		System.out.println("Simple Window");
	}

	public String getDescription() {
		return "Simple Window..!";
	}
}
