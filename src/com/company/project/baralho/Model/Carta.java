package com.company.project.baralho.Model;

import com.company.project.baralho.Type.Naipe;
import com.company.project.baralho.Type.Valor;

public class Carta {
    private Naipe naipe;
    private Valor valor;

    public Carta() {}

    //Construtor das cartas, recebe os enums de valor e de naipe
    public Carta(Valor valor, Naipe naipe) {
        setValor(valor);
        setNaipe(naipe);
    }

    //Método para obter o naipe da carta
    public Naipe getNaipe() {
        return naipe;
    }

    //Método para setar o naipe da carta
    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    //Método para obter o valor da carta
    public Valor getValor() {
        return valor;
    }

    //Método para setar o valor da carta
    public void setValor(Valor valor) {
        this.valor = valor;
    }

    //Método para mostrar os valores da carta
    @Override
    public String toString() {

        StringBuilder stBuilder = new StringBuilder();
        stBuilder.append("Naipe da carta: " + getNaipe().name()).append(" || ");
        stBuilder.append("Valor da carta: " + getValor().name());

        return stBuilder.toString();
    }
}
