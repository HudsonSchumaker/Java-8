package br.com.schumaker.hudson.java8.lambdas;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author hudson schumaker
 */

//Anotações Lombok
@Getter
@Setter
public class Usuario {
    private String nome;
    private int pontos;
    private boolean moderador;

    public Usuario(){
    }
    
    public Usuario(String nome){
        this.nome = nome;
    }
    
    public Usuario(String nome, int pontos) {
        this.pontos = pontos;
        this.nome = nome;
        this.moderador = false;
    }
    
    public Usuario(String nome, int pontos, boolean isModerador){
        this.nome = nome;
        this.pontos = pontos;
        this.moderador = isModerador;
    }
    
    public void tornaModerador() {
        this.moderador = true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", pontos=" + pontos + ", moderador=" + moderador + '}';
    }
}