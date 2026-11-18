/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mariana.holz
 */
public class Funcao {
    private int idFuncao;
    private String dsFuncao;

    public Funcao() { }
    public Funcao(int idFuncao,String dsFuncao){this.idFuncao=idFuncao;this.dsFuncao=dsFuncao;}
    public int getIdFuncao(){return idFuncao;}
    public void setIdFuncao(int idFuncao){this.idFuncao=idFuncao;}
    public String getDsFuncao(){return dsFuncao;}
    public void setDsFuncao(String dsFuncao){this.dsFuncao=dsFuncao;}
}
