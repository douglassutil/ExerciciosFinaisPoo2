/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.ReprodutorVideo.Application;

import br.ifes.poo2.ReprodutorVideo.cdp.*;
import static br.ifes.poo2.ReprodutorVideo.cdp.Tipo.*;

/**
 *
 * @author dolly
 */
public class Application {
    public static void main (String args[]){
        Video filme = new Video("chato",MP4);
        filme.reproduzir();
    }
    
}
