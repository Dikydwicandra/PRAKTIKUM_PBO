package Posttest6;


import java.util.*;
import java.io.*;

public class Main {

    static ArrayList<Smartphone> smartphone = Admin.getsmartphone();
    static ArrayList<Hpbiasa> hpbiasa = Admin.gethp();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Admin admin1 = new Admin("admin","1234");
    
    public static void main(String[]args) throws IOException, InterruptedException{
        
        while (true){
            
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("========================");
            System.out.println("|    SELAMAT DATANG    |");
            System.out.println("========================");
            System.out.println("|1| Admin              |");
            System.out.println("|2| Custemer           |");
            System.out.println("|3| Exit               |");
            System.out.println("========================");
            System.out.print("Masukkan Pilihan Anda : ");
            int pilih = Integer.parseInt(br.readLine());
            System.out.println("========================");
            if(pilih==1){
                loginadmin();
            }else if(pilih==2){
                custemer();
            }else if(pilih==3){
               System.exit(0);
            }else{
                System.out.println("Lihat Pilihan Baik-Baik !!!");
            }
        }
    }
public static void loginadmin()throws IOException{
    System.out.println("===========================");
    System.out.println("|       Login Admin       |");
    System.out.println("===========================");
    boolean login = false;
    do {
        System.out.print("Masukkan Username  : ");
        String username = br.readLine();
        System.out.print("Masukkan Pasword   : ");
        String password = br.readLine();
        if (username.equals(admin1.getUsername()) && password.equals(admin1.getPassword())){
            login = true;
            admin1.menu();
        }else {
            System.out.println("Salahhhhhhh");
            
                break;
            }
        
    }while(!login);
    
}

public static void custemer() throws IOException{
    while(true){
 
    System.out.println("=============================");
    System.out.println("|       Data Handphone      |");
    System.out.println("=============================");
    System.out.println("1. Data Smartphone  ");
    System.out.println("2. Data Handphone Biasa");
    System.out.println("3. EXIT");
    System.out.println("=============================");
    System.out.print("Masukkan Pilihan Anda : ");
    int pilih= Integer.parseInt(br.readLine());
    System.out.println("=============================");
    if(pilih==1){
        if(smartphone.isEmpty()){
            System.out.print("    ||| Data Kosong |||     ");
            br.readLine();
        }else {
            smartphone.get(0).Tampil("Data Smartphone");
            for (int i = 0; i<smartphone.size(); i++){
            System.out.println ("Data ke -"+(i+1));
            smartphone.get(i).Tampil();
        }
        }berhenti();
    }else if(pilih == 2) {
        if(hpbiasa.isEmpty()){
            System.out.print("    ||| Data Kosong |||     ");
            br.readLine();
        }else {for (int i = 0; i<hpbiasa.size(); i++){
            System.out.println ("Data ke -"+(i+1));
            hpbiasa.get(i).Tampil();
            }berhenti();
            
        }
    }else if(pilih==3){
        return;
    }
    else{
        System.out.println("Lihat Pilihan Baik-Baik !!!");
    }
}          
}
public static void berhenti() throws IOException{
    System.out.println("Tekan Enter Untuk Melanjutkan");
    br.readLine();
}
}
