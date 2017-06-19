/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.strategy;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
    CalculadorDeFreteExpresso expresso= new CalculadorDeFreteExpresso();
    CalculadorDeFretePadrao padrao = new CalculadorDeFretePadrao();
    Pedido pedido1 = new Pedido(expresso);
    System.out.println("Valor frete pedido1= "+pedido1.CalcularFrete());  
    Pedido pedido2 = new Pedido(padrao); 
    System.out.println("Valor frete pedido2= "+pedido2.CalcularFrete());
    }
    
}
