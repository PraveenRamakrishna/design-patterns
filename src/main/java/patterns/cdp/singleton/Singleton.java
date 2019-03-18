package patterns.cdp.singleton;

public class Singleton {
	private static Singleton INSTANCE;

	private String info = "Class Based Singleton";

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (null == INSTANCE) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
