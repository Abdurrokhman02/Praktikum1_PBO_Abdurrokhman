/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan1_2;

/**
 *
 * @author iwana
 */
public class Nilai {
    String nama;
    int npm;
    double absen, tugas, uts, uas, akhir;

    void Nilai(){
        this.absen = absen*0.1;
        this.tugas = tugas*0.2;
        this.uts = uts*0.3;
        this.uas = uas*0.4;
        this.akhir = (this.absen + this.tugas + this.uts+ this.uas);
        
        System.out.println ("NPM              : " + this.npm);
        System.out.println ("Nama             : " + this.nama);
        System.out.println ("Nilai Absen [10%]: " + this.absen);
        System.out.println ("Nilai Tugas [20%]: " + this.tugas);
        System.out.println ("Nilai UTS [30%]  : " + this.uts);
        System.out.println ("Nilai UAS [40%]  : " + this.uas);
        System.out.println ("Nilai Akhir      : " + this.akhir);
    }
}
