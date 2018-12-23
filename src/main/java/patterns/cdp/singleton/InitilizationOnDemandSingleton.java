package patterns.cdp.singleton;

public class InitilizationOnDemandSingleton {
	private InitilizationOnDemandSingleton() {
	}

	private static class LazzyHolder {
		static final InitilizationOnDemandSingleton INSTANCE = new InitilizationOnDemandSingleton();
	}

	public static InitilizationOnDemandSingleton getInstance() {
		return LazzyHolder.INSTANCE;
	}
}
