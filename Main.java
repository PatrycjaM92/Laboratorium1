package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main start =new Main();


        //zad.5
        Scanner sc = new Scanner(System.in);
        int liczba;
        System.out.print("Podaj liczbę: ");
        liczba = sc.nextInt();
        System.out.println("Liczba jest podzielna przez 2 i przez 5: "+start.podzielnosc(liczba));

        //zad.6
        double liczba2;
        System.out.print("Podaj liczbę ");
        liczba2=sc.nextDouble();
        System.out.println(("Liczba "+ liczba2+" podniesiona do potęgo 3 wynosi: "+ start.potegaTrzecia(liczba2)));

        //zad. 7

        int liczba3;
        System.out.print("Podaj liczbę ");
        liczba3=sc.nextInt();
        System.out.println(("Pierwiastek kwadratowy z liczby  "+liczba3+" wynosi: "+ start.pierwiastekKwad(liczba3)));

        //zad.8

        double bokA,bokB,bokC;
        double a,b;
        System.out.println("Podaj przedział liczb z którego mają zostać wylosowane długości boków trojkąta: ");
        System.out.print("Od : ");
        a=sc.nextDouble();
        System.out.print(" Do: ");
        b=sc.nextDouble();
        Random rand=new Random();
        bokA=rand.nextDouble()*(b-a)+a;
        bokB=rand.nextDouble()*(b-a)+a;
        bokC=rand.nextDouble()*(b-a)+a;


        System.out.println("Wylosowano następujace długości: "+ bokA+", "+bokB+", "+bokC);
        System.out.println("Trójkąt zbudowany z powyższych boków jest prostokątny? "+start.czyProstokatny(bokA,bokB,bokC));








    }

    // zadanie 5
    public  boolean podzielnosc(int liczba){

        if(liczba% 2==0 && liczba %5==0){
            return true;
        }
        else return false;

    }

    // zadanie 6
    public  double potegaTrzecia(double liczba){
        return Math.pow(liczba,3);
    }

    //zadanie 7
    public  double pierwiastekKwad(int liczba){
        return Math.sqrt(liczba);
    }

    public  boolean czyProstokatny(double a,double b,double c){

        if(a*a==b*b+c*c){
            return true;
        }
        else if(b*b==a*a+c*c){
            return true;
        }
        else if(c*c==a*a+b*b){
            return true;

        }
        else return false;




   }
}
