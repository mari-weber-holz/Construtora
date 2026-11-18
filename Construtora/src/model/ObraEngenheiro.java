/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mariana.holz
 */
public class ObraEngenheiro {
    private Obra obra;
    private Engenheiro engenheiro;
    private LocalDate dtAdmissaoEngenheiro;
    private LocalDate dtInicioTrabalho;
    private LocalDate dtFimTrabalho;
    private Funcao funcao;

    public ObraEngenheiro() { }
    public ObraEngenheiro(Obra obra,Engenheiro engenheiro,LocalDate dtAdmissaoEngenheiro,
                          LocalDate dtInicioTrabalho,LocalDate dtFimTrabalho,Funcao funcao){
        this.obra=obra;this.engenheiro=engenheiro;this.dtAdmissaoEngenheiro=dtAdmissaoEngenheiro;
        this.dtInicioTrabalho=dtInicioTrabalho;this.dtFimTrabalho=dtFimTrabalho;this.funcao=funcao;
    }
    
    public Obra getObra(){return obra;}
    public void setObra(Obra obra){this.obra=obra;}
    public Engenheiro getEngenheiro(){return engenheiro;}
    public void setEngenheiro(Engenheiro engenheiro){this.engenheiro=engenheiro;}
    public LocalDate getDtAdmissaoEngenheiro(){return dtAdmissaoEngenheiro;}
    public void setDtAdmissaoEngenheiro(LocalDate dtAdmissaoEngenheiro){this.dtAdmissaoEngenheiro=dtAdmissaoEngenheiro;}
    public LocalDate getDtInicioTrabalho(){return dtInicioTrabalho;}
    public void setDtInicioTrabalho(LocalDate dtInicioTrabalho){this.dtInicioTrabalho=dtInicioTrabalho;}
    public LocalDate getDtFimTrabalho(){return dtFimTrabalho;}
    public void setDtFimTrabalho(LocalDate dtFimTrabalho){this.dtFimTrabalho=dtFimTrabalho;}
    public Funcao getFuncao(){return funcao;}
    public void setFuncao(Funcao funcao){this.funcao=funcao;}
}