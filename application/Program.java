package com.joao.application;

import com.joao.entities.Disciplina;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Disciplina teste = new Disciplina("História", 1, 10);

        teste.processarHoras();
        System.out.printf("Quantidade total de horas de estudo: %.2f horas \n", teste.getTempoTotal());
        System.out.printf("Tempo de revisão: %.2f horas\n", teste.getTempoRevisao());
        System.out.printf("Tempo de estudo: %.2f horas\n", teste.getTempoEstudo());
        System.out.printf("Tempo de resolução de exercícios: %.2f horas\n", teste.getTempoExercicios());
    }
}
