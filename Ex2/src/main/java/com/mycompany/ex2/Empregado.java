/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;

/**
 *
 * @author Renan Augusto Mendes Carlos - Ra: 00234708
 */
public class Empregado {
    
    private String nome;
    protected float salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Empregado(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String toString() {
        return "Empregado é: " + this.getNome() + "- O seu salário é: " + this.getSalario();
    }
}
