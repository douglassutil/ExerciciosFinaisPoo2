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
public class SensorTemperatura {
    private int qtdTemperatura;

    public SensorTemperatura(int qtdTemperatura) {
        this.qtdTemperatura = qtdTemperatura;
    }

    public int getQtdTemperatura() {
        return qtdTemperatura;
    }

    public void setQtdTemperatura(int qtdTemperatura) {
        this.qtdTemperatura = qtdTemperatura;
    }
}
