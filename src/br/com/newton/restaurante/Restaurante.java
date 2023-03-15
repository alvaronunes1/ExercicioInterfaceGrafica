package br.com.newton.restaurante;
import javax.swing.JOptionPane;

public class Restaurante {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        Hamburguer hamburguer = new Hamburguer();


        String menu = JOptionPane.showInputDialog("Informe o numero do pedido \n 1 - HAMBURGUER \n 2 - PIZZA \n 3 - SAIR");

        if(menu.equals("1")){
            hamburguer.nome = JOptionPane.showInputDialog("Informe o nome:");
            hamburguer.valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor: "));
            hamburguer.artesanal = Boolean.parseBoolean(JOptionPane.showInputDialog("Sim/Nao"));
            JOptionPane.showInputDialog(null, "O seu pedido ficou no valor de: " +hamburguer.calcular(hamburguer.valor, hamburguer.artesanal), "Resultado", JOptionPane.QUESTION_MESSAGE);hamburguer.retornarNome();
        }

        if(menu.equals("2")){
            pizza.nome = JOptionPane.showInputDialog("Informe o nome:");
            pizza.valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor: "));
            pizza.borda = Boolean.parseBoolean(JOptionPane.showInputDialog("Sim/Nao"));
            JOptionPane.showInputDialog(null, "O seu pedido ficou no valor de: " +pizza.calcular(pizza.valor, pizza.borda), "Resultado", JOptionPane.QUESTION_MESSAGE);


        }




    }

}
