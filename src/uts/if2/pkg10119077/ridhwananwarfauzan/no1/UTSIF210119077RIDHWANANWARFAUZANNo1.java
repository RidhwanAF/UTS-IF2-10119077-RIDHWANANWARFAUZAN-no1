/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119077.ridhwananwarfauzan.no1;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author RAF
 * Nama         : Ridhwan Anwar Fauzan
 * NIM          : 10119077
 * Kelas        : IF-2
 * Deskripsi    : Menghasilkan keterangan perhitungan umur
 */
public class UTSIF210119077RIDHWANANWARFAUZANNo1 {

    
    public static void main(String[] args) {
        Age objAge=new Age(Calendar.getInstance().get(Calendar.YEAR));
        Scanner input=new Scanner(System.in);
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        objAge.setYearBirth(input.nextInt());
        System.out.println("");
        System.out.println("=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun Lahir Anda : "+objAge.getYearBirth());
        System.out.println("Hari ini tahun : "+objAge.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "+objAge.hitungUmur()+" tahun");
        System.out.println("Tandanya Kamu "+objAge.tandanyaKamu(objAge.hitungUmur()));
    }
    
}
