/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.ControleUniversal.Application;

import br.ifes.poo2.ControleUniversal.cdp.*;

/**
 *
 * @author dolly
 */
public class Application {
    public static void main(String args[]){
    
    Carro fusca = new Carro();
    Comando ligar = new ComandoLigarCarro(fusca);
    Comando desligar = new ComandoDesligarCarro(fusca);
    ControleUniversal controleUniversal = new ControleUniversal(ligar,desligar);
    controleUniversal.executar();
    controleUniversal.desfazer();
    controleUniversal.desfazer();
    controleUniversal.desfazer();
    
    Portao feuRosa = new Portao();
    Comando abrir = new ComandoAbrirPortao(feuRosa);
    Comando fechar = new ComandoFecharPortao(feuRosa);
    ControleUniversal controleUniversal2 = new ControleUniversal(abrir,fechar);
    controleUniversal2.executar();
    controleUniversal2.desfazer();
    controleUniversal2.desfazer();
    controleUniversal2.desfazer();
    
    }
}
