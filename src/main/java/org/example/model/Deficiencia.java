package org.example.model;

import org.example.model.enums.CategoriaDeficiencia;

public class Deficiencia {
    private String nome;
    private CategoriaDeficiencia categoria;

    public Deficiencia(String nome, CategoriaDeficiencia categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaDeficiencia getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDeficiencia categoria) {
        this.categoria = categoria;
    }
}
