package Posttest3;

import java.util.*;
import java.io.*;

public class Main {
//    static ArrayList<Data> data = new ArrayList<>();
    static ArrayList<Smartphone> smartphone = new ArrayList<>();
    static ArrayList<Hpbiasa> hpbiasa = new ArrayList<>();
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
                simpandata();
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
    System.out.println("1. Data Smartphone  ");
    System.out.println("2. Data Handphone Biasa");
    System.out.println("===========================");
    System.out.print("Masukkan Pilihan Anda : ");
    int pilih= Integer.parseInt(br.readLine());
    System.out.println("===========================");
    if(pilih==1){
        System.out.print(" Merk Handphone     : ");
        String addmerk= br.readLine();
        System.out.print(" Seri Handphone     : ");
        String addseri = br.readLine();
        System.out.print(" Kapasitas Memory   : ");
        int addkapasitas = Integer.parseInt(br.readLine());
        System.out.print(" Harga Handphone    : ");
        int addharga = Integer.parseInt(br.readLine());
        System.out.print(" Warna Handphone    : ");
        String addwarna= br.readLine();
        System.out.print(" Sistem Os Handphone: ");
        String addos = br.readLine();

        Smartphone smartphonebaru = new Smartphone(addmerk,addseri,addkapasitas,addharga,addwarna,addos);
        smartphone.add(smartphonebaru);
    }else if (pilih==2){
        boolean addkeypad;
        System.out.print(" Nama Handphone     : ");
        String addmerk1= br.readLine();
        System.out.print(" Seri Handphone     : ");
        String addseri1 = br.readLine();
        System.out.print(" Kapasitas Memory   : ");
        int addkapasitas1 = Integer.parseInt(br.readLine());
        System.out.print(" Harga Handphone    : ");
        int addharga1 = Integer.parseInt(br.readLine());
        System.out.print(" Warna Handphone    : ");
        String addwarna1= br.readLine();
        System.out.print(" Menggunakan Keyped : ");
        System.out.println(" 1. Yes");
        System.out.println("2. No");
        int pilihan = Integer.parseInt(br.readLine());
        if (pilihan==1){
            addkeypad = true;  
        }else {
            addkeypad =false;
        }
                

        Hpbiasa hpbiasabaru = new Hpbiasa(addmerk1,addseri1,addkapasitas1,addharga1,addwarna1,addkeypad);
        hpbiasa.add(hpbiasabaru);
       
    }else{
        System.out.println("Lihat Pilihan Baik-Baik !!!");
    }
}
public static void lihatdata() throws IOException{
    System.out.println("=============================");
    System.out.println("|       Data Handphone      |");
    System.out.println("=============================");
    System.out.println("1. Data Smartphone  ");
    System.out.println("2. Data Handphone Biasa");
    System.out.println("=============================");
    System.out.print("Masukkan Pilihan Anda : ");
    System.out.println("=============================");
    int pilih= Integer.parseInt(br.readLine());
    if(pilih==1){
        if(smartphone.isEmpty()){
            System.out.print("    ||| Data Kosong |||     ");
            br.readLine();
        }else {for (int i = 0; i<smartphone.size(); i++){
            System.out.println ("Data ke -"+(i+1));
            System.out.println(" Merk Handphone      : "+ smartphone.get(i).getMerk());
            System.out.println(" Seri Handphone      : "+ smartphone.get(i).getSeri());
            System.out.println(" Kapasitas Memory    : "+smartphone.get(i).getKapasitas()+" GB");
            System.out.println(" Harga Handphone     : "+ smartphone.get(i).getHarga());
            System.out.println(" Warna Handphone     : "+ smartphone.get(i).getWarna());
            System.out.println(" Sistem Os Handphone : "+ smartphone.get(i).getOs());
            System.out.println("==========================");
            System.out.print("\n");
        }
        }
    }else if(pilih == 2) {
        if(hpbiasa.isEmpty()){
            System.out.print("    ||| Data Kosong |||     ");
            br.readLine();
        }else {for (int i = 0; i<hpbiasa.size(); i++){
            System.out.println ("Data ke -"+(i+1));
            System.out.println(" Merk Handphone     : "+ hpbiasa.get(i).getMerk());
            System.out.println(" Seri Handphone     : "+ hpbiasa.get(i).getSeri());
            System.out.println(" Kapasitas Memory   : "+ hpbiasa.get(i).getKapasitas()+" GB");
            System.out.println(" Harga Handphone    : "+ hpbiasa.get(i).getHarga());
            System.out.println(" Warna Handphone    : "+ hpbiasa.get(i).getWarna());
            System.out.println(" Menggunakan Keypad : "+ hpbiasa.get(i).hasKeypad());
            System.out.println("==========================");
            System.out.print("\n");
            }
            
        }
    }else{
        System.out.println("Lihat Pilihan Baik-Baik !!!");
    }
            }
          

public static void hapusdata() throws IOException{
    System.out.println("========================");
    System.out.println("|     Hapus Data HP    |");
    System.out.println("========================");
    System.out.println("1. Data Smartphone  ");
    System.out.println("2. Data Handphone biasa");
    System.out.println("========================");
    System.out.print("Masukkan Pilihan Anda : ");
    int pilih= Integer.parseInt(br.readLine());
    System.out.println("========================");
    if(pilih==1){
        Hapus hps = new Hapus();
        hps.tanyaidx();
        int index = Integer.parseInt(br.readLine());
        System.out.println("========================");   
        smartphone.remove(index-1);
        System.out.println("Data Berhasil Dihapus");
    }else if (pilih==2){
        Hapus hps = new Hapus();
        hps.tanyaidx();
        int index = Integer.parseInt(br.readLine());
        System.out.println("========================");   
        hpbiasa.remove(index-1);
        System.out.println("Data Berhasil Dihapus");
    }else{
        System.out.println("Lihat Pilihan Baik-Baik !!!");
    }
    
}
public static void ubahdata() throws IOException {
    System.out.println("============================");
    System.out.println("|        Ubah Data Hp      |");
    System.out.println("============================");
    System.out.println("1. Data Smartphone  ");
    System.out.println("2. Data Handphone Biasa");
    System.out.println("============================");
    System.out.print("Masukkan Pilihan Anda : ");
    int pilih= Integer.parseInt(br.readLine());
    System.out.println("===========================");
    
    if (pilih==1){
        System.out.print(" Ubah Data Hp Ke : ");
        int index = Integer.parseInt(br.readLine());
        System.out.print(" Merk Handphone      : ");
        String setMerk = br.readLine();
        System.out.print(" Seri Handphone     : ");
        String setSeri = br.readLine();
        System.out.print(" Kapasitas Memory   : ");
        int setKapasitas = Integer.parseInt(br.readLine());
        System.out.print(" Harga Handphone     : ");
        int setHarga = Integer.parseInt(br.readLine());
        System.out.print(" Warna Handphone     : ");
        String setWarna = br.readLine();
        System.out.print(" Sistem Os Handphone : ");
        String setOs = br.readLine();


        System.out.println("============================");
        smartphone.get(index-1).setMerk(setMerk);
        smartphone.get(index-1).setSeri(setSeri);
        smartphone.get(index-1).setKapasitas(setKapasitas);
        smartphone.get(index-1).setWarna(setWarna);
        smartphone.get(index-1).setHarga(setHarga);
        smartphone.get(index-1).setOs(setOs);
        }else if(pilih==2) {
            boolean keypad;
            System.out.println("============================");
            System.out.println("|        Ubah Data Hp      |");
            System.out.println("============================");
            System.out.print(" Ubah Data Hp Ke : ");
            int index = Integer.parseInt(br.readLine());
            System.out.print(" Merk Handphone   : ");
            String setMerk = br.readLine();
            System.out.print(" Seri Handphone     : ");
            String setSeri = br.readLine();
            System.out.print(" Kapasitas Memory   : ");
            int setKapasitas = Integer.parseInt(br.readLine());
            System.out.print(" Harga Handphone  : ");
            int setHarga = Integer.parseInt(br.readLine());
            System.out.print(" Warna Handphone  : ");
            String setWarna = br.readLine();

            System.out.println("Menggunakan Keyped : ");
            System.out.println(" 1. Yes");
            System.out.println(" 2. No");
            int pilihan = Integer.parseInt(br.readLine());
            if (pilihan==1){
                    keypad = true;  
            }else {
                    keypad =false;
                }


        System.out.println("============================");
        hpbiasa.get(index-1).setMerk(setMerk);
        hpbiasa.get(index-1).setSeri(setSeri);
        hpbiasa.get(index-1).setKapasitas(setKapasitas);
        hpbiasa.get(index-1).setWarna(setWarna);
        hpbiasa.get(index-1).setHarga(setHarga);
        hpbiasa.get(index-1).setKeypad(keypad);

        }else{
            System.out.println("Lihat Pilihan Baik-Baik !!!");
        }

        }
public static void berhenti() throws IOException{
    System.out.println("Tekan Enter Untuk Melanjutkan");
    br.readLine();
}
public static void simpandata()throws IOException{
        System.out.println("Data Berhasil Disimpan");
        
    }
}
