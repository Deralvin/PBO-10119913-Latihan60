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
public class Leader extends Akatsuki{
     private String pemimpin;
    
    public Leader(String nama, String clan, String pasangan) {
        super(nama, clan, pasangan);
        this.nama=nama;
        this.clan=clan;
        this.pasangan=pasangan;
    }

    public String getPemimpin() {
        return pemimpin;
    }

    public void setPemimpin(String pemimpin) {
        this.pemimpin = pemimpin;
    }
       
}
