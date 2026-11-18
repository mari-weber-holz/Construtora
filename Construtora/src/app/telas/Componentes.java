package app.telas;

import javax.swing.*;
import java.awt.*;

public final class Componentes {
    private Componentes() {}
    public static JPanel cartao(){JPanel p=new JPanel();p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));return p;}
    public static JPanel centralizar(JPanel card){JPanel p=new JPanel(new GridBagLayout());p.add(card);return p;}
    public static void titulos(JPanel card,String titulo,String subtitulo){JLabel h1=new JLabel(titulo,SwingConstants.CENTER);h1.setAlignmentX(Component.CENTER_ALIGNMENT);card.add(h1);card.add(Box.createVerticalStrut(8));if(subtitulo!=null&&!subtitulo.isBlank()){JLabel h2=new JLabel(subtitulo,SwingConstants.CENTER);h2.setAlignmentX(Component.CENTER_ALIGNMENT);card.add(h2);card.add(Box.createVerticalStrut(10));}}
    public static void linhaCampo(JPanel card,String texto,JComponent campo){JPanel row=new JPanel(new FlowLayout(FlowLayout.CENTER,10,0));row.setAlignmentX(Component.CENTER_ALIGNMENT);JLabel label=new JLabel(texto);campo.setPreferredSize(new Dimension(220,24));campo.setMaximumSize(new Dimension(220,24));row.add(label);row.add(campo);card.add(row);card.add(Box.createVerticalStrut(12));}
    public static JButton link(String texto){JButton b=new JButton(texto);b.setAlignmentX(Component.CENTER_ALIGNMENT);return b;}
    public static JButton acao(String texto){return new JButton(texto);}
    public static JButton secundaria(String texto){return new JButton(texto);}
}
