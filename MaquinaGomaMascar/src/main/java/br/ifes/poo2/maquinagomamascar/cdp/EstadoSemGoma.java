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
public class EstadoSemGoma extends EstadoMaquina{

    public EstadoSemGoma(MaquinaGomaMascar maquina) {
        super(maquina);
    }

    @Override
    public void inserirMoeda(int moeda) {
        System.out.println("Fechado para balanço... volte mais tarde...");
    }

    @Override
    public void puxarAlavanca() {
        System.out.println("Nem tente.... ta fechado...");
    }
    
   
}
