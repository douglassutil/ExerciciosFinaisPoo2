/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.ArCondicionado.cdp;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author dolly
 */
public class ObservadorArCondicionado implements Observer{
    
    public static final int TEMPERATURA_ALERTA=25;
    
    @Override
    public void update(Observable obs, Object obj) {
       
        ArCondition arcondition = (ArCondition) obs;
        if (arcondition.getTemperaturaAtual() > TEMPERATURA_ALERTA){
            
            System.out.println("Temperatura acima do requisitado... reduzir "+ (arcondition.getTemperaturaAtual()-TEMPERATURA_ALERTA)+ "ºC!");
        }else{
            System.out.println("Temperatura Atual Normal: "+arcondition.getTemperaturaAtual());
        }
    }
    
}
