/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.ArCondicionadoMediador.cdp;

import java.util.ArrayList;



/**
 *
 * @author dolly
 */
public class ArCondition {
    private int temperaturaAtual;
    private ArrayList<SensorPessoa> listaSensorPessoa = new ArrayList<SensorPessoa>();
    private ArrayList<SensorTemperatura> listaSensorTemperatura = new ArrayList<SensorTemperatura>();

    public int getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(int temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
       
    }
    
    public void addSensorPessoa(SensorPessoa sensor){
        this.listaSensorPessoa.add(sensor);
    }
    public void addSensorTemperatura(SensorTemperatura sensor){
        this.listaSensorTemperatura.add(sensor);
    }
    
    public void calculaTemperatura(){
        int qtdMediaPessoa = 0;
        int tempMedia = 0;
        
        if (this.listaSensorPessoa.size() > 0){
            for (SensorPessoa sensor: this.listaSensorPessoa){
                qtdMediaPessoa += sensor.getQtdPessoa();
            }
            
            qtdMediaPessoa /= this.listaSensorPessoa.size();
        }
        
        if (this.listaSensorTemperatura.size() > 0){
            for (SensorTemperatura sensor: this.listaSensorTemperatura){
                tempMedia += sensor.getQtdTemperatura();
            }
            
            tempMedia /= this.listaSensorTemperatura.size();
        }
        
 
        setTemperaturaAtual( tempMedia + qtdMediaPessoa);
        
    }


    
    
}
