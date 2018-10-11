package classes;

public abstract class Employe extends Personne {

	public int matricule = 0;
	public double salaireBrut = 0.0;
	public double salaireNet = 0.0;
	public AgendaProfessionnel contactsProfessionnel= new AgendaProfessionnel();
	
	public abstract void calculeSalaire();
	public abstract String mission();
	
	public void info() {
		this.calculeSalaire();
		System.out.println("############ Employe.info ############\n"+
			"J'ai le matricule "+this.matricule+" avec les coordonnées personnelles suivantes :\n"+
			this.contactsPersonnel.toString()+"\net les coordonnées professionnelles suivantes :\n"+this.contactsProfessionnel.toString()+
			"Je suis dans le groupe "+ this.getClass().toString().substring(this.getClass().toString().indexOf(".")+1)+" ma mission est "+ this.mission()+
			"\nMon salaire annuelle Brut : " +this.salaireBrut + "€ , Mon salaire annuelle Net : " + this.salaireNet+"€");
		
	}
}
