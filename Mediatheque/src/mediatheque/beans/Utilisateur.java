package mediatheque.beans;

public abstract class Utilisateur {

	protected static int id = 0;
	protected String nom;
	protected String prenom;
	protected String email;
	protected String login;
	protected String password;
	protected String role;

	public Utilisateur() {
		id++;
	}
}
