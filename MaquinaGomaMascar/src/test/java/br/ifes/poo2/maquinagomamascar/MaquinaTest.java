/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.maquinagomamascar;


import br.ifes.poo2.maquinagomamascar.cdp.EstadoMaquina;
import br.ifes.poo2.maquinagomamascar.cdp.Maquina;
import org.junit.Test;


/**
 *
 * @author dolly
 */
public class MaquinaTest {
  
    @Test
    public void testPuxarAlavanca() {
        System.out.println("puxarAlavanca");
        Maquina instance = new MaquinaImpl();
        instance.puxarAlavanca();
       
    }

    @Test
    public void testInserirMoeda() {
        System.out.println("inserirMoeda");
        int moeda = 0;
        Maquina instance = new MaquinaImpl();
        instance.inserirMoeda(moeda);
        
    }

    @Test
    public void testSetEstadomaquina() {
        System.out.println("setEstadomaquina");
        EstadoMaquina estadomaquina = null;
        Maquina instance = new MaquinaImpl();
        instance.setEstadomaquina(estadomaquina);
        
    }

    @Test
    public void testInserirGoma() {
        System.out.println("inserirGoma");
        int qnt = 0;
        Maquina instance = new MaquinaImpl();
        instance.inserirGoma(qnt);
        
    }

    public class MaquinaImpl implements Maquina {

        public void puxarAlavanca() {
        }

        public void inserirMoeda(int moeda) {
        }

        public void setEstadomaquina(EstadoMaquina estadomaquina) {
        }

        public void inserirGoma(int qnt) {
        }
    }
    
}
