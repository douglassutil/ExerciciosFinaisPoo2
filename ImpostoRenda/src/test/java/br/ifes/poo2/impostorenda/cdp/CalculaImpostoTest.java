/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.impostorenda.cdp;

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
public class CalculaImpostoTest {
    
   
    @org.junit.Test
    public void testCalculaImposto() {
        System.out.println("CalculaImposto");
        double salario = 0.0;
        CalculaImposto instance = new CalculaImposto();
        instance.CalculaImposto(salario);
    }
    
}