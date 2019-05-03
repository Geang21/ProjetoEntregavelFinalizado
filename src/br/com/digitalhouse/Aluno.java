package br.com.digitalhouse;

public class Aluno {

    private String nome;
    private String sobrenome;
    private Integer codAluno;

    public Aluno() {

    }

    public Aluno(String nome, String sobrenome, Integer codAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codAluno = codAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(Integer codAluno) {
        this.codAluno = codAluno;
    }

    @Override
    public boolean equals(Object novoAluno) {

        if (!(novoAluno instanceof Aluno)) {
            return false;
        }
        if (((Aluno) novoAluno).getCodAluno() == this.codAluno) {
            return true;
        }
        return false;
    }
}
