package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Observador {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600, 300);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null);
        JButton botao = new JButton("Click aqui");
        janela.add(botao);
        botao.addActionListener(e -> {
            System.out.println("Evento ocorreu!!!");
        });
        janela.setVisible(true);
    }
}
