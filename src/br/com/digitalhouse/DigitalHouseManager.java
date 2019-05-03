package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listaAluno = new ArrayList<>();
    private List<ProfessorTitular> listaProfessorTitular = new ArrayList<>();
    private List<ProfessorAdjunto> listaProfessorAdjunto = new ArrayList<>();
    private List<Curso> listaCurso = new ArrayList<>();
    private List<Matricula> listaMatricula = new ArrayList<>();

    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private Curso curso;
    private Aluno aluno;

    public void registrarCurso(String nome, Integer codCurso,Integer qtdaMaxAluno){
        Curso novoCurso = new Curso(nome,codCurso,qtdaMaxAluno,null,null,null);
        listaCurso.add(novoCurso);
    }

    public void excluirCurso(Curso umCurso){
        for(Curso curso:listaCurso){
            if(curso.equals(umCurso)){
                listaCurso.remove(curso);
            }
        }
    }

    public void registrarProfessorAdjunto(String nome,String sobrenome, Integer codigoProfessor,Integer quantidadeDeHoras){
        ProfessorAdjunto novoProfessorAdjunto = new ProfessorAdjunto(nome, sobrenome,0,codigoProfessor,quantidadeDeHoras);
        listaProfessorAdjunto.add(novoProfessorAdjunto);
    }

    public void registrarProfessorTitular(String nome,String sobrenome,Integer codigoProfessor,String especialidade){
        ProfessorTitular novoProfessorTitular = new ProfessorTitular(nome,sobrenome,0,codigoProfessor,especialidade);
        listaProfessorTitular.add(novoProfessorTitular);
    }

    public void excluirProfessor(Professor umProfessor){
        for(Professor professor:listaProfessorTitular){
            if(professor.equals(umProfessor)){
                listaProfessorTitular.remove(umProfessor);
            }
        }

        for(Professor professor:listaProfessorAdjunto){
            if(professor.equals(umProfessor)){
                listaProfessorAdjunto.remove(umProfessor);
            }
        }
    }

    public void registrarAluno(String nome,String sobrenome, Integer codigoAluno){
        Aluno novoAluno = new Aluno(nome,sobrenome,codigoAluno);
        listaAluno.add(novoAluno);
    }

    public void alocarProfessores(Integer codigoCurso,Integer codigoProfessorTitular,Integer codigoProfessorAdjunto) {
        for (ProfessorTitular professorTitular : listaProfessorTitular) {
            if (professorTitular.getCodProfessor() == codigoProfessorTitular) {
                this.professorTitular = professorTitular;
            }
        }

        for (ProfessorAdjunto professorAdjunto : listaProfessorAdjunto) {
            if (professorAdjunto.getCodProfessor() == codigoProfessorAdjunto) {
                this.professorAdjunto = professorAdjunto;
            }
        }

        for (Curso curso : listaCurso) {
            if (curso.getCodCurso() == codigoCurso) {
                curso.setNovoProfTitular(this.professorTitular);
            }

            if (curso.getCodCurso() == codigoCurso) {
                curso.setNovoProfAdjunto(this.professorAdjunto);
            }
        }
    }
    public void matricularAluno(Integer codigoAluno,Integer codigoCurso){
        for (Curso curso : listaCurso) {
            if (curso.getCodCurso() == codigoCurso) {
                this.curso = curso;
            }
        }

        for (Aluno aluno : listaAluno) {
            if (aluno.getCodAluno() == codigoAluno) {
                this.aluno = aluno;
            }
        }

        if(this.curso.getListaAlunosMatriculados().size() < this.curso.getMaxQtdeAlunos()){
            Matricula novaMatricula = new Matricula(this.aluno,this.curso);
            listaMatricula.add(novaMatricula);
            System.out.println("A matrícula foi realizada com sucesso");
        }else{
            System.out.printf("Não há mais vagas disponíveis!");
        }
    }


}