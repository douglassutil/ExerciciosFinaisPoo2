/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.impostorenda.cdp;

/**
 *
 * @author dolly
 */
public class EstrategiaFive implements Estrategia{

    @Override
    public void calculaImposto(double valor) {
        double resultado = valor*0.275;
        System.out.println("Valor a pagar: "+ resultado);
    }
}
