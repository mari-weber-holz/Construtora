package app.telas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.function.Consumer;

public class Consulta extends JPanel {
    public Consulta(String entidade,Consumer<String> navegar){setLayout(new GridBagLayout());JPanel card=Componentes.cartao();card.setLayout(new BoxLayout(card,BoxLayout.Y_AXIS));Componentes.titulos(card,"Consulta de "+entidade,"");Object[][] dados;String[] colunas;
        switch(entidade){case "Engenheiros"->{colunas=new String[]{"Código","Nome","CREA","Data de admissão"};dados=new Object[][]{{"1","Ana Paula Martins","CREA-SP 123456","2021-03-15"},{"2","Rafael Costa Lima","CREA-SP 456789","2023-08-01"}};}case "Usuários"->{colunas=new String[]{"Código","Nome","E-mail"};dados=new Object[][]{{"1","Laura Castro","laura@balanca.com"},{"2","Marcos Oliveira","marcos@balanca.com"}};}case "Funções"->{colunas=new String[]{"Código","Descrição da Função"};dados=new Object[][]{{"1","Engenheiro civil"},{"2","Mestre de obras"}};}default->{colunas=new String[]{"Código","Descrição da Fase"};dados=new Object[][]{{"1","Planejamento"},{"2","Fundação"},{"3","Estrutura"}};}}
        card.add(Box.createVerticalStrut(10));JTable tabela=new JTable(new DefaultTableModel(dados,colunas){public boolean isCellEditable(int r,int c){return false;}});JScrollPane scroll=new JScrollPane(tabela);scroll.setPreferredSize(new Dimension(430,120));card.add(scroll);card.add(Box.createVerticalStrut(12));JButton voltar=Componentes.link("Voltar");voltar.addActionListener(e->navegar.accept(entidade));voltar.setAlignmentX(Component.CENTER_ALIGNMENT);card.add(voltar);add(card);}
}
