/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.impostorenda.cdp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author dolly
 */
@org.junit.runner.RunWith(org.junit.runners.Suite.class)
@org.junit.runners.Suite.SuiteClasses({EstrategiaThreeTest.class, EstrategiaTwoTest.class, EstrategiaFourTest.class, EstrategiaTest.class, CalculaImpostoTest.class, EstrategiaFiveTest.class, EstrategiaOneTest.class})
public class CdpSuite {

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    
}
