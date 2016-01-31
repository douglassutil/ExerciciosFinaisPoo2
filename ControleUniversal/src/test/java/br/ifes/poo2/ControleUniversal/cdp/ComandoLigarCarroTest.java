/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.ControleUniversal.cdp;
import org.junit.Test;


/**
 *
 * @author dolly
 */
public class ComandoLigarCarroTest {
    
 

    @Test
    public void testExecute() {
        System.out.println("execute");
        Carro carro= new Carro();
        ComandoLigarCarro instance = new ComandoLigarCarro(carro);
        instance.execute();
     
    }
    
}
