package Posttest2;

import POSTTEST1.*;

public class Data {

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the warna
     */
    public String getWarna() {
        return warna;
    }

    /**
     * @param warna the warna to set
     */
    public void setWarna(String warna) {
        this.warna = warna;
    }

    /**
     * @return the kapasitas
     */
    public int getKapasitas() {
        return kapasitas;
    }

    /**
     * @param kapasitas the kapasitas to set
     */
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    /**
     * @return the harga
     */
    public int getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(int harga) {
        this.harga = harga;
    }
    private String nama;
    private String warna;
    private int kapasitas;
    private int harga;
    
    public Data(String nama, String warna, int kapasitas, int harga){
        this.nama = nama;
        this.warna = warna;
        this.kapasitas = kapasitas;
        this.harga = harga;
    }
    
    public void simpandata(){
        System.out.println("Data Berhasil Disimpan");
        
    }

    
          
    
}
