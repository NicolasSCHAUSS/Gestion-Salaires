package classes;


public class Technicien extends Employe {

	public final float tauxHoraire = 80.8F;

	@Override
	public void calculeSalaire() {
		salaireBrut = 1607*tauxHoraire;
		salaireNet = salaireBrut - (salaireBrut*24/100);
	}

	@Override
	public String mission() {
		return "Fabriquer, controler les produits de l'entreprise";
	}

}
