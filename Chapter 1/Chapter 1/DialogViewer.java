
//1.16

import javax.swing.JOptionPane;

public class DialogViewer {
    public static void main(String[] args) {
           String name = JOptionPane.showInputDialog("Enter your name");
           String greeting = JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
           System.out.println("I'm sorry, " + name + ". I'm afraid I can't do that.");
    }
}