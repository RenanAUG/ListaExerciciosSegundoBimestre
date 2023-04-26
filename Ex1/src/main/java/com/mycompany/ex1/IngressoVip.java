/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1;

/**
 *
 * @author Renan Augusto Mendes Carlos - Ra: 00234708
 */
public class IngressoVip extends Ingresso {
    private float valorAdicional;
    
    public IngressoVip(float valor, float valorAdicional){
        super(valor);
        
        this.valorAdicional = valorAdicional;
    }
    
    public String toString() {
        return "O valor do Ingresso Vip é: " + (this.getValor() + this.getValorAdicional());
    }
    
    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
}
