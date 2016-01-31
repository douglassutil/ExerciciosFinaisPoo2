/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.ControleUniversal.cdp;

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
public class ComandoFecharPortaoTest {
    

    @Test
    public void testExecute() {
        System.out.println("execute");
        Portao portao = new Portao();
        ComandoFecharPortao instance = new ComandoFecharPortao(portao);
        instance.execute();
    
    }
    
}
