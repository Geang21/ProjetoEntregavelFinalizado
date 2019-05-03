package br.com.digitalhouse;

import java.sql.Date;
import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {


        //Professor Titular

        ProfessorTitular professorTitular1 = new ProfessorTitular("Paulo","Soares",0,123,"Java");
        ProfessorTitular professorTitular2 = new ProfessorTitular("Pedro","Freitas",0,124,"PHP");

        //Professor Adjunto

        ProfessorAdjunto professorAdjunto1 = new ProfessorAdjunto("Paula","Cristina",0,125,0);
        ProfessorAdjunto professorAdjunto2 = new ProfessorAdjunto("Camila","Santos",0,126,0);

        // Classe Digital House Manager

        DigitalHouseManager manager = new DigitalHouseManager();




        //Cursos

        Curso fullstack = new Curso("Full Stack",20001,professorTitular1,professorAdjunto1,3);
        Curso android = new Curso("Mobile - Android",20002,professorTitular2,professorAdjunto2,2);

        //Alunos

        Aluno aluno1 = new Aluno("Gean","Almeida", 100);
        Aluno aluno2 = new Aluno("Fernando","Freitas", 101);
        Aluno aluno3 = new Aluno("Cesar","Santos", 102);
        Aluno aluno4 = new Aluno("Larissa","Soares", 103);
        Aluno aluno5 = new Aluno("Aline","Cristina", 104);

        //Incluir alunos nas listas
        manager.matricularAluno(aluno1);
        manager.matricularAluno(aluno2);
        manager.matricularAluno(aluno3);
        manager.matricularAluno(aluno4);
        manager.matricularAluno(aluno5);

        //Matriculas

        Matricula matricula1 = new Matricula(aluno1,android);
        Matricula matricula3 = new Matricula(aluno2,fullstack);
        Matricula matricula2 = new Matricula(aluno3,android);
        Matricula matricula4 = new Matricula(aluno4,fullstack);
        Matricula matricula5 = new Matricula(aluno5,fullstack);

        //Lista Matricula

        manager.matricularAluno(matricula1);
        manager.matricularAluno(matricula2);
        manager.matricularAluno(matricula3);
        manager.matricularAluno(matricula4);
        manager.matricularAluno(matricula5);


        //Incluir alunos nos cursos
        android.adicionarUmAluno(aluno1);
        android.adicionarUmAluno(aluno3);
        android.adicionarUmAluno(aluno5);

        fullstack.adicionarUmAluno(aluno4);
        fullstack.adicionarUmAluno(aluno2);
        fullstack.adicionarUmAluno(aluno5);

        manager.registrarCurso(android);
        manager.registrarCurso(fullstack);

        android.excluirAluno(aluno5);

        manager.excluirCurso(20002);

        manager.consultarLista();
    }
}
