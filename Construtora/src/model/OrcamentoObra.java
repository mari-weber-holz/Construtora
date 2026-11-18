/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author mariana.holz
 */
public class OrcamentoObra {
    private Orcamento orcamento;
    private Obra obra;
    private LocalDate dtInicio;
    private LocalDate dtFim;
    private BigDecimal vlPrevisto=BigDecimal.ZERO;
    private BigDecimal vlRealizado=BigDecimal.ZERO;

    public OrcamentoObra() { }
    public OrcamentoObra(Orcamento orcamento,Obra obra,LocalDate dtInicio,LocalDate dtFim,
                         BigDecimal vlPrevisto,BigDecimal vlRealizado){
        this.orcamento=orcamento;this.obra=obra;this.dtInicio=dtInicio;this.dtFim=dtFim;
        this.vlPrevisto=vlPrevisto;this.vlRealizado=vlRealizado;
    }
    
    public Orcamento getOrcamento(){return orcamento;}
    public void setOrcamento(Orcamento orcamento){this.orcamento=orcamento;}
    public Obra getObra(){return obra;}
    public void setObra(Obra obra){this.obra=obra;}
    public LocalDate getDtInicio(){return dtInicio;}
    public void setDtInicio(LocalDate dtInicio){this.dtInicio=dtInicio;}
    public LocalDate getDtFim(){return dtFim;}
    public void setDtFim(LocalDate dtFim){this.dtFim=dtFim;}
    public BigDecimal getVlPrevisto(){return vlPrevisto;}
    public void setVlPrevisto(BigDecimal vlPrevisto){this.vlPrevisto=vlPrevisto;}
    public BigDecimal getVlRealizado(){return vlRealizado;}
    public void setVlRealizado(BigDecimal vlRealizado){this.vlRealizado=vlRealizado;}
}