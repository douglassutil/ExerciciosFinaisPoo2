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
public class EstadoSemMoeda extends EstadoMaquina{

    public EstadoSemMoeda(MaquinaGomaMascar maquina) {
        super(maquina);
    }

    @Override
    public void inserirMoeda(int moeda) {
        if (moeda != 1){
            System.out.println("Erro, essa moeda não é aceita!");
        }else{
            System.out.println("Moeda inserida com sucessuuuuuu!");
            this.maquina.setEstadomaquina(maquina.getRecebeuMoeda());
            maquina.inserirMoeda(moeda);
        }
        
    }

    @Override
    public void puxarAlavanca() {
        System.out.println("Máquina sem moeda!");
    }

    
}
