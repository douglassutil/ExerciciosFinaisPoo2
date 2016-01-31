/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.ReprodutorVideo.cdp;

import static br.ifes.poo2.ReprodutorVideo.cdp.Tipo.*;

/**
 *
 * @author dolly
 */
public class Video {
    private String titulo;
    private Tipo tipo;

    public Video(String titulo, Tipo tipo) {
        this.titulo = titulo;
        this.tipo = tipo;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Tipo getTipo() {
        return tipo;
    }
    
    public void reproduzir(){
        FormatoVideo formato; 
        switch (this.tipo) {
            case MP3:
                formato= new FormatoMp3();
                formato.executar();
                break;
            case AVI:
                formato= new FormatoAvi();
                formato.executar();
                break;
            case MP4:
                formato= new FormatoMp4();
                formato.executar();
                break;
            
        }
           
    }
    
    

   
    
}
