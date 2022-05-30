/**  *  * @author YAREN SARAÇ-MERVE KARDEŞ yaren.sarac@ogr.sakarya.edu.tr-merve.kardes@ogr.sakarya.edu.tr * @since 24.04.2020  * Kisi sınıfımı oluşturduk.  */ 

package Mypackage;
import Mypackage.IMEINo;
import Mypackage.KimlikNo;
import Mypackage.Rastgele;
import Mypackage.RastgeleKisi;
import Mypackage.Telefon;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Kisi {
    
    private double tcKimlik;
    private  String isimSoyisim;
    private  int yas;
    private int telefon;
    
   
    public void yazdir(int i) throws FileNotFoundException, InterruptedException, IOException
    {
       File f=new File("Kisiler.txt");
       BufferedWriter Writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f))); 
       
     for(int k=0;k<i;k++)
     {        
     Rastgele rast=new Rastgele();          
     RastgeleKisi rs1=new RastgeleKisi();
     KimlikNo kno=new KimlikNo();
     Telefon tell=new Telefon();
     IMEINo imei=new IMEINo();
     
      String isim=rs1.İsimUret();
      yas=rast.Rastgelefonk((101));
      
      
      String yas1;
      yas1 = String.valueOf(yas);
      String tcToplam=kno.tcUret();
      String telefonum;
      telefonum=tell.telefonNo();
      String imeiNo;
      imeiNo=imei.imeiNo();
      Writer.append(tcToplam + " "+isim+" "+yas1+" "+telefonum+" "+"("+imeiNo+")");
           
      Writer.newLine();
      Writer.flush();
      
      }      
    }
    
    
}
