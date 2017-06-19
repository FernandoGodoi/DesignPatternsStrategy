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
public class Pedido {
     // utilizando composição: o pedido mantém uma referência (passada em seu construtor)
    // para a Strategy base, normalmente uma interface ou classe abstrata
 
    private ICalculadorDeFrete _calculadorDeFrete;
    public Pedido(ICalculadorDeFrete calculadorDeFrete)
    {
        _calculadorDeFrete = calculadorDeFrete;
    }
 
    public double CalcularFrete()
    {
        // delegando o cálculo do frete para o objeto Strategy configurado
        return _calculadorDeFrete.CalcularFretePara(this);
        
    }
}


