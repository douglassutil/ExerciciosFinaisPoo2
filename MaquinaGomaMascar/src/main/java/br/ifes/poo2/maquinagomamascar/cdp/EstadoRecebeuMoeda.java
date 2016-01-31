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
public class EstadoRecebeuMoeda extends EstadoMaquina{

    public EstadoRecebeuMoeda(MaquinaGomaMascar maquina) {
        super(maquina);
    }

    @Override
    public void inserirMoeda(int moeda) {
        
        maquina.setEstadomaquina(maquina.getGomaVendida());
        maquina.puxarAlavanca();
             
    }

    @Override
    public void puxarAlavanca() {
        System.out.println("Processando.............");
    }
    
}
