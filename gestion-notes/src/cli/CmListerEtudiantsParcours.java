/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli;

import metier.Parcours;

/**
 *
 * @author tkossi
 */
public class CmListerEtudiantsParcours extends Commande {

    @Override
    public void executer() {
        Parcours parcours = Parcours.getListe().get(0);
        parcours.afficher();
        parcours.afficherEtudiant();
    }

    @Override
    public void setPararmetres(String[] parametres) {
        
    }
    
}
