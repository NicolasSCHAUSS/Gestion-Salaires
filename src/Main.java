import classes.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Cadre stagiaire = new Cadre();
		stagiaire.matricule = 13489;
		stagiaire.nom = "SCHAUSS";
		stagiaire.prenom = "Nicolas";
		stagiaire.numeroSecu = 157984321645786L;
		
		Adresse adresseStagiare = new Adresse();
		adresseStagiare.numeroRue = 6;
		adresseStagiare.codePostale = 11800;
		adresseStagiare.rue = "rue d'Alsace";
		adresseStagiare.ville = "Trebes";
		stagiaire.adresse = adresseStagiare;
		
		AgendaPersonnel tempContact = new AgendaPersonnel();
		tempContact.numeroTel = "0645871568";
		tempContact.mail = "monContact@mail.fr";
		
		Adresse adresseDta = new Adresse();
		adresseDta.numeroRue = 294;
		adresseDta.codePostale = 34000;
		adresseDta.rue = "Avenue Maurice Begart";
		adresseDta.ville = "Montpellier";
		
		AgendaProfessionnel tempContactPro = new AgendaProfessionnel();
		tempContactPro.numeroTel = "0644771568";
		tempContactPro.mail = "monContact@dta.fr";
		tempContactPro.service = "formation";
		tempContactPro.adresseEntreprise = adresseDta ; 
		
		stagiaire.contactsPersonnel = tempContact;
		stagiaire.contactsProfessionnel = tempContactPro;
		System.out.println(stagiaire.toString());
		stagiaire.info();
    }
}
