/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.TaComFome.application;


import br.ifes.poo2.TaComFome.util.*;

/**
 *
 * @author dolly
 */
public class Application {
     public static void main(String args[]){
        FachadaPrepararPizza pizza = new FachadaPrepararPizza();
      
        
        pizza.PrepararPizza("ConeMussarela");
        pizza.PrepararPizza("TradicionalMussarela");
        pizza.PrepararPizza("TradicionalQuatroQueijos");
        pizza.PrepararPizza("ConeQuatroQueijos");
    
       

    }
    
}
