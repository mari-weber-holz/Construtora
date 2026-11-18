package app.telas;

import javax.swing.*;
import java.awt.*;
import java.util.function.Consumer;

public class Login extends JPanel {
    public Login(Consumer<String> navegar){setLayout(new GridBagLayout());JPanel card=Componentes.cartao();Componentes.titulos(card,"Construtora Balança-Mas-Não-Cai","Acesso ao Sistema");card.add(Box.createVerticalStrut(8));JTextField usuario=new JTextField();JPasswordField senha=new JPasswordField();Componentes.linhaCampo(card,"Usuário",usuario);Componentes.linhaCampo(card,"Senha",senha);card.add(Box.createVerticalStrut(4));JPanel botoes=new JPanel(new FlowLayout(FlowLayout.CENTER,12,6));botoes.setAlignmentX(Component.CENTER_ALIGNMENT);JButton entrar=Componentes.acao("Entrar"),apagar=Componentes.secundaria("Apagar");entrar.addActionListener(e->navegar.accept("menu"));apagar.addActionListener(e->{usuario.setText("");senha.setText("");});botoes.add(entrar);botoes.add(apagar);card.add(botoes);add(card);}
}
