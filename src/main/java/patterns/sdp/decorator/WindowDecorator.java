package patterns.sdp.decorator;

public abstract class WindowDecorator implements Window {

	protected Window windowToBeDecorated;

	public WindowDecorator(Window windowToBeDecorated) {
		super();
		this.windowToBeDecorated = windowToBeDecorated;
	}

	public void draw() {
		windowToBeDecorated.draw(); //Delegation
	}

	public String getDescription() {
		return windowToBeDecorated.getDescription(); //Delegation
	}
}
