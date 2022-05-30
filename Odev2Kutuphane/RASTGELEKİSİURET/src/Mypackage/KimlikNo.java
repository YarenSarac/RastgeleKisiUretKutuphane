/**  *  * @author YAREN SARAÇ-Merve KARDEŞ yaren.sarac@ogr.sakarya.edu.tr-merve.kardes@ogr.sakarya.edu.tr * @since 24.04.2020  * KimlikNo sınıfımı oluşturduk.  */ 
package Mypackage;
import Mypackage.Rastgele;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KimlikNo 
{
  public String tcUret() throws InterruptedException
    {
           Rastgele ras=new Rastgele();
           int dizi[]=new int[12];             
           String kimlik[]=new String[12]; 
           String toplam="";
           
        for(int i=1;i<=9;i++)
        {                        
                 dizi[i]=ras.Rastgelefonk(10);
                 
                 if(dizi[1]==0)
                 { 
                  while(true)
                  {                       
                       if(ras.Rastgelefonk(10)!=0)
                       {
                           break;
                       }
                  }
                  dizi[1]=ras.Rastgelefonk(10);
                 }                          
        }      
           int sonuc1= ((dizi[1]+dizi[3]+dizi[5]+dizi[7]+dizi[9])*7)-(dizi[2]+dizi[4]+dizi[6]+dizi[8]);
           int onbulma=sonuc1%10;
            dizi[10]=onbulma;
                      
           int sonuc2= dizi[1]+dizi[2]+dizi[3]+dizi[4]+dizi[5]+dizi[6]+dizi[7]+dizi[8]+dizi[9]+dizi[10];
           int onbirbulma=sonuc2%10;
           dizi[11]=onbirbulma;
     
           for(int k=1;k<=11;k++)
           {
               kimlik[k]=String.valueOf(dizi[k]);
               toplam=toplam+kimlik[k];
           }          
           return toplam;
    }
  
    public void KontrolTc() throws FileNotFoundException, IOException
    {
        
      //  BufferedReader re
      //  reader=new BufferedReader(new FileReader("Kisiler.txt"));
        
        int yanlis=0;
        int dogru=0;
        String line ;           
        String words[] = null; 
        
           File file = new File("Kisiler.txt");
           
         BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
                       
         while((line = br.readLine()) != null)
        {         
           words = line.split("\\s");
           String kelime= words[0];
           int[] deger=kelime.chars().map(Character::getNumericValue).toArray();  
        if(words[0].length()!=11)
        {
            yanlis++;
        }
        else
        {
            int sonuc1= ((deger[0]+deger[2]+deger[4]+deger[6]+deger[8])*7)-(deger[1]+deger[3]+deger[5]+deger[7]);
            if(deger[9]!=(sonuc1%10)){
                yanlis++;
            }
            else{
                int sonuc2= deger[0]+deger[1]+deger[2]+deger[3]+deger[4]+deger[5]+deger[6]+deger[7]+deger[8]+deger[9];
                if(deger[10]!=(sonuc2%10))
                {
                   yanlis++;
                }
                else{
                    dogru++;
                }              
            }
        }      
    }
        System.out.println("T.C. Kimlik Kontrol");
        System.out.println(dogru+"    GEÇERLİ");
        System.out.println(yanlis+"    GEÇERSİZ");
       
    }
   }
