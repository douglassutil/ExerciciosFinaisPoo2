/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.TaComFome.cdp;

/**
 *
 * @author dolly
 */
public class PizzaDecorador extends PizzaPronta {
   PizzaPronta PizzaPronta;
    
    public PizzaDecorador(PizzaPronta pizza){
        PizzaPronta=pizza;
    }
    @Override
    public String getNome() {
        return PizzaPronta.getNome()  + " + " + nome;
    }
    
   @Override
    public double getPreco() {
        return PizzaPronta.getPreco() + preco;
    }
    
    
}

   
   

  
    
    
    
