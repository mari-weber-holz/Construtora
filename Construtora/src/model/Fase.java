/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mariana.holz
 */
public class Fase {
    private int idFase;
    private String dsFase;

    public Fase() { }
    public Fase(int idFase,String dsFase){this.idFase=idFase;this.dsFase=dsFase;}
    public int getIdFase(){return idFase;}
    public void setIdFase(int idFase){this.idFase=idFase;}
    public String getDsFase(){return dsFase;}
    public void setDsFase(String dsFase){this.dsFase=dsFase;} 
}