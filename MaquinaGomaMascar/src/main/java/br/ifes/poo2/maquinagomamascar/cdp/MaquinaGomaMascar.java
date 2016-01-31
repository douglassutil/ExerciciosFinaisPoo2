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
public class MaquinaGomaMascar implements Maquina{
    private int qtdGoma;
    private EstadoMaquina estadomaquina;
    private EstadoMaquina semMoeda;
    private EstadoMaquina recebeuMoeda;
    private EstadoMaquina gomaVendida;
    private EstadoMaquina semGoma;

    public MaquinaGomaMascar(int qtdGoma) {
        this.qtdGoma = qtdGoma;
        this.semMoeda=new EstadoSemMoeda(this);
        this.recebeuMoeda=new EstadoRecebeuMoeda(this);
        this.gomaVendida=new EstadoGomaVendida(this);
        this.semGoma=new EstadoSemGoma(this);
        setEstadomaquina(semMoeda);
        
        
    }

    protected EstadoMaquina getEstadomaquina() {
        return estadomaquina;
    }

    protected EstadoMaquina getSemMoeda() {
        return semMoeda;
    }

    protected EstadoMaquina getRecebeuMoeda() {
        return recebeuMoeda;
    }

    protected EstadoMaquina getGomaVendida() {
        return gomaVendida;
    }

    protected EstadoMaquina getSemGoma() {
        return semGoma;
    }
      

    public int getQtdGoma() {
        return qtdGoma;
    }
    
  
    @Override
    public void inserirGoma(int qnt){
        if (this.qtdGoma ==0){
            setEstadomaquina(semMoeda);
        }
        this.qtdGoma += qnt;
    }
    
    @Override
    public void setEstadomaquina(EstadoMaquina estadomaquina) {
        this.estadomaquina = estadomaquina;
    }
    
    public void diminuirGoma(){
        this.qtdGoma-=1;
    }
    @Override
    public void puxarAlavanca(){
        estadomaquina.puxarAlavanca();
    }
    
    @Override
    public void inserirMoeda(int moeda){
        estadomaquina.inserirMoeda(moeda);
    }
    
    
    
}
