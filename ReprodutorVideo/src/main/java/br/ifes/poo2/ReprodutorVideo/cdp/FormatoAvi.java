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
public class FormatoAvi extends FormatoVideo{


    @Override
    public void carregarArquivo() {
        System.out.println("Carregando arquivo AVI");
    }

    @Override
    public void carregarLegenda() {
         System.out.println("Carregando legenda Avi");
    }

    @Override
    public void reproduzirVideo() {
         System.out.println("Reproduzindo Video Avi");
    }

    @Override
    public void finalizarReproducao() {
         System.out.println("Finalizando Reproduçao Avi");
    }
    
}
