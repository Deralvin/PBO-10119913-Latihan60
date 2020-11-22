/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119913latihan60;

/**
 * Nama :Muhammad Alvin Rizqi Ramdahn
 * Kelas : IF10K
 * NIM : 10119913
 * @author Lenovo
 */
public class Akatsuki {
    protected String nama;
    protected String clan;
    protected String pasangan;
    
    
    public Akatsuki(String nama, String clan, String pasangan){
        this.nama=nama;
        this.clan=clan;
        this.pasangan=pasangan;
       }
    
    public void tampilAnggota(){
        System.out.println("Nama : "+nama);
        System.out.println("Clan : "+clan);
        System.out.println("pasangan : "+pasangan);
    } 
}
