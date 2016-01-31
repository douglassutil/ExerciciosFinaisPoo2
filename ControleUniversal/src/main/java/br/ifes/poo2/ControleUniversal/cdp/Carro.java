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
public class Carro {

    public boolean CarroLigado;
    
    public Carro() {
        this.CarroLigado = false;
    }

    public boolean isCarroLigado() {
        return CarroLigado;
    }
    
    public void ligar(){
        if (CarroLigado){
            System.out.println("Carro já está ligado!");
        }else{
            System.out.println("O carro Ligou!");
            this.CarroLigado=true;
        }
    }
    
    public void desligar(){
        if (!CarroLigado){
            System.out.println("Carro já está desligado!");
        }else{
            System.out.println("O carro desligou!");
            this.CarroLigado=false;
        }
    }
}
