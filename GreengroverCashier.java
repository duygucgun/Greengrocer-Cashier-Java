package javabootcampweek1;

  import java.util.Scanner;
public class GreengrocerCashier{
    public static void main (String [] args){
        
        System.out.println("Armut kaç kilo? ");
        Scanner armutkilo = new Scanner(System.in);
        int armut = armutkilo.nextInt();

        System.out.println("Elma kaç kilo? ");
        Scanner elmakilo = new Scanner(System.in);
        int elma = elmakilo.nextInt();

        System.out.println("Domates kaç kilo? ");
        Scanner domateskilo = new Scanner(System.in);
        int domates = domateskilo.nextInt();

        System.out.println("Muz kaç kilo? ");
        Scanner muzkilo = new Scanner(System.in);
        int muz = muzkilo.nextInt();

        System.out.println("Patlıcan kaç kilo? ");
        Scanner patlicankilo = new Scanner(System.in);
        int patlican = patlicankilo.nextInt();

        float toplam = (float) ((armut*2.14) + (elma*3.67) + (domates*1.11) + (muz*0.95) + (patlican*5.00));

        System.out.println("Toplam: " +toplam);

    }

}
