package com.javaprogram;

public class LoopingArray {

    public static void main(String[] args) {
        int[] angka = {11,12,13,14,15,16,17,18,19,20};
        
        System.out.println("looping standar");
        for(int i=0; i<10; i++ ){
            System.out.println("index ke "+i+" adalah =" +angka[i]);
        }

        System.out.println("looping dengan properti length");
        for(int i=0; i<angka.length; i++ ){
            System.out.println("index ke "+i+" adalah =" +angka[i]);
        }

        System.out.println("looping dengan collection");
        for(int array : angka ){
            System.out.println("index ke "+array+" adalah =" + array);
        }

    }
}

============

package com.javaprogram;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        String input;

        Scanner inputUser = new Scanner(System.in);

        System.out.println("Panggil nama : ");
        input = inputUser.next();

        switch (input){
            case "Lautaro":
                System.out.println("Lautaro hadir pak");
                break;
            case "Barella" :
                System.out.println("Barella hadir pak");
                break;
            default:
                System.out.println("tidak hadir");
        }
        System.out.println("ini akhir dari program");
    }
}
==================
package com.javaprogram;

public class SwitchCaseEnum {

    public static void main(String[] args) {
        Color color = Color.GREEN;
        switch (color){
            case RED :
                System.out.println("Red");
                break;
            case BLUE:
                System.out.println("Blue");
                break;
            case GREEN:
                System.out.println("Green");
                break;
            default:
                System.out.println("warna tidak tersedia");
        }
    }
}
==============
package com.javaprogram;

public class Runner {

    public static void main(String[] args) {
        Class1 class1 = new Class1(9,"Julian Alvarez","Man city");
//        class1.setName("Mbappe");
//        class1.setNumber(7);
//        class1.setClub("Paris Saint Germain");
        System.out.println(class1.getName());
        System.out.println(class1.getNumber());
        System.out.println(class1.getClub());
    }
}

===================
package com.javaprogram;

public class Class1 {
    int number;
    String name;
    String club;

    public Class1(int number, String name, String club) {
        this.number = number;
        this.name = name;
        this.club = club;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClub() {
        return club;
    }
===============
package com.javaprogram;

public class Parent {
    public String parentName(){
        return "Ayah saya";
    }
    
    public Integer umurAyah(){
        return 50;
    }
}
============
package com.javaprogram;

public class Child extends Parent{
    public String namaAnak(){
        return "Anak ayah";
    }
    
    public Integer umurAnak(){
        return 12;
    }
}
=========
package com.javaprogram;

import java.util.Scanner;

public class OperasiAritmatika {

    public static void main(String[] args) {
        int nilaiA;
        int nilaiB;
        int hasil;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("input nilai A :");
        nilaiA = inputUser.nextInt();
        System.out.println("input nilai B");
        nilaiB = inputUser.nextInt();

        //penjumlahan
        hasil = nilaiA + nilaiB;
        System.out.printf("%d +%d = %d \n",nilaiA,nilaiB,hasil);

        //pengurangan
        hasil = nilaiA - nilaiB;
        System.out.printf("%d - %d = %d \n",nilaiA,nilaiB,hasil);

        //perkalian
        hasil = nilaiA * nilaiB;
        System.out.printf("%d * %d = %d \n",nilaiA,nilaiB,hasil);

        //pembagian
        hasil = nilaiA / nilaiB;
        System.out.printf("%d / %d = %d \n",nilaiA,nilaiB,hasil);

        //modulus
        hasil = nilaiA % nilaiB;
        System.out.println(hasil);
    }
}
=============
//test comment
