/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author HECTOR
 */
public class Hipotesis {
    
     private String atributo;
     private String valor;
     private boolean verdad;
     private String descripcion;
     private String conclusion;
     ArrayList <Condicion> condiciones = new ArrayList();

    public Hipotesis() {
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public ArrayList<Condicion> getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(ArrayList<Condicion> condiciones) {
        this.condiciones = condiciones;
    }

  
     
   
     
     

    
}
