package patterns.cdp.builder;

public class BankAccount {

	private String name;

	private String accountNumber;

	private String email;

	private boolean newsletter;

	private BankAccount(Builder builder) {
		this.name = builder.name;
		this.accountNumber = builder.accountNumber;
		this.email = builder.email;
		this.newsletter = builder.newsletter;
	}

	public String getName() {
		return name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getEmail() {
		return email;
	}

	public boolean isNewsletter() {
		return newsletter;
	}

	public static class Builder {
		private String name;
		private String accountNumber;
		private String email;
		private boolean newsletter;

		public Builder(String name, String accountNumber) {
			this.name = name;
			this.accountNumber = accountNumber;
		}

		public Builder withEmail(String email) {
			this.email = email;
			return this;
		}

		public Builder wantNewsletter(boolean newsletter) {
			this.newsletter = newsletter;
			return this;
		}

		public BankAccount build() {
			return new BankAccount(this);
		}
	}
	
	public static void main(String[] args) {
		BankAccount builder = new BankAccount.Builder("Praveen","00000000").build();
	}
}