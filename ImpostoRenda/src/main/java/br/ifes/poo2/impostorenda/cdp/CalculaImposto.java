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
public class CalculaImposto {
    Estrategia estrategia;
    public void CalculaImposto(double salario){
        if (salario <= 1710.78){
            estrategia = new EstrategiaOne();            
        }
        else if (salario > 1710.78 && salario<= 2563.91){
            estrategia = new EstrategiaTwo();
        }
        else if (salario > 2563.91 && salario<=3418.59){
            estrategia = new EstrategiaThree();
        }
        else if (salario > 3418.59 && salario<= 4271.59){
            estrategia = new EstrategiaFour();
        }
        else if (salario > 4271.59){
            estrategia = new EstrategiaFive();
        }
        
        estrategia.calculaImposto(salario);
    }
    
}
