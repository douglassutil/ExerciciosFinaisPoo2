/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.FoobarMotorCompany.cdp;

import java.util.ArrayList;

/**
 *
 * @author dolly
 */
public class MaisLesteExpression implements Expression{
    
    private ArrayList<Expression> expressionList;

    public MaisLesteExpression(ArrayList<Expression> expressionList) {
        this.expressionList = expressionList;
    }
    
    @Override
    public Cidade interpret() {
        Cidade cidade = expressionList.get(0).interpret();
        for (Expression expressionCurrent:this.expressionList){
            Cidade cidadeCurrent = expressionCurrent.interpret();
            if(cidadeCurrent.getLongitude() > cidade.getLongitude()){
                cidade = cidadeCurrent;
            }
        }
        return cidade;
    }
    
    
}
