package patterns.cdp.singleton;

public enum EnumSingleton {
	INSTANCE;

	private String entityManager;

	private EnumSingleton() {
		entityManager = "Cassandra";
	}

	public String getEntityManager() {
		return entityManager;
	}
}
