package Posttest5;

public abstract class Data {
// Kelas Handphone sebagai superclass
    protected String merk;
    protected String seri;
    protected int kapasitas;
    protected int harga;
    protected String warna;
    
    protected abstract void Tampil();    
    protected abstract String getMerk();
    public abstract String getSeri();   
    public abstract int getKapasitas();  
    public abstract int getHarga();    
    public abstract String getWarna();
    public abstract void setMerk(String merk);
    public abstract void setSeri(String seri);
    public abstract void setKapasitas(int kapasitas);
    public abstract void setHarga(int harga);
    public abstract void setWarna(String warna);


}

 

    
          
    

