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
public class Orcamento {
    private int idOrcamento;
    private LocalDate dtAprovacao;
    private Engenheiro engenheiroResponsavel;
    private List<OrcamentoObra> obras = new ArrayList<>();

    public Orcamento() { }
    public Orcamento(int idOrcamento,LocalDate dtAprovacao,Engenheiro engenheiroResponsavel){
        this.idOrcamento=idOrcamento;this.dtAprovacao=dtAprovacao;this.engenheiroResponsavel=engenheiroResponsavel;
    }
    public int getIdOrcamento(){return idOrcamento;}
    public void setIdOrcamento(int idOrcamento){this.idOrcamento=idOrcamento;}
    public LocalDate getDtAprovacao(){return dtAprovacao;}
    public void setDtAprovacao(LocalDate dtAprovacao){this.dtAprovacao=dtAprovacao;}
    public Engenheiro getEngenheiroResponsavel(){return engenheiroResponsavel;}
    public void setEngenheiroResponsavel(Engenheiro engenheiroResponsavel){this.engenheiroResponsavel=engenheiroResponsavel;}
    public List<OrcamentoObra> getObras(){return obras;}
    public void setObras(List<OrcamentoObra> obras){this.obras=obras;}
}