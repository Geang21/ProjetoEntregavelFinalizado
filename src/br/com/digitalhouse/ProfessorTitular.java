package br.com.digitalhouse;

public class ProfessorTitular extends Professor {

    private String especilista;

    public ProfessorTitular() {

    }

    public ProfessorTitular(String nome, String sobrenome, Integer tempoDeCasa, Integer codProfessor, String especilista) {
        super(nome, sobrenome, tempoDeCasa, codProfessor);
        this.especilista = especilista;
    }

    public String getEspecilista() {
        return especilista;
    }

    public void setEspecilista(String especilista) {
        this.especilista = especilista;
    }
}
