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
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;
    
    protected abstract void ganharExp();

    public Pessoa(String nome, int idade, String sexo, float experiencia) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = experiencia;
    }
    
    
}
