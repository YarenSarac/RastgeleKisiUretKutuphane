/**  *  * @author YAREN SARAÇ-MERVE KARDEŞ yaren.sarac@ogr.sakarya.edu.tr-merve.kardes@ogr.sakarya.edu.tr * @since 24.04.2020  * RastgeleKisi sınıfımı oluşturduk.  */ 

package Mypackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class RastgeleKisi {

    public String İsimUret() throws InterruptedException, IOException {
        
      // String[] dizi=new dizi[];     
         Rastgele rast=new Rastgele();
         String isim ;
         String[] texts = new String[3000]; //3000 tane isim var.
         BufferedReader reader;
    
          reader=new BufferedReader(new FileReader("random_isimler.txt"));
          String line=reader.readLine();
           int i=0;
           
          while(line!=null){    
              texts[i]= line;
              line=reader.readLine();
              i++;          
          }      
          isim=texts[(rast.Rastgelefonk(3000))];
          return isim;
    }
}
