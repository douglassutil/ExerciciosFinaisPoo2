/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.ReprodutorVideo.cdp;

/**
 *
 * @author dolly
 */
public abstract class FormatoVideo implements Formato {
  
    public void executar(){
    carregarArquivo();
    carregarLegenda();
    reproduzirVideo();
    finalizarReproducao();
    }
    
  
   
    
    
    
}
