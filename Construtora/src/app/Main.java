package app;

import app.telas.*;
import javax.swing.*;
import java.awt.CardLayout;
import java.awt.Dimension;

public class Main {
    private final JFrame janela = new JFrame("Construtora Balança-Mas-Não-Cai");
    private final CardLayout layout = new CardLayout();
    private final JPanel telas = new JPanel(layout);

    public static void main(String[] args) { SwingUtilities.invokeLater(() -> new Main().abrir()); }

    private Main() {
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janela.setSize(600, 450); janela.setMinimumSize(new Dimension(520, 400)); janela.setLocationRelativeTo(null);
        telas.add(new Login(this::mostrar), "login");
        telas.add(new Menu(this::mostrar), "menu");
        telas.add(new Fases(this::mostrar), "Fases");
        telas.add(new Engenheiros(this::mostrar), "Engenheiros");
        telas.add(new Funcoes(this::mostrar), "Funções");
        telas.add(new Usuarios(this::mostrar), "Usuários");
        for (String entidade : new String[]{"Fases","Engenheiros","Funções","Usuários"}) {
            telas.add(new Formulario(entidade,"Inclui",this::mostrar),"novo:"+entidade);
            telas.add(new Formulario(entidade,"Altera",this::mostrar),"altera:"+entidade);
            telas.add(new Consulta(entidade,this::mostrar),"consulta:"+entidade);
            telas.add(new Exclusao(entidade,this::mostrar),"exclui:"+entidade);
        }
        janela.setContentPane(telas);
    }

    private void abrir() { janela.setVisible(true); mostrar("login"); }
    private void mostrar(String tela) { layout.show(telas,tela); }
}
