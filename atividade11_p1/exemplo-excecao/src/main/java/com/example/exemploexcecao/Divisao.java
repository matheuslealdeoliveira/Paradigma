package com.example.exemploexcecao;

import javax.swing.*;

public class Divisao {

    public static void main(String[] args) {
        String snum1, snum2;
        int num1, num2;

        try {
            snum1 = JOptionPane.showInputDialog("Digite o primeiro número");
            snum2 = JOptionPane.showInputDialog("Digite o primeiro número");

            num1 = Integer.parseInt(snum1);
            num2 = Integer.parseInt(snum2);

            JOptionPane.showMessageDialog(null, num1 / num2);
        }
        catch (ArithmeticException erro) {
            JOptionPane.showMessageDialog(null,
                    "Divisão por zero!\n" + erro,
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
        catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null,
                    "Digite apenas númerosDivisao!\n" + erro,
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
        System.exit(0);
    }

}
