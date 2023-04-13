package Posttest6;

import Posttest5.*;

public final class Hpbiasa extends Data {
    private boolean keypad;
    
    public Hpbiasa(String merk,String seri,int kapasitas, int harga, String warna, boolean keypad) {
        this.merk = merk ; 
        this.seri = seri;
        this.kapasitas = kapasitas;
        this.harga = harga;
        this.warna = warna ;
        this.keypad = keypad;
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
    public void setKeypad(boolean keypad){
        this.keypad = keypad;
    }    
    public boolean hasKeypad() {
        return keypad;
    }
    
    @Override
    public void Tampil(){
    System.out.println(" Merk Handphone     : "+ this.getMerk());
    System.out.println(" Seri Handphone     : "+ this.getSeri());        
    System.out.println(" Kapasitas Memory   : "+ this.getKapasitas()+" GB");
    System.out.println(" Harga Handphone    : Rp. "+ this.getHarga());
    System.out.println(" Warna Handphone    : "+ this.getWarna());
    System.out.println(" Menggunakan Keypad : "+ this.hasKeypad());    
    System.out.print("\n");
    }
    public void Tampil(String judul){
        System.out.println(judul);
        
    }

}
    

