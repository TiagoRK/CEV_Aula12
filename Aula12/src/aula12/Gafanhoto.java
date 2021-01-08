/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author TIAGO
 */
public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;
    
    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido()+1);
        System.out.println("Video assistido!");
    }
    @Override
    protected void ganharExp() {
        this.setExperiencia(this.getExperiencia()+1);
        System.out.println("Experiencia adquirida!");
    }

    public Gafanhoto(String nome, int idade, String sexo, float experiencia) {
        super(nome, idade, sexo, experiencia);
    }

    public Gafanhoto(String login, int totAssistido, String nome, int idade, String sexo, float experiencia) {
        super(nome, idade, sexo, experiencia);
        this.login = login;
        this.totAssistido = totAssistido;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }
    
}
