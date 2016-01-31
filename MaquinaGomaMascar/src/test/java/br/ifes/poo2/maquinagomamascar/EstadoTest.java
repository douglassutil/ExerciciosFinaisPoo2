/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.maquinagomamascar;

import br.ifes.poo2.maquinagomamascar.cdp.Estado;
import org.junit.After;

import org.junit.Test;

/**
 *
 * @author dolly
 */
public class EstadoTest {
    
    @Test
    public void testInserirMoeda() {
        System.out.println("inserirMoeda");
        int moeda = 0;
        Estado instance = new EstadoImpl();
        instance.inserirMoeda(moeda);
       
    }

    @Test
    public void testPuxarAlavanca() {
        System.out.println("puxarAlavanca");
        Estado instance = new EstadoImpl();
        instance.puxarAlavanca();
        
    }

    public class EstadoImpl implements Estado {

        public void inserirMoeda(int moeda) {
        }

        public void puxarAlavanca() {
        }
    }
    
}
