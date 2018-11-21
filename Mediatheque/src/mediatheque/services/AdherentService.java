package mediatheque.services;

import mediatheque.beans.Adherent;

public interface AdherentService {

	public Adherent inscription(Adherent adherent);

	public void seDesabonner(Adherent adherent);

}
