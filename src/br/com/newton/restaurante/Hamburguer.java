package br.com.newton.restaurante;

public class Hamburguer {
    public String nome;

    public double valor;

    public boolean artesanal;

    public double calcular(double valor, boolean artesanal) {
        if (artesanal){
            valor +=5;
            return valor;
        }
        return valor;

    }

    }


