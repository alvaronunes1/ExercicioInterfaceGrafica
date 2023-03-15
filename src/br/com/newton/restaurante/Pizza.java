package br.com.newton.restaurante;

public class Pizza {

    public String nome;

    public double valor;

    public boolean borda;

    public double calcular(double valor, boolean borda) {
        if (borda){
            valor +=5;
            return valor;
        }
        return valor;

    }

    public void retornarNome(){
        System.out.println(nome);
    }


}
