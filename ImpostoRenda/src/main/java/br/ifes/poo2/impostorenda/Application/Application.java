/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.impostorenda.Application;

import br.ifes.poo2.impostorenda.cdp.CalculaImposto;

/**
 *
 * @author dolly
 */
public class Application {
    public static void main(String args[]){
        CalculaImposto imposto= new CalculaImposto();
        imposto.CalculaImposto(1500);
        imposto.CalculaImposto(3500);
        imposto.CalculaImposto(2500);
        imposto.CalculaImposto(7500);
    }
    
}
