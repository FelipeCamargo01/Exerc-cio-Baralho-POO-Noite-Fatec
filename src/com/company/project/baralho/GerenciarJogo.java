/**
 * @author Luiz Felipe Camargo de Oliveira
 */

package com.company.project.baralho;

import com.company.project.baralho.Model.Baralho;

public class GerenciarJogo {

    private Baralho baralho;

    public static void main(String[] args) {
	    //Inicializando o baralho
        Baralho baralho = new Baralho();

        //Mostrando o baralho após ter sido embaralhado
        System.out.println("Baralho embaralhado: ");
	    baralho.embaralhar();
        System.out.println(baralho.exibir());
    }
}
