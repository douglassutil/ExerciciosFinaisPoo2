/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.TaComFome.util;

import java.util.HashMap;

/**
 *
 * @author dolly
 */
public class PizzaFlyweightFactory {
    private final HashMap<String, FabricaPizzaAbstrata> pizza;


    public PizzaFlyweightFactory() {
        pizza = new HashMap<String, FabricaPizzaAbstrata>();   
    }
    
    private FabricaPizzaAbstrata getMussarela(String tipo){
        if (tipo.equals("TradicionalMussarela")){
            if(!pizza.containsKey("TradicionalMussarela")){
                pizza.put("TradicionalMussarela", new FabricaPizzaTradicionalMussarela());
            }
        }else{
            if(!pizza.containsKey("ConeMussarela")){
                pizza.put("ConeMussarela", new FabricaPizzaConeMussarela());
            }
        } 
        return pizza.get(tipo);
                   
    }
    
    private FabricaPizzaAbstrata getQuatroQueijos(String tipo){
        if (tipo.equals("TradicionalQuatroQueijos")){
            if(!pizza.containsKey("TradicionalQuatroQueijos")){
                pizza.put("TradicionalQuatroQueijos", new FabricaPizzaTradicionalQuatroQueijos());
            }
        }else{
            if(!pizza.containsKey("ConeQuatroQueijos")){
                pizza.put("ConeQuatroQueijos", new FabricaPizzaConeQuatroQueijos());
            }
        } 
        return pizza.get(tipo);
                   
    }
    
    
    public FabricaPizzaAbstrata getPizza(String tipo){
        FabricaPizzaAbstrata pizza = null;
        switch (tipo) {
            case "TradicionalMussarela":
                pizza = getMussarela("TradicionalMussarela");
                break;
            case "ConeMussarela":
                pizza = getMussarela("ConeMussarela");
                break;
            case "TradicionalQuatroQueijos":
                pizza = getQuatroQueijos("TradicionalQuatroQueijos");
                break;
            case "ConeQuatroQueijos":
                pizza = getQuatroQueijos("ConeQuatroQueijos");
                break;
        }
        
        return pizza;
        
    }
}
