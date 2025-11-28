package gestion.notes;

import cli.Commande;
import cli.ParseurCommande;
import java.util.Scanner;

/**
 * @author Daniel
 */
public class Main {

    private static Scanner clavier = new Scanner(System.in);
    private static ParseurCommande parseur = new ParseurCommande();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Parcours lproGL = new Parcours(1, "lproGL");
//        lproGL.inscrireEtudiant(new Etudiant("KOSSI", "Kossivi Tinè", LocalDate.now(), 645293));
//        lproGL.inscrireEtudiant(new Etudiant("KOFFI", "Kossi Abalo", LocalDate.now(), 645293));
        System.out.println("\nBonjour Daniel     ");
        System.out.print("\nTaper votre commande : ");
        while (true) {
            String strCmde = clavier.nextLine();
            Commande commande = parseur.parser(strCmde);
            commande.executer();
        }
    }

    public static void test(String[] ags) {
        //Parcours lproGL = new Parcours("LPro GL");
        //Parcours lproSRI = new Parcours("LPro SRI");
        //Etablissement epl = new Etablissement("EPL", "Ecole Polytechnique de Lomé");
        //Etablissement fds = new Etablissement("FDS", "Faculté Des Sciences");

        /*List<Parcours> pcrs = new ArrayList();
        pcrs.add(lproGL);
        pcrs.add(lproSRI);
        epl.setParcourss(pcrs);*/
 /*epl.getParcourss().add(lproGL);
        lproGL.getEtablissements().add(epl);
        epl.getParcourss().add(lproSRI);
        lproSRI.getEtablissements().add(epl);
        
        fds.getParcourss().add(lproGL);
        lproGL.getEtablissements().add(fds);
        
        epl.presenterParcours();
        fds.presenterParcours();
        
        lproGL.presenterEtablissement();
        lproSRI.presenterEtablissement();*/
 /*Etudiant et1 = new Etudiant("KODJO", "Afi", LocalDate.now(), 600235);
        Etudiant et2 = new Etudiant("KOFFI", "Abalo", LocalDate.now(), 600265);
        
        UniteEnseignement poo = new UniteEnseignement("INF 1326", "POO");
        UniteEnseignement uml = new UniteEnseignement("INF 1436", "UML");
        
        poo.getInscriptionUEs().add(new InscriptionUE(et1, poo));
        poo.getInscriptionUEs().add(new InscriptionUE(et2, poo));
        
        et1.getInscriptionUEs().add(new InscriptionUE(et1, poo));
        et2.getInscriptionUEs().add(new InscriptionUE(et2, poo));*/
    }
}
