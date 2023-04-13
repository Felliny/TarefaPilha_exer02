package View;

import Controller.FatController;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int valor= Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 até 10"));
        while (valor < 1 || valor > 10){
            JOptionPane.showMessageDialog(null, "Número inválido!");
            valor= Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 até 10"));
        }
        System.out.println("Número escolhido: "+ valor);

        FatController calcfat= new FatController();

        System.out.println("Fatorial: "+ calcfat.CalcFatorial(valor));
    }
}
