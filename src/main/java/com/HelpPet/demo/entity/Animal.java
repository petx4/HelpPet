package com.HelpPet.demo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Double peso;
    private LocalDate dataNacimento;
    private boolean castrado;
    private String nome;
    private String raca;
    private String cor;
    private String observacoes;
    private String generoFM;
    private String especieAnimal;
    private String prazoVacinacao;

    public Animal() {
    }

    public Animal(long id, Double peso, LocalDate dataNacimento, boolean castrado, String nome, String raca, String cor, String observacoes, String generoFM, String especieAnimal, String prazoVacinacao) {
        this.id = id;
        this.peso = peso;
        this.dataNacimento = dataNacimento;
        this.castrado = castrado;
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.observacoes = observacoes;
        this.generoFM = generoFM;
        this.especieAnimal = especieAnimal;
        this.prazoVacinacao = prazoVacinacao;
    }

    public Animal( Double peso, LocalDate dataNacimento, boolean castrado, String nome, String raca, String cor, String observacoes, String generoFM, String especieAnimal, String prazoVacinacao) {
        this.peso = peso;
        this.dataNacimento = dataNacimento;
        this.castrado = castrado;
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.observacoes = observacoes;
        this.generoFM = generoFM;
        this.especieAnimal = especieAnimal;
        this.prazoVacinacao = prazoVacinacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public LocalDate getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(LocalDate dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public boolean getCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getGeneroFM() {
        return generoFM;
    }

    public void setGeneroFM(String generoFM) {
        this.generoFM = generoFM;
    }

    public String getEspecieAnimal() {
        return especieAnimal;
    }

    public void setEspecieAnimal(String especieAnimal) {
        this.especieAnimal = especieAnimal;
    }

    public String getPrazoVacinacao() {
        return prazoVacinacao;
    }

    public void setPrazoVacinacao(String prazoVacinacao) {
        this.prazoVacinacao = prazoVacinacao;
    }
}

