/**  *  * @author YAREN SARAÇ-Merve KARDEŞ yaren.sarac@ogr.sakarya.edu.tr-merve.kardes@ogr.sakarya.edu.tr* @since 24.04.2020  * IMEINo sınıfımı oluşturduk.  */ 

package Mypackage;
import Mypackage.Rastgele;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class IMEINo
{
    
    public  String imeiNo() throws InterruptedException
            
     {
         Rastgele ras=new Rastgele(); 
         int imeiNo[]=new int[12];
         String noİmei[]=new String[12];
         
         String ilkiki;
         String satir="";
         String[]kodlar={"10","30","33","35","44","45","49","50","51","52","53","54","86","91","98","99"};
         int random_sayi;
         random_sayi = ras.Rastgelefonk(16);
        
        ilkiki= kodlar[random_sayi]; 
        int[] deger=ilkiki.chars().map(Character::getNumericValue).toArray();
       
         for(int i=0;i<12;i++)
         {           
             imeiNo[i]=ras.Rastgelefonk(10);
             noİmei[i]=String.valueOf(imeiNo[i]);
             satir=satir+noİmei[i];
         }        
         int toplam1=0;
         for(int i=1;i<2;i++)
         {
             deger[i]=deger[i]*2;
             if(deger[i]>9)
            {
                deger[i]=(deger[i]%10)+1;
            }
             toplam1+=deger[i];
         }
         for(int j=11;j>=1;j-=2)
         {
            imeiNo[j]=imeiNo[j]*2;
            
            if(imeiNo[j]>9)
            {
                imeiNo[j]=(imeiNo[j]%10)+1;
            }
            toplam1+=imeiNo[j];           
         }                
         int toplam2=0; 
         for(int i=0;i<1;i++)
         {
            toplam2+=deger[i]; 
         }
         for(int k=10;k>=0;k-=2)
         {
           toplam2+=imeiNo[k];        
         }       
         int  tamToplam= toplam1+toplam2;

         int sonSayi=(tamToplam*9)%10;
         String sson=String.valueOf(sonSayi);
         
         return (ilkiki+satir+sson);
        
     } 
    
  public void Kontrolİmei() throws FileNotFoundException, UnsupportedEncodingException, IOException
  {
        int a=1;
        int yanlis=0;
        int dogru=0;
        String line ;           
        String words[] = null; 
        
           File file = new File("Kisiler.txt");
          
       BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
  
                    
         while((line = br.readLine()) != null)
        {
          
          words = line.split("\\s");         
          String kelime= words[5];
          String ifade= kelime.substring(kelime.indexOf("(")+1, kelime.indexOf(")"));
          int[] deger1=ifade.chars().map(Character::getNumericValue).toArray();
          
        if(ifade.length()!=15)
        {
            yanlis++;
            a++;
        }
        else
        {
            if(deger1[0]==2||deger1[0]==6||deger1[0]==7){
                yanlis++;
                a++;
            }
            else
            {
                 if(deger1[0]==0)
        {
          if(deger1[1]!=1){
              yanlis++;
              a++;
          }
        }
        else if(deger1[0]==1)
        {
            if(deger1[1]!=0){
                yanlis++;
                a++;
            }
        }
         else if(deger1[0]==3)
        {
            if(deger1[1]!=0&&deger1[1]!=3&&deger1[1]!=5){
                yanlis++;
                a++;
            }
        }
         else if(deger1[0]==4)
        {
            if(deger1[1]!=4&&deger1[1]!=5&&deger1[1]!=9){
                yanlis++;
                a++;
            }
        }
            else if(deger1[0]==5)
        {
            if(deger1[1]!=0&&deger1[1]!=2&&deger1[1]!=3&&deger1[1]!=4&&deger1[1]!=1){
                yanlis++;
                a++;
            }
        }
         else if(deger1[0]==8)
        {
            if(deger1[1]!=6){
                yanlis++;
                a++;
            }
        }
           else if(deger1[0]==9)
        {
            if(deger1[1]!=1&&deger1[1]!=8&&deger1[1]!=9){
                yanlis++;
                a++;
            }
        }
            }
           int imeitoplam=0;
             if(a==1)
             {
                for(int i=0;i<14;i++)
                {
                    if(i%2==0)
                    {
                    imeitoplam+=deger1[i];
                    }
                    else
                    { 
                    deger1[i]*=2;
                        if(deger1[i]>9)
                        {
                        imeitoplam+=(deger1[i]%10)+1;
                        }
                        else
                        {
                        imeitoplam+=deger1[i];
                        }
                    }
                }
                if(deger1[14]!=(imeitoplam*9)%10)
                {
                yanlis++;
                }
                else
                {
                dogru++;
                }

             }     
        }  
  } 
                  
         System.out.println("İMEİ Kontrol");
         System.out.println(dogru+"    GEÇERLİ");
         System.out.println(yanlis+"    GEÇERSİZ");
  }
 
}


