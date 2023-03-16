package Posttest2;
import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Data> data = new ArrayList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[]args) throws IOException, InterruptedException{
        
        while (true){
            
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("========================");
            System.out.println("|     PENDATAAN HP     |");
            System.out.println("========================");
            System.out.println("|1| Tambah Data        |");
            System.out.println("|2| Lihat Data         |");
            System.out.println("|3| Hapus Data         |");
            System.out.println("|4| Ubah Data          |");
            System.out.println("|5| Exit               |");
            System.out.println("========================");
            System.out.print("Masukkan Pilihan Anda : ");
            int pilih = Integer.parseInt(br.readLine());
            System.out.println("========================");
            if(pilih==1){
                tambahdata();
                berhenti();
            }else if(pilih==2){
                lihatdata();
                berhenti();
            }else if(pilih==3){
                hapusdata();
                berhenti();
            }else if(pilih==4){
                ubahdata();
                berhenti();
            }else if(pilih==5){
                System.out.println("Terima Kasih Telah Menggunakan Program Ini");
                System.exit(0);
                
            }else{
                System.out.println("Lihat Pilihan Baik-Baik !!!");
            }
        }
    }
    
    
public static void tambahdata() throws IOException{
    System.out.println("===========================");
    System.out.println("|      Tambah Data Hp     |");
    System.out.println("===========================");
    System.out.print(" Nama Handphone   : ");
    String addnama = br.readLine();
    System.out.print(" Warna Handphone  : ");
    String addwarna = br.readLine();
    System.out.print(" Kapasitas Memory : ");
    int addkapasitas = Integer.parseInt(br.readLine());
    System.out.print(" Harga Handphone  : ");
    int addharga = Integer.parseInt(br.readLine());
    System.out.println("===========================");
    Data databaru = new Data(addnama,addwarna,addkapasitas,addharga);
    data.add(databaru);
    databaru.simpandata();
}
public static void lihatdata() throws IOException{
    System.out.println("=============================");
    System.out.println("|       Data Handphone      |");
    System.out.println("=============================");
    
        if(data.isEmpty()){
            System.out.print("    ||| Data Kosong |||     ");
            br.readLine();
        
        }else {for (int i = 0; i<data.size(); i++){
            System.out.println ("Data ke -"+(i+1));
            System.out.println(" Nama Handphone   : "+ data.get(i).getNama());
            System.out.println(" Warna Handphone  : "+ data.get(i).getWarna());
            System.out.println(" Kapasitas Memory : "+ data.get(i).getKapasitas()+" GB");
            System.out.println(" Harga Handphone  : "+ data.get(i).getHarga());
            System.out.println("==========================");
            System.out.print("\n");
        }
    }
}      

public static void hapusdata() throws IOException{
    System.out.println("========================");
    System.out.println("|     Hapus Data HP    |");
    System.out.println("========================");
    Hapus hps = new Hapus();
    hps.tanyaidx();
    int index = Integer.parseInt(br.readLine());
    System.out.println("========================");   
    data.remove(index-1);
    System.out.println("Data Berhasil Dihapus");
}
public static void ubahdata() throws IOException {
    System.out.println("============================");
    System.out.println("|        Ubah Data Hp      |");
    System.out.println("============================");
    System.out.print(" Ubah Data Hp Ke : ");
    int index = Integer.parseInt(br.readLine());
    System.out.print(" Nama Handphone   : ");
    String setNama = br.readLine();
    System.out.print(" Warna Handphone  : ");
    String setWarna = br.readLine();
    System.out.print(" Kapasitas Memory : ");
    int setKapasitas = Integer.parseInt(br.readLine());
    System.out.print(" Harga Handphone  : ");
    int setHarga = Integer.parseInt(br.readLine());
    System.out.println("============================");
    data.get(index-1).setNama(setNama);
    data.get(index-1).setWarna(setWarna);
    data.get(index-1).setKapasitas(setKapasitas);
    data.get(index-1).setHarga(setHarga);
    
    }
public static void berhenti() throws IOException{
    System.out.println("Tekan Enter Untuk Melanjutkan");
    br.readLine();
}
}
