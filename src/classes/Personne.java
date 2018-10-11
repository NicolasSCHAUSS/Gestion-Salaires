package classes;

public abstract class Personne {
	
	public String nom = "";
	public String prenom = "";
	public long numeroSecu = 0L;
	public Adresse adresse = new Adresse();
	
	public AgendaPersonnel contactsPersonnel = new AgendaPersonnel();
	
	@Override
	public String toString()
	{
		return "############ Personne.ToString ############\n"+
				"Nom : "+ nom + "\n"+
				"Prenom : "+ prenom + "\n"+
				"Numero de Secu : "+ numeroSecu + "\n"+
				"Adresse : "+ adresse;
		
	}
	
}
