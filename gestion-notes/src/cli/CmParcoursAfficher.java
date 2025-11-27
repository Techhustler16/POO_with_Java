/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli;

import metier.Parcours;

/**
 *
 * @author Daniel
 */
public class CmParcoursAfficher extends Commande {

    @Override
    public void executer() {
        Parcours.afficherTout();
    }

    @Override
    public void setPararmetres(String[] parametres) {
        
    }
    
}
