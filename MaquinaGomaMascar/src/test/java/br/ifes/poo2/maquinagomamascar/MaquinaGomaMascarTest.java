/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.maquinagomamascar;


import br.ifes.poo2.maquinagomamascar.cdp.EstadoMaquina;
import br.ifes.poo2.maquinagomamascar.cdp.MaquinaGomaMascar;
import br.ifes.poo2.maquinagomamascar.cdp.EstadoSemMoeda;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dolly
 */
public class MaquinaGomaMascarTest {
    

    @Test
    public void testGetQtdGoma() {
        System.out.println("getQtdGoma");
        MaquinaGomaMascar instance = new MaquinaGomaMascar(2);
        int expResult = 2;
        int result = instance.getQtdGoma();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testInserirGoma() {
        System.out.println("inserirGoma");
        int qnt = 5;
        MaquinaGomaMascar instance = new MaquinaGomaMascar(2);
        instance.inserirGoma(qnt);
       
    }

    @Test
    public void testSetEstadomaquina() {
        System.out.println("setEstadomaquina");
         MaquinaGomaMascar instance = new MaquinaGomaMascar(2);
        EstadoMaquina estadomaquina = new EstadoSemMoeda(instance);
        instance.setEstadomaquina(estadomaquina);
     
    }

    @Test
    public void testDiminuirGoma() {
        System.out.println("diminuirGoma");
        MaquinaGomaMascar instance = new MaquinaGomaMascar(2);
        instance.diminuirGoma();
      
    }

    @Test
    public void testPuxarAlavanca() {
        System.out.println("puxarAlavanca");
        MaquinaGomaMascar instance =new MaquinaGomaMascar(2);
        instance.puxarAlavanca();
      
    }

    @Test
    public void testInserirMoeda() {
        System.out.println("inserirMoeda");
        int moeda = 2;
        MaquinaGomaMascar instance = new MaquinaGomaMascar(2) ;
        instance.inserirMoeda(moeda);
       
    }
    
}
