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
public class ComandoLigarCarro implements Comando{
    
    private Carro carro;

    public ComandoLigarCarro(Carro carro) {
        this.carro = carro;
    }

    @Override
    public void execute() {
        this.carro.ligar();
    }
    
}
