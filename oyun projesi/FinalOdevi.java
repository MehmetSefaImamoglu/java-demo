package finalodevi;

import java.util.Random;
import java.util.Scanner;

public class FinalOdevi {
     public static void main(String[] args) {
    char [][] tablo= {
        {'1','1','4','5','2','6','5','5','6','7'},
        {'1','2','2','2','2','6','9','6','2','8'},
        {'8','5','2','1','8','8','8','7','3','4'},
        {'4','2','1','6','7','7','7','3','5','1'},
        {'4','2','4','6','7','1','1','5','6','2'},
        {'4','2','1','6','9','4','6','1','9','9'},
        {'4','2','7','4','9','9','9','9','1','2'},
        {'1','2','2','2','2','6','9','6','2','8'},
        {'8','5','2','1','8','8','8','7','3','4'},
        {'4','2','1','6','9','4','6','1','9','9'},
        
    };
    Scanner kullanıcı =new Scanner (System.in);
         System.out.println("Lütfen satır değeri giriniz: ");
         int satir = kullanıcı.nextInt();
         System.out.println("Lütfen sütun değeri giriniz: ");
         int sütun = kullanıcı.nextInt();
         
         degerYazdırma(tablo);
         System.out.println();
        
         oyunTablosu(satir-1,sütun-1,tablo);
        degerYazdırma(tablo); 
    }
// değişkeni alma
    private static void oyunTablosu(int satir, int sütun, char[][] tablo) {
        char temp=tablo[satir][sütun];
        degerCekme(satir, (int) sütun,tablo,temp);
                        
    }
//recursive halinde tablo gezen method
        private static void degerCekme(int satir, int sütun, char[][] tablo, char temp) {
        if (satir <0 || satir>=tablo.length || sütun<0 || sütun>=tablo[0].length || tablo[satir][sütun]!=temp){
        return; 
        }
        tablo[satir][sütun]='X';
// Sağ Kontrol        
        degerCekme(satir,sütun+1,tablo,temp);
 // sola kontrol
        degerCekme(satir,sütun-1,tablo,temp);
//asaği kontrol
        degerCekme(satir+1,sütun,tablo,temp);
//yukarı kontrol 
        degerCekme(satir-1,sütun,tablo,temp);
                
    }
    public static void degerYazdırma(char[][] tablo){
        for (char []x:tablo) {
            for (char y:x) {
                System.out.print(y+"");
            }
            System.out.println();
        }
    }
    
}
