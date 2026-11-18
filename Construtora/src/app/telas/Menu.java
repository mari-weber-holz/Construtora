package app.telas;

import javax.swing.*;
import java.awt.*;
import java.util.function.Consumer;

public class Menu extends JPanel {
    public Menu(Consumer<String> navegar){setLayout(new GridBagLayout());JPanel card=Componentes.cartao();card.setLayout(new BoxLayout(card,BoxLayout.Y_AXIS));Componentes.titulos(card,"Menu Principal","");card.add(Box.createVerticalStrut(8));for(String nome:new String[]{"Fases","Engenheiros","Funções","Usuários"}){JButton b=Componentes.link(nome);b.addActionListener(e->navegar.accept(nome));card.add(b);card.add(Box.createVerticalStrut(10));}JButton sair=Componentes.link("Sair");sair.addActionListener(e->navegar.accept("login"));card.add(sair);add(card);}
}
