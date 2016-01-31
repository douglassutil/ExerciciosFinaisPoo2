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
public class EstadoGomaVendida extends EstadoMaquina{

    public EstadoGomaVendida(MaquinaGomaMascar maquina) {
        super(maquina);
    }

    @Override
    public void inserirMoeda(int moeda) {
        System.out.println("Processando........ Aguarde.... para inserir..... moeda..... zzzzzzz");
    }

    @Override
    public void puxarAlavanca() {
        if (maquina.getQtdGoma()==0){
            System.out.println("Maquina sem TCHICLETIIS....  Vou ejetar tua moeda... relaxa aew");
            maquina.setEstadomaquina(maquina.getSemGoma());
        }
        else{
            maquina.diminuirGoma();
            System.out.println("Chichete vendido com sucesso! Masca aew!");
            maquina.setEstadomaquina(maquina.getSemMoeda());
        }
    }
    
   
    
    
}
