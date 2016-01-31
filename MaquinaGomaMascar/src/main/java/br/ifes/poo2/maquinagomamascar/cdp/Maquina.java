/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.maquinagomamascar.cdp;

/**
 *
 * @author dolly
 */
public interface Maquina {
    public void puxarAlavanca();
    public void inserirMoeda(int moeda);
    public void setEstadomaquina(EstadoMaquina estadomaquina);
    public void inserirGoma(int qnt);
}
