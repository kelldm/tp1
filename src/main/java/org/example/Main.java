package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static org.example.CalculaMatriz.*;


public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("TP1 Java // MATRIZES");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600, 600);

        JPanel main = new JPanel();
        main.setLayout(null);
        window.add(main);

        JPanel matrizA = new JPanel();
        matrizA.setLayout(new GridLayout(3, 2));
        JLabel labelA = new JLabel("Matriz A:");
        JTextField a11 = new JTextField(2);
        JTextField a12 = new JTextField(2);
        JTextField a21 = new JTextField(2);
        JTextField a22 = new JTextField(2);

        matrizA.add(labelA);
        matrizA.add(new JLabel());
        matrizA.add(a11);
        matrizA.add(a12);
        matrizA.add(a21);
        matrizA.add(a22);
        matrizA.setBounds(50, 50, 100, 100);
        main.add(matrizA);

        JPanel matrizB = new JPanel();
        matrizB.setLayout(new GridLayout(3, 2));
        JLabel labelB = new JLabel("Matriz B:");
        JTextField b11 = new JTextField(2);
        JTextField b12 = new JTextField(2);
        JTextField b21 = new JTextField(2);
        JTextField b22 = new JTextField(2);

        matrizB.add(labelB);
        matrizB.add(new JLabel());
        matrizB.add(b11);
        matrizB.add(b12);
        matrizB.add(b21);
        matrizB.add(b22);
        matrizB.setBounds(250, 50, 100, 100);
        main.add(matrizB);

        JPanel matrizC = new JPanel();
        matrizC.setLayout(new GridLayout(3, 2));
        JLabel labelC = new JLabel("Matriz C:");
        JTextField c11 = new JTextField(2);
        JTextField c12 = new JTextField(2);
        JTextField c21 = new JTextField(2);
        JTextField c22 = new JTextField(2);

        matrizC.add(labelC);
        matrizC.add(new JLabel());
        matrizC.add(c11);
        matrizC.add(c12);
        matrizC.add(c21);
        matrizC.add(c22);
        matrizC.setBounds(450, 50, 100, 100);
        main.add(matrizC);

        JPanel kPanel = new JPanel();
        JLabel labelK = new JLabel("K:");
        JTextField k = new JTextField(2);
        kPanel.add(labelK);
        kPanel.add(k);
        kPanel.setBounds(220, 220, 100, 50);
        main.add(kPanel);

        JPanel buttons = new JPanel();
        buttons.setLayout(new FlowLayout());
        buttons.setBounds(85, 300, 400, 100);

        JButton somar = new JButton("Somar");
        somar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c11.setText(somarVal(a11.getText(), b11.getText()));
                c12.setText(somarVal(a12.getText(), b12.getText()));
                c21.setText(somarVal(a21.getText(), b21.getText()));
                c22.setText(somarVal(a22.getText(), b22.getText()));
            }
        });

        JButton subtrair = new JButton("Subtrair");
        subtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c11.setText(subtrairVal(a11.getText(), b11.getText()));
                c12.setText(subtrairVal(a12.getText(), b12.getText()));
                c21.setText(subtrairVal(a21.getText(), b21.getText()));
                c22.setText(subtrairVal(a22.getText(), b22.getText()));
            }
        });

        JButton multiplicacao = new JButton("Multiplicação");
        multiplicacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c11.setText(multiplicarVal(a11.getText(), b11.getText(), a12.getText(), b21.getText()));
                c12.setText(multiplicarVal(a11.getText(), b12.getText(), a12.getText(), b22.getText()));
                c21.setText(multiplicarVal(a21.getText(), b11.getText(), a22.getText(), b21.getText()));
                c22.setText(multiplicarVal(a21.getText(), b12.getText(), a22.getText(), b22.getText()));
            }
        });

        JButton escalar = new JButton("Escalar");
        escalar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c11.setText(escalarVal(a11.getText(), k.getText()));
                c12.setText(escalarVal(a12.getText(), k.getText()));
                c21.setText(escalarVal(a21.getText(), k.getText()));
                c22.setText(escalarVal(a22.getText(), k.getText()));
            }
        });

        buttons.add(somar);
        buttons.add(subtrair);
        buttons.add(multiplicacao);
        buttons.add(escalar);

        main.add(buttons);

        window.setVisible(true);
    }


}