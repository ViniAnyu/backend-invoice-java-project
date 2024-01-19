/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hu.anzek.backend.invoicesystem.repository;


import hu.anzek.backend.invoicesystem.model.Szallito;


/**
 * SzallitoRepo interfesz
 * @author User
 */
@FunctionalInterface
public interface SzallitoRepo {
 
    /**
     * Beolvassa a számlakiállító adatait egy java rekord entitásba<br>
     * @param fajlEleres a fájl elérése, útvonala<br>
     * @return visszaadja a szállító adatokat<br>
     */
    public Szallito beolvasTxtAdattarbol(String fajlEleres);
}
