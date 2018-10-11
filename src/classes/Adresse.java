package classes;

public class Adresse {

	public int numeroRue=0;
	public String rue="";
	public int codePostale=0;
	public String ville="";
	
	@Override
	public String toString()
	{
		return "Numero de rue : "+ numeroRue + "\n"+
				"Rue : "+ rue + "\n"+
				"Code postale : "+ codePostale + "\n"+
				"Ville : "+ ville + "\n";
	}

}
