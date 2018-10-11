/**
 * 
 */
package classes;

/**
 * @author formation
 *
 */
public class Cadre extends Employe {

	public float tauxJournalier = 125.5F;


	@Override
	public void calculeSalaire() {
		salaireBrut = 212*tauxJournalier;
		salaireNet = salaireBrut-(salaireBrut*24/100);
		
	}

	@Override
	public String mission() {
		return "gérer les projets";
		
	}
}
