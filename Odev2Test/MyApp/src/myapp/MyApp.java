
/**  *  * @author YAREN SARAÇ-MERVE KARDEŞ yaren.sarac@ogr.sakarya.edu.tr-merve.kardes@ogr.sakarya.edu.tr * @since 24.04.2020  * Test sınıfımı oluşturduk.  */ 


package myapp;
import Mypackage.Kisi;
import Mypackage.IMEINo;
import Mypackage.KimlikNo;
//import Mypackage.Rastgele;
//import Mypackage.Telefon;
//import Mypackage.RastgeleKisi;
import java.io.IOException;
import java.util.Scanner;

public class MyApp 
{

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws InterruptedException, IOException 
    {
       
     int x=0;     
     while(x!=3)         
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("1-Rastgele Kisi Üret.");
       System.out.println("2-Uretilmis Dosya Kontrol Et.");
       System.out.println("3-Cikis");
       x=sc.nextInt();
       Scanner sc1=new Scanner(System.in);
        switch (x) {
            case 1:
                
                System.out.println("Kac kisi olusturmak istiyorsunuz giriniz.");              
                Kisi yeniKisi=new Kisi();
                int b;              
                b=sc1.nextInt();              
                yeniKisi.yazdir(b);
                break;
            case 2:
                IMEINo imeiino=new IMEINo();
                KimlikNo kimliik=new KimlikNo();
                kimliik.KontrolTc();
                imeiino.Kontrolİmei();
                break;
            default:
                System.out.println("Sistemden cıkıs yaptiniz.");
                break;
        }                     
        }    
    }
}