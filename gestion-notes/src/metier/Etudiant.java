/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class Etudiant {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private int numeroCarte;
    private Parcours parcours;
    private List<InscriptionUE> inscriptionUEs = new ArrayList<>();
    private Ordinateur ordinateur;
    
    public Etudiant(){
        
    }
    
    public Etudiant(String nom, String prenom, LocalDate dateNaissance, int numeroCarte) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.numeroCarte = numeroCarte;
    }
    
    public float getMoyenne(){
        int sommeCredits = 0;
        float moyenneAlgebrique = 0;
        for(InscriptionUE iUE : this.inscriptionUEs){
            sommeCredits += iUE.getUniteEnseignement().getNbreCredits();
            moyenneAlgebrique += iUE.getMoyenne();
        }
        return moyenneAlgebrique/sommeCredits;
    }
    
    public static String getHeader(){
        return "N° \t Carte \t Nom \t Prenom \t Date de Naissance";
    }
    
    public void afficher(){
        System.out.println(this);
    }
    
    // Accesseurs
    public String getNom (){
        return this.nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getPrenom (){
        return this.prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public LocalDate getDateNaissance (){
        return this.dateNaissance;
    }
    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    
    public int getnumeroCarte (){
        return this.numeroCarte;
    }
    public void setnumeroCarte(int numeroCarte) {
        this.numeroCarte = numeroCarte;
    }
    
    public Parcours getParcours (){
        return this.parcours;
    }
    public void setParcours(Parcours parcours) {
        this.parcours = parcours;
    }
    
    public List<InscriptionUE> getInscriptionUEs (){
        return this.inscriptionUEs;
    }
    public void setInscriptionUEs(List<InscriptionUE> inscriptionUEs) {
        this.inscriptionUEs = inscriptionUEs;
    }
    
    public Ordinateur getEtudiant (){
        return this.ordinateur;
    }
    public void setEtudiant(Ordinateur ordinateur) {
        this.ordinateur = ordinateur;
    }

    @Override
    public String toString() {
        return this.numeroCarte + "\t" + this.nom + "\t" + this.prenom + "\t" + this.dateNaissance;
    }
    
    
}
