/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.maquinagomamascar;


import br.ifes.poo2.maquinagomamascar.cdp.MaquinaGomaMascar;
import br.ifes.poo2.maquinagomamascar.cdp.EstadoSemMoeda;
import org.junit.Test;


/**
 *
 * @author dolly
 */
public class EstadoSemMoedaTest {
    
  
    @Test
    public void testInserirMoeda() {
        System.out.println("inserirMoeda");
        MaquinaGomaMascar maquina = new MaquinaGomaMascar(2);
        int moeda = 0;
        EstadoSemMoeda instance = new  EstadoSemMoeda(maquina);
        instance.inserirMoeda(moeda);
        
    }

    @Test
    public void testPuxarAlavanca() {
        System.out.println("puxarAlavanca");
        MaquinaGomaMascar maquina = new MaquinaGomaMascar(2);
        EstadoSemMoeda instance = new EstadoSemMoeda(maquina);
        instance.puxarAlavanca();
       
    }
    
}
