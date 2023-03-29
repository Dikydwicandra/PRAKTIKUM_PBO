/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;




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
    @Override
    public void Tampil(){
    System.out.println(" Merk Handphone      : "+ this.getMerk());
    System.out.println(" Seri Handphone      : "+ this.getSeri());
    System.out.println(" Kapasitas Memory    : "+ this.getKapasitas()+" GB");
    System.out.println(" Harga Handphone     : Rp. "+ this.getHarga());
    System.out.println(" Warna Handphone     : "+ this.getWarna());
    System.out.println(" Sistem Os Handphone : "+ this.getOs());
    System.out.print("\n");
}
    public void Tampil(String judul){
        System.out.println(judul);
        
    }
}


    

