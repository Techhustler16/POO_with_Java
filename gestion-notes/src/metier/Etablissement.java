/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class Etablissement {
    private String code;
    private String libelle;
    private List<Parcours> parcourss = new ArrayList<>();
    
    public Etablissement() {
        
    }
    
    public Etablissement(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }
    
    public String getCode (){
        return this.code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    
    public String getLibelle (){
        return this.libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
    public List<Parcours> getParcourss (){
        return this.parcourss;
    }
    public void setParcourss(List<Parcours> parcourss) {
        this.parcourss = parcourss;
    }
    
    public void presenterParcours() {
        System.out.print(this.libelle + " --> Parcours : ");
        for (Parcours parcours : parcourss) {
            System.out.print(parcours.getLibelle() + "  ");
        }
        System.out.println();
    }
}
