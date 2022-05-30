/**  *  * @author YAREN SARAÇ-MERVE KARDEŞ yaren.sarac@ogr.sakarya.edu.tr- merve.kardes@ogr.sakarya.edu.tr * @since 24.04.2020  * Ttelefon sınıfımı oluşturduk.  */ 
package Mypackage;
//import Mypackage.Rastgele;


public class Telefon
{
   public String telefonNo() throws InterruptedException
     {
         Rastgele ras=new Rastgele(); 
         int telNo[]=new int [12];
         String yeniTelNo[]=new String[12];
         String ilkUc;
         
          String [] kodlar = {"501","505","506","507","551","552","553","554","555","559","530","531","532","533","534","535","536","537"
                            ,"538","539","561","540","541","542","543","544","545","546","547","548","549"};
        
          
        int random_sayi;       
        random_sayi = ras.Rastgelefonk(31);       
        ilkUc= kodlar[random_sayi]; 
        String satir="";
            for(int i=3;i<(telNo.length)-2;i++)
         {                            
            int telle;
            telle=ras.Rastgelefonk(10);
            int telefonNo;
            telefonNo = telle;
            telNo[i]=telefonNo;
        }      
            for(int k=3;k<(telNo.length)-2;k++)
        {
             yeniTelNo[k]=String.valueOf(telNo[k]);
             satir=satir+yeniTelNo[k];            
        } 
            
          return (0+ilkUc+satir);
     }
    
}
