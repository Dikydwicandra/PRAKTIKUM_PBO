package Posttest3;



public class Data {

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

// Kelas Handphone sebagai superclass
    protected String merk;
    protected String seri;
    protected int kapasitas;
    protected int harga;
    protected String warna;
    
    public Data(String merk,String seri,int kapasitas, int harga, String warna) {
        this.merk = merk;
        this.seri = seri;
        this.kapasitas= kapasitas;
        this.harga = harga;
        this.warna = warna;
    }
    
    
    public String getMerk() {
        return merk;
    }
    public String getSeri(){
        return seri;
    }
    
    public int getKapasitas(){
        return kapasitas;
    }
    
    public int getHarga() {
        return harga;
    }
    
    public String getWarna() {
        return warna;
    }
}

 

    
          
    

