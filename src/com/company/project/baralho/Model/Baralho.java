package com.company.project.baralho.Model;

import com.company.project.baralho.Type.Naipe;
import com.company.project.baralho.Type.Valor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {

    private final List<Carta> cartas;

    //Construtor incializando o baralho
    public Baralho() {
        this.cartas = new ArrayList<Carta>();
        this.montar();
    }

    //Montando o baralho com os enums, criando cartas e adicionando à lista de cartas
    public void montar() {
        for(Naipe naipe: Naipe.values()) {
            for(Valor valor: Valor.values()) {
                cartas.add(new Carta(valor, naipe));
            }
        }
    }

    //Embaralhando a lista de cartas com o método shuffle
    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    //Exibindo as cartas do baralho
    public String exibir() {
        StringBuilder stBuilder = new StringBuilder();
        for(Carta carta: cartas) {
            stBuilder.append("Carta na posição: " + Integer.valueOf(cartas.indexOf(carta) + 1) ).append('\n');
            stBuilder.append(carta.toString()).append('\n');
        }

        return stBuilder.toString();
    }
}
