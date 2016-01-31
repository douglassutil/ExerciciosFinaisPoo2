/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.FoobarMotorCompany.cdp;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dolly
 */
public class CidadeTest {
    


    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Cidade instance = new Cidade("Serra", -20.12,-40.30);
        String expResult = "Serra";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Serra";
        Cidade instance = new Cidade("Serra", -20.12,-40.30);
        instance.setNome(nome);
    }

    @Test
    public void testGetLatitude() {
        System.out.println("getLatitude");
        Cidade instance = new Cidade("Serra", -20.12,-40.30);
        double expResult =-20.12;
        double result = instance.getLatitude();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSetLatitude() {
        System.out.println("setLatitude");
        double latitude = -20.12;
        Cidade instance = new Cidade("Serra", -20.12,-40.30);
        instance.setLatitude(latitude);
    }

    @Test
    public void testGetLongitude() {
        System.out.println("getLongitude");
        Cidade instance = new Cidade("Serra", -20.12,-40.30);
        double expResult =-40.30;
        double result = instance.getLongitude();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSetLongitude() {
        System.out.println("setLongitude");
        double longitude = 0.0;
        Cidade instance = new Cidade("Serra", -20.12,-40.30);
        instance.setLongitude(longitude);
    }

  

    @Test
    public void testToString() {
        System.out.println("toString");
        Cidade instance = new Cidade("Serra", -20.12,-40.30);
        String expResult = "Serra";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
