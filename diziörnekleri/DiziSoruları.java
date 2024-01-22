package dizisoruları;

import java.util.Random;
import java.util.Scanner;

public class DiziSoruları {
    public static void main(String[] args) {
        // Boyutu ve elemanları dışarıdan girilen bir sayı dizisinin ortalamasını ve ortalamanın
        //üstünde ve altında olan elemanlarının sayısını gosteren programın java kodunu yazınız
        
   /*      Scanner klavye=new Scanner(System.in);
            System.out.print("Lutfen boyut degerini giriniz");
            int boyut=klavye.nextInt();
            int []dizi=new int[boyut];
            System.out.println("Dizi olusturuluyor");
            // dizi elemanlarinin tanımlanması
            for (int i = 0; i < dizi.length; i++) {
                System.out.print((i+1)+". elemani giriniz : ");
                dizi[i]=klavye.nextInt();
            }
            System.out.println("Dizi olusturuldu..");
            for (int i = 0; i < dizi.length; i++) {
                if (i%4==0) {
                    System.out.println("");
                }
                System.out.print("dizi["+i+"]="+dizi[i]);
        }
    
        //ortalama Hesaplanıyor...
        double toplam=0,ortalama;
        for (int i = 0; i < dizi.length; i++) {
            toplam=toplam+dizi[i];
        }
        ortalama=toplam/dizi.length;//ortalama=toplam/boyut
        System.out.println((boyut + " elemanli sayi dizisinin ortalamasi " + ortalama));
        //Kücük Büyük Kontrölü Yapılıyor
        int ortAlt=0, ortUst=0,ortEsit=0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]<ortalama){
                ortAlt++;
            }else if(dizi[i]>ortalama){
                ortUst++;
            }else{
                ortEsit++;
            }
        }
        System.out.println("ortalamanin altındaki eleman sayisi " +ortAlt);
        System.out.println("ortalamanin üstündeki eleman sayisi " +ortUst);
        System.out.println("ortalamaya esit eleman sayisi " +ortEsit);  */
   
    
        //Boyutu ve elemanları 0 ile 100 arasında girilen bir sayı dizisinin en küçük ve en büyük
        //elemanlarını ve elemanlarının indislerini bulan java kodunu yazınız.
        
   /*  Random rnd=new Random();
        Scanner klavye =new Scanner(System.in);
        System.out.print("Lutfen dizi boyut degerini giriniz : ");
        int boyut=klavye.nextInt();
        //dizi olusturuluyor...
        int []dizi=new int[boyut];
        System.out.println("Dizi olusturuluyor..");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=rnd.nextInt(0, 100);
        }
            // dizi yazdiriliyor...
            for (int eleman:dizi) {
                System.out.println(eleman +"   ");
        }
            System.out.println("");
        int enKucuk=dizi[0];
        int minIndex=0;
        int enBuyuk=dizi[0];
        int maxIndex=0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]<enKucuk){
                enKucuk=dizi[i];
                minIndex=i;
            }
            if (dizi[i]>enBuyuk){
                enBuyuk=dizi[i];
                maxIndex=i;
            }
        }
        System.out.println("Dizisinin en kucuk elamani dizi ["+minIndex+"]="+ enKucuk );
        System.out.println("Dizisinin en buyuk elamani dizi ["+maxIndex+"]="+ enBuyuk ); */
        
        
        // Boyutu ve elemanları dışarıdan girilen bir sayi dizisini küçükten büyüğe ve büyükten
        // küçüğe doğru sıralayan programın java kodunu giriniz.
        
/*    Scanner klavye=new Scanner(System.in);
        System.out.print("Lutfen dizi boyutunu giriniz : ");
        int boyut=klavye.nextInt();
        System.out.println("Dizi olusturuluyor...");
        int[]dizi=new int[boyut];
        //dizi elemanları tanımlanıyor
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i+1)+". elemanı giriniz: ");
            dizi[i]=klavye.nextInt();
        }
        System.out.println("");
        System.out.println("Dizi siralaniyor...");
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i] + "   ");
        }
        System.out.println("");
        int temp;
        for (int i = 0; i < dizi.length-1; i++) {
            for (int j = i+1; j < dizi.length; j++) {
                if (dizi[j]<dizi[i]){
                    temp=dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=temp;
                }
            }
        }
        System.out.println("");
        System.out.println("Kucukten Buyuge");
        for (int eleman : dizi) {
            System.out.println(eleman +"  ");
        }
        System.out.println("");
        System.out.println("Dizi siralaniyor...");
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i] + "   ");
        }
        System.out.println("");
        
        for (int i = 0; i < dizi.length-1; i++) {
            for (int j = i+1; j < dizi.length; j++) {
                if (dizi[j]>dizi[i]){
                    temp=dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=temp;
                }
            }
        }
        System.out.println("");
        System.out.println("Buyukten Kucuge");
        for (int eleman : dizi) {
            System.out.println(eleman +"  ");
        } */
        
        //Boyut değerinin kullanıcı tarafından girildiği ve 0-100 arasında rasgele sayılardan
        //oluşan bir dizide tek ve çift sayıları ayrı ayrı dizilerde gösteren programın java kodunu yazınız
       Random rnd=new Random();
        Scanner klavye=new Scanner(System.in);
        System.out.print("Boyut degerini giriniz :");
        int boyut=klavye.nextInt();
        int []dizi=new int[boyut];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=rnd.nextInt(0,100);
        }
        System.out.println("");
            int tekSay=0 , ciftSay=0;
            for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]%2==0){
                ciftSay++;
            }else {
                tekSay++;
            }
        }
        int []tekSayiDizisi=new int[tekSay];
        int tekIndex=0;
        int []ciftSayiDizisi=new int[ciftSay];
        int ciftIndex=0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==0) {
                ciftSayiDizisi[ciftIndex]=dizi[i];
                ciftIndex++;
            }else{
                tekSayiDizisi[tekIndex]=dizi[i];
                tekIndex++;
            }
        }
        System.out.println("Tek Sayiler Dizisi Yazdiriliyor...");
        for (int eleman : tekSayiDizisi) {
            System.out.println(eleman + "");
        }
        System.out.println("");
        System.out.println("Cift Sayiler Dizisi Yazdiriliyor...");
        System.out.println("");
        for (int eleman : ciftSayiDizisi ) {
            System.out.println(eleman + "");
        } 
    }
    
}
