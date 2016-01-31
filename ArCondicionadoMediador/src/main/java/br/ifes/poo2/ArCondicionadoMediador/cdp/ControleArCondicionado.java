/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.ArCondicionadoMediador.cdp;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author dolly
 */
public class ControleArCondicionado {
    
    public static final int TEMPERATURA_ALERTA=25;
    
    public void verificaTemperatura(ArCondition ar) {
       
        if (ar.getTemperaturaAtual() > 25){
            
            System.out.println("Temperatura acima do requisitado... reduzir "+ (ar.getTemperaturaAtual()-TEMPERATURA_ALERTA)+ "ºC!");
        }else{
            System.out.println("Temperatura Atual Normal: "+ar.getTemperaturaAtual());
        }
    }
    
}
