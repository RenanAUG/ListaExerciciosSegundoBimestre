/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;

/**
 *
 * @author Renan Augusto Mendes Carlos - Ra: 00234708
 */
public class Gerente extends Empregado{
    
    private String departamento;

    public Gerente(String departamento, String nome, float salario) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public String toString(){
        return "O departamento do gerente é: " + this.getDepartamento() 
                + "- Seu nome é: " + this.getNome() 
                + "- Seu salario é: " + this.getSalario();
    }
    
}
