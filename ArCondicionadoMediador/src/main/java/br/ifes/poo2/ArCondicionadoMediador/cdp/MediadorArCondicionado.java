/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.ArCondicionadoMediador.cdp;


/**
 *
 * @author dolly
 */
public class MediadorArCondicionado {
    private ArCondition ar = new ArCondition();
    private ControleArCondicionado controle = new ControleArCondicionado();
    

    public MediadorArCondicionado() {
        SensorPessoa SP1 = new SensorPessoa(3);
        ar.addSensorPessoa(SP1);
        SensorPessoa SP2 = new SensorPessoa(2);
        ar.addSensorPessoa(SP2);
        SensorPessoa SP3 = new SensorPessoa(5);
        ar.addSensorPessoa(SP3);
        
        SensorTemperatura ST1 = new SensorTemperatura(35);
        ar.addSensorTemperatura(ST1);
        SensorTemperatura ST2 = new SensorTemperatura(40);
        ar.addSensorTemperatura(ST2);
        SensorTemperatura ST3 = new SensorTemperatura(40);
        ar.addSensorTemperatura(ST3);
    }
    
    public void atualizarTemperatura(){
        ar.calculaTemperatura();
        controle.verificaTemperatura(ar);
        
    }
    
     
    }
    
    

    
    
    
    

