/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author HECTOR
 */
public class Condicion {
    
     private int numero;
     private String atributo;
     private String valor;
     private boolean verdad;
     private boolean hipotesis;
     private String descripcion;

    public Condicion() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean isVerdad() {
        return verdad;
    }

    public void setVerdad(boolean verdad) {
        this.verdad = verdad;
    }

    public boolean isHipotesis() {
        return hipotesis;
    }

    public void setHipotesis(boolean hipotesis) {
        this.hipotesis = hipotesis;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
     
    
    
     
     
    
}
