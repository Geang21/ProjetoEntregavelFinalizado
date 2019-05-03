package br.com.digitalhouse;

public abstract class Professor {

    private String nome;
    private String sobrenome;
    private Integer tempoDeCasa;
    private Integer codProfessor;

    public Professor() {

    }

    public Professor(String nome, String sobrenome, Integer tempoDeCasa, Integer codProfessor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoDeCasa = tempoDeCasa;
        this.codProfessor = codProfessor;
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

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public Integer getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(Integer codProfessor) {
        this.codProfessor = codProfessor;
    }

    @Override
    public boolean equals(Object novoProfessor) {
        if (!(novoProfessor instanceof Professor)){
            return false;
        }if(((Professor) novoProfessor).getCodProfessor() == this.codProfessor){
            return true;
        }
        return false;
    }
}
