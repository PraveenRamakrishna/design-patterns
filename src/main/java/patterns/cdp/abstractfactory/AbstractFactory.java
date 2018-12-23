package patterns.cdp.abstractfactory;

public class AbstractFactory {
	
	public static void main(final String[] arguments) throws Exception {
		GUIFactory factory = null;
		
		final String appearance = arguments[0];	// Current operating system

		if (appearance.equals("OSX")) {
			factory = new OSXFactory();
		} else if(appearance.equals("Windows")) {
			factory = new WindowsFactory();
		} else {
			throw new RuntimeException("No such operating system");
		}
		
		final Button button = factory.createButton();

		button.paint();
	}

}
