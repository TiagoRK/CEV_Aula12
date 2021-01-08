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
public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public void avaliar(){
        this.getFilme().setAvaliacao(this.getFilme().getAvaliacao()+1);
        System.out.println("Video avaliado em +1");
    }
    public void avaliar(int nota){
        this.getFilme().setAvaliacao(this.getFilme().getAvaliacao()+nota);
        System.out.println("Video avaliado em +"+nota);
    }
    public void avaliar(float porcentagem){
        int avaliacao = (int)porcentagem/10;
        this.getFilme().setAvaliacao(this.getFilme().getAvaliacao()+avaliacao);
        System.out.println("Video avaliado em +"+avaliacao);
    }
    
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
    }

    public Visualizacao() {
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    
}
