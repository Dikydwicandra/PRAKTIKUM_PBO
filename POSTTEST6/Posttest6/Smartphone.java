package Posttest6;

import Posttest5.*;

public final class Smartphone extends Data {
    private String os;

  
    public Smartphone(String merk,String seri,int kapasitas, int harga, String warna, String os) {
        this.merk = merk ; 
        this.seri = seri;
        this.kapasitas = kapasitas;
        this.harga = harga;
        this.warna = warna ;
        this.os = os;
    }
    public String getMerk(){
        return merk;
    } 
    public String getSeri(){
        return seri;
    }
    public int getKapasitas(){
        return kapasitas;
    }
    public int getHarga(){
        return harga;
    }
    public String getWarna(){
        return warna;
    }      
    
    
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public void setSeri(String seri){
        this.seri = seri;
    }
    public void setKapasitas(int kapasitas){
        this.kapasitas= kapasitas;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setWarna(String warna) {
        this.warna = warna;
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

    void setOs1(String setOs) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


    

