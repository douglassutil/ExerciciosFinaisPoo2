/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.ArCondicionadoMediador.Application;

import br.ifes.poo2.ArCondicionadoMediador.cdp.MediadorArCondicionado;

/**
 *
 * @author dolly
 */
public class Application {
    public static void main(String args[]){
        MediadorArCondicionado mediador = new MediadorArCondicionado();
        mediador.atualizarTemperatura();
    }
    
}
