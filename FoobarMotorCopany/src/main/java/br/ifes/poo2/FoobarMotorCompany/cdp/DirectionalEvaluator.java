/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.FoobarMotorCompany.cdp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author dolly
 */
public class DirectionalEvaluator {
    private HashMap<String,Cidade> cidades;

    public DirectionalEvaluator() {
        cidades=new HashMap<String,Cidade>();
        cidades.put("Serra", new Cidade("Serra", -20.12,-40.30));
        cidades.put("Cariacica", new Cidade("Cariacica", -20.26,-40.42));
        cidades.put("Vitoria", new Cidade("VItoria", -20.31,-40.30));
     
        
    }
    
    public Cidade evaluate (String route){
        Stack<Expression> expressionStack = new Stack<Expression>();
        
        for (String token : route.split(" ")){
            if (cidades.containsKey(token)){
                Cidade cidade = cidades.get(token);
                expressionStack.push(new CidadeExpression(cidade));
            }else if(token.equals("Norte")){
                expressionStack.push(new MaisNorteExpression(loadExpressions(expressionStack)));
            }else if(token.equals("Sul")){
                expressionStack.push(new MaisSulExpression(loadExpressions(expressionStack)));
            }else if(token.equals("Lest")){
                expressionStack.push(new MaisLesteExpression(loadExpressions(expressionStack)));
            }else if(token.equals("Oeste")){
                expressionStack.push(new MaisOesteExpression(loadExpressions(expressionStack)));
            }
       
        }
    return expressionStack.pop().interpret();
    }
    
    private ArrayList<Expression> loadExpressions(Stack<Expression> expressionStack){
        ArrayList<Expression> expressions = new ArrayList<Expression>();
        while(!expressionStack.empty()){
            expressions.add(expressionStack.pop());
        }
    
    return expressions;
    }
       
    
}
