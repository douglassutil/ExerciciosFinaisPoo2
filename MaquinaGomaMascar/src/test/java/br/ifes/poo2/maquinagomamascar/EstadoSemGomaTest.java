/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.maquinagomamascar;


import br.ifes.poo2.maquinagomamascar.cdp.EstadoSemGoma;
import br.ifes.poo2.maquinagomamascar.cdp.MaquinaGomaMascar;
import org.junit.Test;

/**
 *
 * @author dolly
 */
public class EstadoSemGomaTest {
    
    

    @Test
    public void testInserirMoeda() {
        System.out.println("inserirMoeda");
        MaquinaGomaMascar maquina = new MaquinaGomaMascar(2);
        int moeda = 0;
        EstadoSemGoma instance = new  EstadoSemGoma(maquina);
        instance.inserirMoeda(moeda);
      
    }

    @Test
    public void testPuxarAlavanca() {
        System.out.println("puxarAlavanca");
        MaquinaGomaMascar maquina = new MaquinaGomaMascar(2);
        EstadoSemGoma instance = new EstadoSemGoma(maquina);
        instance.puxarAlavanca();
    
    }
    
}
