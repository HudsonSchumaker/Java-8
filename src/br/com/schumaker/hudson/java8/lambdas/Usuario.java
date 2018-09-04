package br.com.schumaker.hudson.java8.lambdas;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author hudsonschumaker
 */
@Getter
@Setter
public class Usuario {

    private String nome;
    private int pontos;
    private boolean moderador;

    public Usuario(String nome, int pontos) {
        this.pontos = pontos;
        this.nome = nome;
        this.moderador = false;
    }

    public void tornaModerador() {
        this.moderador = true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", pontos=" + pontos + ", moderador=" + moderador + '}';
    }
}
