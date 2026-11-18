package app.telas;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Formulario extends JPanel {
    public Formulario(String entidade,String operacao,Consumer<String> navegar){setLayout(new GridBagLayout());JPanel card=Componentes.cartao();card.setLayout(new BoxLayout(card,BoxLayout.Y_AXIS));Componentes.titulos(card,operacao+" "+singular(entidade),"");List<JTextField> campos=new ArrayList<>();
        if(entidade.equals("Engenheiros")){adicionar(card,campos,"Nome do Engenheiro",operacao.equals("Altera")?"Ana Paula Martins":"");adicionar(card,campos,"CREA",operacao.equals("Altera")?"CREA-SP 123456":"");adicionar(card,campos,"Data de Admissão",operacao.equals("Altera")?"2021-03-15":"");}
        else if(entidade.equals("Usuários")){adicionar(card,campos,"Nome",operacao.equals("Altera")?"Laura Castro":"");adicionar(card,campos,"E-mail",operacao.equals("Altera")?"laura@balanca.com":"");Componentes.linhaCampo(card,"Senha",new JPasswordField(24));}
        else {String campo=entidade.equals("Fases")?"Descrição da Fase":"Descrição da Função";String exemplo=entidade.equals("Fases")?"Fundação":"Engenheiro civil";adicionar(card,campos,campo,operacao.equals("Altera")?exemplo:"");}
        card.add(Box.createVerticalStrut(4));JPanel a=new JPanel(new FlowLayout(FlowLayout.CENTER,12,6));a.add(Componentes.acao(operacao));JButton limpar=Componentes.secundaria("Limpar");limpar.addActionListener(e->campos.forEach(c->c.setText("")));a.add(limpar);JButton voltar=Componentes.secundaria("Voltar");voltar.addActionListener(e->navegar.accept(entidade));a.add(voltar);card.add(a);add(card);}
    private void adicionar(JPanel card,List<JTextField> campos,String label,String texto){JTextField campo=new JTextField(texto,24);campos.add(campo);Componentes.linhaCampo(card,label,campo);}
    private String singular(String e){return switch(e){case "Engenheiros"->"Engenheiro";case "Funções"->"Função";case "Usuários"->"Usuário";default->"Fase";};}
}
