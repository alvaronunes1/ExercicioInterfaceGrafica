package br.com.newton.restaurante;

public class Hamburguer {
    public String nome;

    public double valor;

    public boolean artesanal;

    public double calcular(double valor, boolean artesanal) {
        if (artesanal){
            valor +=8;
            return valor;
        }
        return valor;

    }

    public void retornarNome() {
        System.out.println(nome);
    }

}


