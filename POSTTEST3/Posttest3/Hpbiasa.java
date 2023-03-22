/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest3;

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
}
    

