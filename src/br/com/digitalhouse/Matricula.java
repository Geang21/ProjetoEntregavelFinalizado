package br.com.digitalhouse;

import java.sql.Date;

public class Matricula {

    private Aluno novoAluno;
    private Curso novoCurso;
    private Date dataDoDia;

    public Matricula() {

    }

    public Matricula(Aluno novoAluno, Curso novoCurso) {
        this.novoAluno = novoAluno;
        this.novoCurso = novoCurso;
    }

    public Aluno getNovoAluno() {
        return novoAluno;
    }

    public void setNovoAluno(Aluno novoAluno) {
        this.novoAluno = novoAluno;
    }

    public Curso getNovoCurso() {
        return novoCurso;
    }

    public void setNovoCurso(Curso novoCurso) {
        this.novoCurso = novoCurso;
    }

    public Date getDataDoDia() {
        return dataDoDia;
    }

    public void setDataDoDia(Date dataDoDia) {
        this.dataDoDia = dataDoDia;
    }
}
