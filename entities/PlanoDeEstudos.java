package com.joao.entities;

import java.util.ArrayList;
import java.util.List;

public class PlanoDeEstudos {
    List<Disciplina> disciplinas = new ArrayList<>();
    Double horasPorDia;
    int diasPorSemana;
    Double totalHorasPorSemana;
    Double totalHoras;
    Double totalSemanas;



    public PlanoDeEstudos(){

    }

    public PlanoDeEstudos(Double horasPorDia, int diasPorSemana) {
        this.horasPorDia = horasPorDia;
        this.diasPorSemana = diasPorSemana;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
      this.disciplinas = disciplinas;
    }

    public Double getHorasPorDia() {
        return horasPorDia;
    }

    public void setHorasPorDia(Double horasPorDia) {
        this.horasPorDia = horasPorDia;
    }

    public int getDiasPorSemana() {
        return diasPorSemana;
    }

    public void setDiasPorSemana(int diasPorSemana) {
        this.diasPorSemana = diasPorSemana;
    }

    public Double getTotalHorasPorSemana() {
        return totalHorasPorSemana;
    }

    public void setTotalHorasPorSemana() {
        this.totalHorasPorSemana = horasPorDia * diasPorSemana;
    }

    public Double getTotalSemanas() {
        return totalSemanas;
    }

    public Double getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(){
        totalHoras = 0.0;
        for (Disciplina disc: disciplinas) {
            totalHoras += disc.getTempoTotal();
        }

    }

    public void setTotalSemanas() {


        totalSemanas = totalHoras / totalHorasPorSemana;
    }
}
