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
public class Portao {
    public boolean PortaoAberto;
    
    public Portao() {
        this.PortaoAberto = false;
    }

    public boolean isPortaoAberto() {
        return PortaoAberto;
    }
    
    public void abrir(){
        if (PortaoAberto){
            System.out.println("O portão já está aberto!");
        }else{
            System.out.println("O portão Abriu!");
            this.PortaoAberto=true;
        }
    }
    
    public void fechar(){
        if (!PortaoAberto){
            System.out.println("O portão já está Fechado!");
        }else{
            System.out.println("O portão fechou!");
            this.PortaoAberto=false;
        }
    }
    
}
