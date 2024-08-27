/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan1_2;

/**
 *
 * @author iwana
 */
public class CetakNilai {
    public static void main (String[] args){
        Nilai mhs1 = new Nilai();
        Nilai mhs2 = new Nilai();

        mhs1.npm = 231060;
        mhs1.nama = "Abdurrokhman";
        mhs1.absen = 100;
        mhs1.tugas = 95;
        mhs1.uts = 89;
        mhs1.uas = 92;
        mhs1.Nilai();

        System.out.println();

        mhs2.npm = 231001;
        mhs2.nama = "abang";
        mhs2.absen = 100;
        mhs2.tugas = 80;
        mhs2.uts = 86;
        mhs2.uas = 95;
        mhs2.Nilai();
    }
}