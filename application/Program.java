package com.joao.application;

import com.joao.entities.Disciplina;
import com.joao.entities.PlanoDeEstudos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Disciplina> disciplinas = new ArrayList<>();
        Disciplina teste1 = new Disciplina("História", 1, 10);
        Disciplina teste2 = new Disciplina("Geografia", 3, 12);
        Disciplina teste3 = new Disciplina("Ciências", 2, 18);
        Disciplina teste4 = new Disciplina("Português", 2, 20);
        Disciplina teste5 = new Disciplina("Matemática", 1, 10);

        teste1.processarHoras();
        teste2.processarHoras();
        teste3.processarHoras();
        teste4.processarHoras();
        teste5.processarHoras();

        /* teste.processarHoras();
        System.out.printf("Quantidade total de horas de estudo: %.2f horas \n", teste.getTempoTotal());
        System.out.printf("Tempo de revisão: %.2f horas\n", teste.getTempoRevisao());
        System.out.printf("Tempo de estudo: %.2f horas\n", teste.getTempoEstudo());
        System.out.printf("Tempo de resolução de exercícios: %.2f horas\n", teste.getTempoExercicios()); */

        PlanoDeEstudos plano = new PlanoDeEstudos(4.0, 5);
        disciplinas.add(teste1);
        disciplinas.add(teste2);
        disciplinas.add(teste3);
        disciplinas.add(teste4);
        disciplinas.add(teste5);

        plano.setDisciplinas(disciplinas);

        System.out.println(plano.getDisciplinas());
        plano.setTotalHorasPorSemana();

        plano.setTotalHoras();
        plano.setTotalSemanas();
        System.out.println(plano.getTotalHoras());
        System.out.println(plano.getTotalSemanas());
    }
}
