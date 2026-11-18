package app.telas;

import javax.swing.*;
import java.awt.*;
import java.util.function.Consumer;

public class MenuManutencao extends JPanel {
    protected MenuManutencao(String entidade,String singular,Consumer<String> navegar){setLayout(new GridBagLayout());JPanel card=Componentes.cartao();card.setLayout(new BoxLayout(card,BoxLayout.Y_AXIS));Componentes.titulos(card,"Manutenção de "+entidade,"");card.add(Box.createVerticalStrut(8));for(String[] item:new String[][]{{"Inclui "+singular,"novo:"+entidade},{"Consulta "+entidade,"consulta:"+entidade},{"Altera "+singular,"altera:"+entidade},{"Exclui "+singular,"exclui:"+entidade},{"Voltar","menu"}}){adicionar(card,item[0],item[1],navegar);card.add(Box.createVerticalStrut(10));}add(card);}
    private void adicionar(JPanel card,String texto,String rota,Consumer<String> navegar){JButton b=Componentes.link(texto);b.addActionListener(e->navegar.accept(rota));card.add(b);}
}
