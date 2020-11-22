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
public class PBO10119913Latihan60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Leader leader = new Leader("Pain", "Ame", "Konan");
        leader.setPemimpin("Pemimpin");
        leader.tampilAnggota();
        System.out.println("Di Akatsuki sebagai : " + leader.getPemimpin());
        
        System.out.println("");
    
        Member member = new Member("Itachi", "Konoha", "Kisame");
        member.setAnggota("Anggota");
        member.tampilAnggota();
        System.out.println("Di Akatsuki sebagai : " + member.getAnggota());
        System.out.println("");
    }
    
}
