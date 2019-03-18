package patterns.sdp.adapter;

public class ObjectAdapter implements Target {

	private Adaptee  adaptee;
	
	public void operation() {
		adaptee.specificOperation();
	}

}
