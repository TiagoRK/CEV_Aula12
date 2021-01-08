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
public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    @Override
    public void play() {
        if (this.isReproduzindo() == false){
            System.out.println("Video começou a reproduzir!");
            this.setReproduzindo(true);
        } else{
            System.out.println("O video já está reproduzindo!");
        }
    }

    @Override
    public void pause() {
        if (this.isReproduzindo() == true){
            System.out.println("O video foi pausado!");
            this.setReproduzindo(false);
        } else{
            System.out.println("O video já está pausado!");
        }
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas()+1);
    }

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    
}
