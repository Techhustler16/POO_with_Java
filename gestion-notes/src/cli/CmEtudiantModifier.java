package cli;

import java.time.LocalDate;
import metier.Etudiant;
import metier.Parcours;


public class CmEtudiantModifier extends Commande {
    // les attributs qui me permettre de modifier un etudiant
    
    private int numeroCarte;      
    private String NouveauNom;            
    private String NouveauPrenom;         
    private LocalDate NouvelledateNaissance; 

    @Override
    public void executer() {
        
        // On parcourt tous les parcours et leurs étudiants pour trouver la carte
        boolean trouve = false; 
        for (Parcours p : Parcours.getListe()) { 
            for (Etudiant e : p.getEtudiants()) { 
                if (e.getnumeroCarte() == this.numeroCarte) { 
                    // ICI JE VAIS MODIFFIER LES DONNES DE MON ETUDIANT 
                    e.setNom(this.NouveauNom);
                    e.setPrenom(this.NouveauPrenom);
                    e.setDateNaissance(this.NouvelledateNaissance);

                    
                    System.out.println("Étudiant modifié :");
                    e.afficher();

                    trouve = true; // Étudiant trouvé et modifié
                    break; // On arrête la boucle interne
                }
            }
            if (trouve) break; 
        }

        // Si aucun étudiant n'a été trouvé avec ce numéro de carte
        if (!trouve) {
            System.out.println("Étudiant avec numeroCarte " + this.numeroCarte + " introuvable.");
        }
    }

    @Override
    public void setPararmetres(String[] parametres) {
      
      
        this.numeroCarte = Integer.parseInt(parametres[0]); 
        this.NouveauNom = parametres[1];                          
        this.NouveauPrenom = parametres[2];                     
        this.NouvelledateNaissance = LocalDate.parse(parametres[3]); 
    }
}
