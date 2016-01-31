/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.ReprodutorVideo.cdp;

import static br.ifes.poo2.ReprodutorVideo.cdp.Tipo.MP3;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dolly
 */
public class VideoTest {

    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Video instance = new Video("titulo",MP3);;
        String expResult = "titulo";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "Titulo2";
        Video instance = new Video("titulo",MP3);
        instance.setTitulo(titulo);
       
    }

    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Video instance = new Video("titulo",MP3);
        Tipo expResult = MP3;
        Tipo result = instance.getTipo();
        assertEquals(expResult, result);
        
    }

    

    @Test
    public void testReproduzir() {
        System.out.println("reproduzir");
        Video instance = new Video("titulo",MP3);
        instance.reproduzir();
     
    }
    
}
