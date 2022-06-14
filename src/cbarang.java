/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasbp;

/**
 *
 * @author hafiz ilham ardana
 */
public class cbarang {
    String nama;
    int harga;
    
    cbarang (String n, int h){
        nama=n; harga=h;
    }
    public String getNama(){
        return nama;
    }
    public int getHarga(){
        return harga;
    }
    public String disp(){
        return nama+" "+harga;
    }
}
