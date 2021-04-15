
package tybaglı;
 class ogrencı{
     int no;
     String ad;
     int vize,genel;
  ogrencı ileri;
   // Object iler;
  public ogrencı(int no,int vize,int genel,String ad){
     this.no=no;
     this.vize=vize;
     this.genel=genel;
   this.ad=ad;  
 ileri=null;
  
  }
 }



public class Tybaglı  {
    
    ogrencı bas;
ogrencı son;
   
    
     
            double ortalama;
public Tybaglı(){
    bas=null;
    son=null;
    
}
   public void basekle(ogrencı yeni){
       if(son==null){
           bas=yeni;
           son=yeni;
       }
   else
           yeni.ileri=bas;
       bas=yeni;
       
   } 
   public void sonekle(ogrencı yeni){
       if(son==null){
           bas=yeni;
           son=yeni;
       }
       else{
           son.ileri=yeni;
           son=yeni;
           
       }
   }
   public void arayaekle(ogrencı yeni,int sayı){
       if(bas==null || son==null){
           basekle(yeni);
       }
       else{
           ogrencı tmp=bas;
           while(tmp.no!=sayı)
               tmp=tmp.ileri;
           if(tmp==null) sonekle(yeni);
           else yeni.ileri=tmp.ileri;
           tmp.ileri=yeni;
           System.out.println(""+yeni.no);   
       }
       
   }
   public void bastansilme(){
       bas=bas.ileri;
       if(bas==null){
           son=null;
       }
   }
   public void sondansilme(){
       ogrencı tmp=bas;
ogrencı once=null;
   while(tmp!=son){
       once=tmp;
       tmp=tmp.ileri;
       
   }
  if(once==null){
      son=null;
      bas=null;
  } 
  else{
      once.ileri=null;
      son=once;
  }
   }
   public void arananısilme(ogrencı aranan){
       ogrencı tmp=bas;
       while(tmp!=aranan){
           if(tmp==aranan){
               aranan.ileri=null;
               tmp=tmp.ileri;
           }
       }
 
           }
   void liste(){
      ogrencı tmp=bas;
       while (tmp!=null){
            System.out.print("Öğreni ad:"+tmp.ad);
           System.out.println("   Öğrenci no:"+tmp.no+" /vize:"+tmp.vize+"/ genel:"+tmp.genel);
          
           tmp=tmp.ileri;
       }
  
   }
     double notortalaması(){
   
         ogrencı tmp=bas;

         while(tmp!=null){
      ortalama=(tmp.vize*0.4)+(0.6*tmp.genel);
      if(ortalama<50){
          System.out.println("BAŞARISIZ");
      }
      else
      {
          System.out.println("BAŞARILI");
      }
   return ortalama;
 }
    return ortalama;
           
     }
     
 String gecmedurumu()
 {
     
 if(notortalaması()>=50){
     return "Geçti";
 }    
 else{
     return "Kaldı";
 }
 
 }
 void vizesienyuksek(ogrencı yeni){
      ogrencı tmp=bas; 
     while(tmp!=null){
         if(yeni.vize>tmp.vize){
             System.out.println("en büyük vize:"+yeni.vize+"  "+yeni.ad+" "+yeni.no);
         }
    tmp=tmp.ileri; }
 
 }
 public void ortalamaenyuksek(){
     ortalama=0;
ogrencı once=bas;
    ogrencı  tmp=bas;
     while(tmp!=null){
        
         ortalama=tmp.vize*0.4+tmp.genel*0.6;
      
         System.out.println(" "+tmp.no+" "+tmp.ad+" "+tmp.vize+" "+tmp.genel+" ortalama: "+ortalama);


 if(ortalama>once.vize*0.4+once.genel*0.6){
     System.out.println("");
 System.out.println(""+(tmp.vize*0.4+tmp.genel*0.6));
         
 }
   tmp=tmp.ileri;  
     
 } }
    public static void main(String[] args) {
        Tybaglı tbl=new Tybaglı();
    Tybaglı tbll=new Tybaglı();
 tbl.basekle(new ogrencı(9,45,60,"emre"));
     tbl.basekle(new ogrencı(10,50,60,"hira"));
tbl.sonekle(new ogrencı(11,70,50,"ayşe"));
//tbl.arayaekle(new ogrencı(10,50,60,"hira"),9);
//tbll.basekle( new ogrencı (13,30,70,"erim"));
//tbll.sonekle(new ogrencı(12,60,50,"kubra"));
  // tbll.vizesienyuksek(new ogrencı(12,60,50,"kubra"));
   //tbll.vizesienyuksek(new ogrencı(13,30,70,"erim"));
  
tbll.liste();
  tbl.liste();
    tbl.notortalaması();
    
 tbl.ortalamaenyuksek();
 
    }

   

}