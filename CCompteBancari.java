/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.activitat_11_jonathan;

/**
 *
 * @author migal
 */
public class CCompteBancari {
    private int nCompte; 
    private String propietari;
    private float saldo;
    private static int seguentCompte = 1234;
    private static float saldoInicial = 100;

    public int getNCompte() {
        return nCompte;
    }

    public void setNCompte(int nCompte) {
        this.nCompte = nCompte;
    }

    public String getPropietari() {
        return propietari;
    }

    public void setPropietari(String propietari) {
        this.propietari = propietari;
    }

    public float getSaldo() {
        return saldo;
    }

    public static void setSaldoInicial(float saldoInicial){
        CCompteBancari.saldoInicial = saldoInicial;
    }
    
    public CCompteBancari(int nCompte, String propietari, float saldo) {
        this.nCompte = nCompte;
        this.propietari = propietari;
        this.saldo = saldo;
    }
    
    public CCompteBancari(final CCompteBancari c) {
        this.nCompte = c.nCompte;
        this.propietari = c.propietari;
        this.saldo = c.saldo;
    }
    
    public float consultarSaldo(){
        return this.saldo;
    }
    
    public boolean comprovarNumSecret(int n1, int n2){
        if(n1 == n2){
            return true;
        }else{
            return false;
        }
    }
    
    public void saludo2(){
        System.out.println("SALUDOS 2");
    }
    
    @Override
    public String toString() {
        return "CCompteBancari{" + "nCompte=" + nCompte + ", propietari=" + propietari + ", saldo=" + saldo + '}';
    }
}
