package br.com.newton.restaurante;
import javax.swing.JOptionPane;

public class Restaurante {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        Hamburguer hamburguer = new Hamburguer();

        String menu = JOptionPane.showInputDialog("Informe o numero do pedido, 1-HAMBURGUER OU 2-PIZZA");

        if(menu.equals("1")){
            hamburguer.nome = JOptionPane.showInputDialog("Informe o nome:");
            hamburguer.valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor: "));
            hamburguer.artesanal = Boolean.parseBoolean(JOptionPane.showInputDialog(""));
        }

        hamburguer.calcular(hamburguer.valor, hamburguer.artesanal);



    }

}
