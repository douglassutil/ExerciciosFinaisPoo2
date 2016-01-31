/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.maquinagomamascar.application;

import br.ifes.poo2.maquinagomamascar.cdp.MaquinaGomaMascar;

/**
 *
 * @author dolly
 */
public class Application {
    public static void main(String args[]){
        MaquinaGomaMascar maquinaChicletis = new MaquinaGomaMascar(2);
        maquinaChicletis.puxarAlavanca();
        maquinaChicletis.inserirMoeda(2);
        maquinaChicletis.inserirMoeda(1);
        System.out.println(maquinaChicletis.getQtdGoma());
        maquinaChicletis.inserirMoeda(1);
        System.out.println(maquinaChicletis.getQtdGoma());
        maquinaChicletis.inserirMoeda(1);
        System.out.println(maquinaChicletis.getQtdGoma());
        maquinaChicletis.inserirMoeda(1);
        System.out.println(maquinaChicletis.getQtdGoma());
        maquinaChicletis.inserirGoma(2);
        System.out.println(maquinaChicletis.getQtdGoma());
        maquinaChicletis.inserirMoeda(1);
        System.out.println(maquinaChicletis.getQtdGoma());
        maquinaChicletis.inserirMoeda(1);
        System.out.println(maquinaChicletis.getQtdGoma());
        maquinaChicletis.inserirMoeda(1);
        

        
      
        
    }
    
}
