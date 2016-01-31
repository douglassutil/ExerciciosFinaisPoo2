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
public class ComandoFecharPortao implements Comando{
    private Portao portao;

    public ComandoFecharPortao(Portao portao) {
        this.portao = portao;
    }
    
    @Override
    public void execute() {
        this.portao.fechar();
    }
    
}
