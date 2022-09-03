package com.joao.entities;

public class Disciplina {
    private String nome;
    private int prioridade;
    private Double horasExigidas, tempoTotal, tempoRevisao, tempoExercicios, tempoEstudo;


    public Disciplina(){

    }

    public Disciplina(String nome, int prioridade, double horasExigidas) {
        this.nome = nome;
        this.prioridade = prioridade;
        this.horasExigidas = horasExigidas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public double getHorasExigidas() {
        return horasExigidas;
    }

    public void setHorasExigidas(Double horasExigidas) {
        this.horasExigidas = horasExigidas;
    }

    public double getTempoTotal() {
        
        return tempoTotal;
    }


    public void processarHoras() {
        if (horasExigidas==null){
            throw new NullPointerException("As horas exigidas pela disciplina ainda não foram informadas.");
        } else {

            switch (prioridade) {
                case 1:
                    tempoEstudo = horasExigidas * 1.2;
                    tempoRevisao = (0.15 * horasExigidas) * 1.2;
                    tempoExercicios = (0.2 * horasExigidas) * 1.2;
                    break;
                case 2:
                    tempoEstudo = horasExigidas * 1.1;
                    tempoRevisao = (0.15 * horasExigidas) * 1.1;
                    tempoExercicios = (0.2 * horasExigidas) * 1.1;
                    break;

                case 3:
                    tempoRevisao = 0.15 * horasExigidas;
                    tempoExercicios = 0.2 * horasExigidas;
                    tempoEstudo = horasExigidas;
                    break;
            }
        }

        tempoTotal = tempoEstudo + tempoExercicios + tempoRevisao;

    }

    public double getTempoRevisao() {

        return tempoRevisao;
    }



    public double getTempoExercicios() {

        return tempoExercicios;
    }


    public double getTempoEstudo() {

        return tempoEstudo;
    }

}
