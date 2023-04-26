/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;

/**
 *
 * @author Renan Augusto Mendes Carlos - Ra: 00234708
 */
public class Vendedor extends Empregado{
    
    private float percentualComissao;

    public Vendedor(float percentualComissao, String nome, float salario) {
        super(nome, salario);
        this.percentualComissao = percentualComissao;
    }

    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    public float CalcularSalario() {
        float percentual = (this.getPercentualComissao()/10);
        
        float p = percentual * getSalario();
        
        return p;
    }
    
    public String toString() {
        return "O nome do empregado é:" + this.getNome() 
                + " - O salário sem Comissão é: " + this.getSalario() 
                + " - O salário com comissão é: " + this.CalcularSalario()
                + " - O percentual de comissão é: " + this.percentualComissao;
    }
    
}
