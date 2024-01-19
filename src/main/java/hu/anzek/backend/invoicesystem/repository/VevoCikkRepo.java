/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hu.anzek.backend.invoicesystem.repository;


import java.util.List;


/**
 * VevoCikkRepo interfesz
 * @author User
 * @param <T> vevo/cikk rekord
 */
@FunctionalInterface
public interface VevoCikkRepo <T>{

    /**
    * A generikusok olyan típusparaméterek, 
    * Ezek lehetővé teszik az osztályok és interfészek általánosítását, 
    * így azok tetszőleges típusokkal működhetnek. 
    * Egy adott típust "átadhatunk" egy osztálynak vagy interfésznek, 
    * akkor, amikor azt példányosítjuk vagy használjuk. 
    * Ezáltal a kód általánosabb és újrafelhasználhatóbb lesz!
    */    
    public List<T> beolvasTxtAdattarbol(String fajlEleres); 
}
