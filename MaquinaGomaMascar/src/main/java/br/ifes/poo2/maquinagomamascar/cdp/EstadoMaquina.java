/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.maquinagomamascar.cdp;

/**
 *
 * @author dolly
 */
public abstract class EstadoMaquina implements Estado{
    protected MaquinaGomaMascar maquina;

    public EstadoMaquina(MaquinaGomaMascar maquina) {
        this.maquina = maquina;
    }
    
}
