package app.telas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.function.Consumer;

public class Exclusao extends JPanel {
    public Exclusao(String entidade,Consumer<String> navegar){setLayout(new GridBagLayout());JPanel card=Componentes.cartao();card.setLayout(new BoxLayout(card,BoxLayout.Y_AXIS));Componentes.titulos(card,"Excluir "+entidade,"");card.add(Box.createVerticalStrut(10));Object[][] dados={{"1",amostra(entidade)},{"2",segunda(entidade)}};String[] colunas={"Código","Registro"};JTable tabela=new JTable(new DefaultTableModel(dados,colunas){public boolean isCellEditable(int r,int c){return false;}});JScrollPane scroll=new JScrollPane(tabela);scroll.setPreferredSize(new Dimension(430,120));card.add(scroll);card.add(Box.createVerticalStrut(12));JPanel botoes=new JPanel(new FlowLayout(FlowLayout.CENTER,12,6));botoes.add(Componentes.acao("Excluir"));JButton voltar=Componentes.secundaria("Voltar");voltar.addActionListener(e->navegar.accept(entidade));botoes.add(voltar);card.add(botoes);add(card);}
    private String amostra(String e){return switch(e){case "Engenheiros"->"Ana Paula Martins";case "Usuários"->"Laura Castro";case "Funções"->"Engenheiro civil";default->"Planejamento";};}
    private String segunda(String e){return switch(e){case "Engenheiros"->"Rafael Costa Lima";case "Usuários"->"Marcos Oliveira";case "Funções"->"Mestre de obras";default->"Fundação";};}
}
