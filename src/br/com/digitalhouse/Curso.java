package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private Integer codCurso;
    private ProfessorTitular novoProfessorTitular;
    private ProfessorAdjunto novoProfessorAdjunto;
    private Integer qtdaMaxAluno;
    private List<Aluno> listaALunoCurso = new ArrayList<>();

    public Curso() {

    }

    public Curso(String nome, Integer codCurso, ProfessorTitular novoProfessorTitular, ProfessorAdjunto novoProfessorAdjunto, Integer qtdaMaxAluno) {
        this.nome = nome;
        this.codCurso = codCurso;
        this.novoProfessorTitular = novoProfessorTitular;
        this.novoProfessorAdjunto = novoProfessorAdjunto;
        this.qtdaMaxAluno = qtdaMaxAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(Integer codCurso) {
        this.codCurso = codCurso;
    }

    public ProfessorTitular getNovoProfessorTitular() {
        return novoProfessorTitular;
    }

    public void setNovoProfessorTitular(ProfessorTitular novoProfessorTitular) {
        this.novoProfessorTitular = novoProfessorTitular;
    }

    public ProfessorAdjunto getNovoProfessorAdjunto() {
        return novoProfessorAdjunto;
    }

    public void setNovoProfessorAdjunto(ProfessorAdjunto novoProfessorAdjunto) {
        this.novoProfessorAdjunto = novoProfessorAdjunto;
    }

    public Integer getQtdaMaxAluno() {
        return qtdaMaxAluno;
    }

    public void setQtdaMaxAluno(Integer qtdaMaxAluno) {
        this.qtdaMaxAluno = qtdaMaxAluno;
    }

    @Override
    public boolean equals(Object novoCurso) {
        if (!(novoCurso instanceof Curso)) {
            return false;
        }
        if (((Curso) novoCurso).getCodCurso() == this.codCurso) {
            return true;
        }
        return false;
    }

    public Boolean adicionarUmAluno(Aluno umAluno) {
        if (listaALunoCurso.size() < this.qtdaMaxAluno) {
            this.listaALunoCurso.add(umAluno);
            System.out.println("Aluno Matriculado");
            return true;
        } else {
            System.out.println("Aluno não pode ser matriculado pois não há mais vagas !");
            return false;
        }
    }

    public void excluirAluno(Aluno umAluno) {
        for (Aluno aluno : listaALunoCurso) {
            if (aluno.equals(umAluno)) {
                listaALunoCurso.remove(aluno);
                System.out.println("Aluno Removido");
            } else {

            }
        }
        System.out.println("Aluno localizado.");
    }
}
