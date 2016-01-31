/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.maquinagomamascar;

import br.ifes.poo2.maquinagomamascar.cdp.MaquinaGomaMascar;
import br.ifes.poo2.maquinagomamascar.cdp.EstadoRecebeuMoeda;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dolly
 */
public class EstadoRecebeuMoedaTest {
    
    public EstadoRecebeuMoedaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testInserirMoeda() {
        System.out.println("inserirMoeda");
        MaquinaGomaMascar maquina = new MaquinaGomaMascar(2);
        int moeda = 0;
        EstadoRecebeuMoeda instance =new EstadoRecebeuMoeda(maquina);
        instance.inserirMoeda(moeda);
      
    }

    @Test
    public void testPuxarAlavanca() {
        System.out.println("puxarAlavanca");
        MaquinaGomaMascar maquina = new MaquinaGomaMascar(2);
        EstadoRecebeuMoeda instance = new EstadoRecebeuMoeda(maquina);
        instance.puxarAlavanca();
       
    }
    
}
