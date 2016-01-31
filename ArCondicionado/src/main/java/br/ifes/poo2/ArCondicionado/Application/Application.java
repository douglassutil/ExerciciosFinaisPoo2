/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.ArCondicionado.Application;

import br.ifes.poo2.ArCondicionado.cdp.*;

/**
 *
 * @author dolly
 */
public class Application {
    public static void main(String args[]){
        
        ObservadorArCondicionado ObservadorAr = new ObservadorArCondicionado();
        
        ArCondition arCondicionado = new ArCondition();
        arCondicionado.addObserver(ObservadorAr);
        
        SensorPessoa SP1 = new SensorPessoa(3);
        arCondicionado.addSensorPessoa(SP1);
        SensorPessoa SP2 = new SensorPessoa(2);
        arCondicionado.addSensorPessoa(SP2);
        SensorPessoa SP3 = new SensorPessoa(5);
        arCondicionado.addSensorPessoa(SP3);
        
        SensorTemperatura ST1 = new SensorTemperatura(35);
        arCondicionado.addSensorTemperatura(ST1);
        SensorTemperatura ST2 = new SensorTemperatura(40);
        arCondicionado.addSensorTemperatura(ST2);
        SensorTemperatura ST3 = new SensorTemperatura(40);
        arCondicionado.addSensorTemperatura(ST3);
        
        arCondicionado.calculaTemperatura();
        
    }
    
}
