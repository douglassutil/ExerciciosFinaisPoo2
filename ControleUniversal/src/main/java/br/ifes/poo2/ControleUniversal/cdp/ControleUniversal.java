/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.ControleUniversal.cdp;

/**
 *
 * @author dolly
 */
public class ControleUniversal implements Controle{
    
    Comando executar;
    Comando desfazer;

    public ControleUniversal(Comando executar, Comando desfazer) {
        this.executar = executar;
        this.desfazer = desfazer;
    }
    @Override
    public void executar() {
        this.executar.execute();
    }

    @Override
    public void desfazer() {
        this.desfazer.execute();
    }
    
}
