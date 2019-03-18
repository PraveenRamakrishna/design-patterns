package patterns.sdp.adapter;

public class ClassAdapter extends Adaptee implements Target {
	public void operation() {
		specificOperation();
	}
}
