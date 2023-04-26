/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex2;

/**
 *
 * @author Renan Augusto Mendes Carlos - Ra: 00234708
 */
public class Ex2 {

    public static void main(String[] args) {
        Empregado empre = new Empregado("João Alcantarâ", 1500);
        Gerente ger = new Gerente("Financeiro", empre.getNome(), empre.getSalario());
        Vendedor ven = new Vendedor(15, empre.getNome(), empre.getSalario());
        
        System.out.println(empre.toString());
        System.out.println(ger.toString());
        System.out.println(ven.toString());
    }
}
