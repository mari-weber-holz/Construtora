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
public class Obra{
    private int idObra;
    private String descricao;
    private LocalDate dtInicio;
    private LocalDate dtFim;
    private Engenheiro engenheiroResponsavel;
    private String nrCrea;
    private LocalDate dtAdmissaoEngenheiro;
    private List<ObraEngenheiro> engenheirosEnvolvidos = new ArrayList<>();
    private List<ObraFase> fases = new ArrayList<>();

    public Obra() { }
    public Obra(int idObra,String descricao,LocalDate dtInicio,LocalDate dtFim,
                Engenheiro engenheiroResponsavel,String nrCrea,LocalDate dtAdmissaoEngenheiro){
        this.idObra=idObra;this.descricao=descricao;this.dtInicio=dtInicio;this.dtFim=dtFim;
        this.engenheiroResponsavel=engenheiroResponsavel;this.nrCrea=nrCrea;this.dtAdmissaoEngenheiro=dtAdmissaoEngenheiro;
    }
    
    public int getIdObra(){return idObra;}
    public void setIdObra(int idObra){this.idObra=idObra;}
    public String getDescricao(){return descricao;}
    public void setDescricao(String descricao){this.descricao=descricao;}
    public LocalDate getDtInicio(){return dtInicio;}
    public void setDtInicio(LocalDate dtInicio){this.dtInicio=dtInicio;}
    public LocalDate getDtFim(){return dtFim;}
    public void setDtFim(LocalDate dtFim){this.dtFim=dtFim;}
    public Engenheiro getEngenheiroResponsavel(){return engenheiroResponsavel;}
    public void setEngenheiroResponsavel(Engenheiro engenheiroResponsavel){this.engenheiroResponsavel=engenheiroResponsavel;}
    public String getNrCrea(){return nrCrea;}
    public void setNrCrea(String nrCrea){this.nrCrea=nrCrea;}
    public LocalDate getDtAdmissaoEngenheiro(){return dtAdmissaoEngenheiro;}
    public void setDtAdmissaoEngenheiro(LocalDate dtAdmissaoEngenheiro){this.dtAdmissaoEngenheiro=dtAdmissaoEngenheiro;}
    public List<ObraEngenheiro> getEngenheirosEnvolvidos(){return engenheirosEnvolvidos;}
    public void setEngenheirosEnvolvidos(List<ObraEngenheiro> engenheirosEnvolvidos){this.engenheirosEnvolvidos=engenheirosEnvolvidos;}
    public List<ObraFase> getFases(){return fases;}
    public void setFases(List<ObraFase> fases){this.fases=fases;}
}