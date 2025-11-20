/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.notes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tkossi
 */
public class Parcours {
    private String libelle;
    private List<Etudiant> etudiants = new ArrayList<>();
    private List<Etablissement> etablissements = new ArrayList<>();
    private List<UniteEnseignement> uniteEnseignements = new ArrayList<>();
    
    public Parcours() {
    
    }
    
    public Parcours(String libelle) {
        this.libelle = libelle;
    }
    
    public String getLibelle (){
        return this.libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
    public List<Etudiant> getEtudiants (){
        return this.etudiants;
    }
    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
    
    public List<Etablissement> getEtablissements (){
        return this.etablissements;
    }
    public void setEtablissements(List<Etablissement> etablissements) {
        this.etablissements = etablissements;
    }
    
    public List<UniteEnseignement> getUniteEnseignements (){
        return this.uniteEnseignements;
    }
    public void setUniteEnseignements(List<UniteEnseignement> uniteEnseignements) {
        this.uniteEnseignements = uniteEnseignements;
    }
    
    public void presenterEtablissement() {
        System.out.print(this.libelle + " --> Etablissements : ");
        for (Etablissement etablissement : etablissements) {
            System.out.print(etablissement.getLibelle() + "  ");
        }
        System.out.println();
    }
}
