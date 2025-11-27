package cli;

import metier.Etudiant;
import metier.Parcours;


public class CmEtudiantSupprimer extends Commande {
    
    
    // le numero de carte seul me suffit pour supprimer un etudiant
    private int numeroCarte;
    

    @Override
    public void executer() {
        
        // On parcourt tous les parcours et leurs étudiants pour trouver la carte
        boolean Etudianttrouver = false;
        for (Parcours p : Parcours.getListe()) {
            for (Etudiant e : p.getEtudiants()) {
                if (e.getnumeroCarte() == this.numeroCarte) {
                    // remove = supprimer 
                    p.getEtudiants().remove(e);
                    System.out.println("Étudiant avec numeroCarte " + this.numeroCarte + " supprimé.");
                    Etudianttrouver = true;
                    break;
                }
            }
            if (Etudianttrouver) break;
        }

        // Si aucun étudiant n'a été trouvé avec ce numéro de carte
        if (!Etudianttrouver) {
            System.out.println("LE numero de carte  " + this.numeroCarte + " de votre etudiant ne correspond a aucun etudiant.");
        }
    }

    @Override
    public void setPararmetres(String[] parametres) {
        
        this.numeroCarte = Integer.parseInt(parametres[0]);
    }
    
}
