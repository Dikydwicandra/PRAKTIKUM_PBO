/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;



/**
 *
 * @author ROG
 */
public class Hpbiasa extends Data {
    private boolean keypad;
    
    public Hpbiasa(String merk,String seri,int kapasitas, int harga, String warna, boolean keypad) {
        super(merk,seri,kapasitas, harga, warna);
        this.keypad = keypad;
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
    

