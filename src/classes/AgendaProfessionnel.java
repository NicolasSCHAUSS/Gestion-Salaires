package classes;

public class AgendaProfessionnel extends AgendaPersonnel {

	public String service = "";
	public Adresse adresseEntreprise = new Adresse();
	
	@Override
	public String toString()
	{
		
		return super.toString() + "\nService : "+
		service +"\nAdresse de l'entreprise : "+ adresseEntreprise;
	}

}
