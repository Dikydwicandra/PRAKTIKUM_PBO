/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest3;

/**
 *
 * @author ROG
 */
public class Smartphone extends Data {
    private String os;

  
    public Smartphone(String merk,String seri,int kapasitas, int harga, String warna, String os) {
        super(merk,seri,kapasitas, harga, warna);
        this.os = os;
    }
    public void setOs(String os){
        this.os= os;
    }
    
    public String getOs() {
        return os;
    }
}
 
    

