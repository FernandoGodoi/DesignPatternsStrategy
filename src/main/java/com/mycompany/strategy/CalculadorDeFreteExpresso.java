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
public class CalculadorDeFreteExpresso implements ICalculadorDeFrete
{
    public double CalcularFretePara(Pedido pedido)
    {
        // aqui vai o algoritmo de cálculo de frete "expresso"
       return 35.00; 
    }
}


