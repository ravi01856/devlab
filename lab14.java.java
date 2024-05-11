import java.io.*;
class lab14
{
   public static void main(String args[])throws Exception
    { 
       FileInputStream fis=new FileInputStream("C:\\javaprograms\\adf.txt");
       FileOutputStream fos=new FileOutputStream("C:\\javaprograms\\ab.txt");
       int data;
       while((data=fis.read())!=-1)
      {  
         fos.write(data);
      }
fis.close();
      FileInputStream f1=new FileInputStream("C:\\javaprograms\\ab.txt");
       int d;
       while((d=f1.read())!=-1)
       {
          System.out.println("data:"+d+"\t"+(char)d);

       }
      f1.close();
      fos.close();
}
}
