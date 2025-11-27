package model;

public class Disciplina {
    private String nomeDisciplina;
    private int IdDisciplina;
    private int cargaHoraria;

    private Professor professor;


    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getIdDisciplina() {
        return IdDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        IdDisciplina = idDisciplina;
    }
}

