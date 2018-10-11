
package classes;

public class Commercial extends Employe {

	/**
	 * 
	 */
	public float chiffre_affaire = 158688.78F; //CA de l'ann�e n-1 en euro
	

	@Override
	public void calculeSalaire() {
		salaireBrut = chiffre_affaire*5/100;
		salaireNet = salaireBrut-(salaireBrut*24/100);
	}

	@Override
	public String mission() {
		return " trouver de nouveaux contacts";
		
	}

}
