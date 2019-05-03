package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listaAluno = new ArrayList<>();
    private List<Professor> listaProfessor = new ArrayList<>();
    private List<Curso> listaCurso = new ArrayList<>();
    private List<Matricula> listaMatricula = new ArrayList<>();

//    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {
//    }

    public void registrarCurso(Curso curso) {
        this.listaCurso.add(curso);
    }

    public void excluirCurso(Integer codigoCurso) {
        for (Curso curso : listaCurso) {
            if (curso.equals(codigoCurso)) {
                this.listaCurso.remove(curso.getCodCurso());
                System.out.println("Curso Removido");
            }
        }
    }


    public void registrarProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.listaProfessor.add(professorAdjunto);

    }

    public void registrarProfessorTitular(ProfessorTitular professorTitular) {
        this.listaProfessor.add(professorTitular);
    }

    public void excluirProfessor(Integer codigoProfessor) {
        for (Professor professor : listaProfessor) {
            if (professor.equals(codigoProfessor)) {
                this.listaProfessor.remove(professor.getCodProfessor());
                System.out.println("Professor Removido");
            }
        }
    }

    public void matricularAluno(Aluno aluno) {
        this.listaAluno.add(aluno);
    }

    public void matricularAluno(Matricula matricula) {
        this.listaMatricula.add(matricula);
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {

    }

    public void consultarLista() {
        for (Curso curso : listaCurso) {
            System.out.println(curso.getCodCurso());
        }
    }


}

