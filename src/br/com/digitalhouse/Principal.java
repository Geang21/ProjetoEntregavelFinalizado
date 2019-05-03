package br.com.digitalhouse;


public class Principal {
    public static void main(String[] args) {

        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        //Registro Professores

        digitalHouseManager.registrarProfessorTitular("Claudio","Soares",100,"Android");
        digitalHouseManager.registrarProfessorTitular("Sandro","Freitas",01,"PHP");
        digitalHouseManager.registrarProfessorAdjunto("Tereza","Lima",200,0);
        digitalHouseManager.registrarProfessorAdjunto("Marta","Santos",201,0);

        //Registro curso

        digitalHouseManager.registrarCurso("Full Stack",20001,3);
        digitalHouseManager.registrarCurso("Android",20002,2);

        //Registro Alunos

        digitalHouseManager.registrarAluno("Gean","Almeida",1000);
        digitalHouseManager.registrarAluno("Ligia","Carraschi",1001);
        digitalHouseManager.registrarAluno("Larissa","Pedrosa",1002);
        digitalHouseManager.registrarAluno("Sandro","Sergio",1003);
        digitalHouseManager.registrarAluno("Sabrina","Frazão",1004);

        //Alocação
        digitalHouseManager.alocarProfessores(20001,100,200);
        digitalHouseManager.alocarProfessores(20002,101,201);

//        //Matriculas
//        digitalHouseManager.matricularAluno(1000,20001);
//        digitalHouseManager.matricularAluno(1001,20001);
//        digitalHouseManager.matricularAluno(1002,20002);
//        digitalHouseManager.matricularAluno(1003,20002);
//        digitalHouseManager.matricularAluno(1004,20002);

    }
}
