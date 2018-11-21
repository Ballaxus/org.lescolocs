package mediatheque.enums;

public enum Role {

	ADMIN("ADMIN"), USER("USER");

	private String nomRole;

	Role(String nomRole) {
		this.nomRole = nomRole;
	}

	public String getNomRole() {
		return nomRole;
	}
}
