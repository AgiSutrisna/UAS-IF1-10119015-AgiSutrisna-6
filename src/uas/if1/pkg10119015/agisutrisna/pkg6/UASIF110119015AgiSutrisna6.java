/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if1.pkg10119015.agisutrisna.pkg6;

/**
 *
 * @author Agy
 * Nama : Agi Sutrisna
 * Nim  : IF-1
 * Kelas: 10119015
 * No   : 6
 */
public class UASIF110119015AgiSutrisna6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        kalkulator kalkula = new kalkulator();
        
        kalkula.setValue1(7.0);
        kalkula.setValue2(5.0);
        double value1 = kalkula.getValue1();
        double value2 = kalkula.getValue2();
        
        System.out.println("value 1 = " + value1);
        System.out.println("value 1 = " + value2);
        double multiplication = kalkula.multiplication(value1, value2);
        System.out.println("Hasil Perkalian = " + multiplication);
    }
    
}
