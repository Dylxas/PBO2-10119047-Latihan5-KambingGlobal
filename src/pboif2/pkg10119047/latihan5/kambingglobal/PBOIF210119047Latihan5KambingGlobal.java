/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan5.kambingglobal;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI MENAMBAHKAN JUMLAH KAMBING GLOBAL
 */

public class PBOIF210119047Latihan5KambingGlobal {

    //var jumlah kambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    //method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        PBOIF210119047Latihan5KambingGlobal kambingSusu = new PBOIF210119047Latihan5KambingGlobal();
        
        //menampilkan jumlah kambing yang ada saat program pertama kali berjalan
         kambingSusu.getJumlahKambing();
         
        //menambah satu kambing
         kambingSusu.tambahKambing();
         
        //menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
         
    }
    
}
