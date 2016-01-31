/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.FoobarMotorCompany.Application;

import br.ifes.poo2.FoobarMotorCompany.cdp.DirectionalEvaluator;

/**
 *
 * @author dolly
 */
public class Application {
    public static void main (String args[]){
        DirectionalEvaluator nossoGpsHuE = new DirectionalEvaluator();
        System.out.println(nossoGpsHuE.evaluate("Serra Cariacica Vitoria Leste"));
        System.out.println(nossoGpsHuE.evaluate("Serra Cariacica Vitoria Oeste"));
        System.out.println(nossoGpsHuE.evaluate("Serra Cariacica Vitoria Norte"));
        System.out.println(nossoGpsHuE.evaluate("Serra Cariacica Vitoria Sul"));
    }
}
