/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.FoobarMotorCompany.cdp;

/**
 *
 * @author dolly
 */
public class CidadeExpression implements Expression{
    private Cidade cidade;

    public CidadeExpression(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public Cidade interpret() {
        return cidade;
    }
    
}
