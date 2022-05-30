/**  *  * @author YAREN SARAÇ-MERVE KARDEŞ yaren.sarac@ogr.sakarya.edu.tr-merve.kardes@ogr.sakarya.edu.tr* @since 24.04.2020  * Rastgele sınıfımı oluşturduk.  */ 

package Mypackage;

public class Rastgele        
{  
    public int Rastgelefonk(int i) throws InterruptedException
{   
   
    long sayi = System.currentTimeMillis();
    Thread.sleep(50);
    int sayi1=(int)(sayi%i);
    return sayi1;
}
   
}