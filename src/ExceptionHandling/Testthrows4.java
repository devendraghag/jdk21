package ExceptionHandling;

import java.io.*;
class M2{
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
}  
class Testthrows4{  
   public static void main(String args[])throws IOException{//declare exception  
     M2 m=new M2();
     m.method();  
  
    System.out.println("normal flow...");  
  }  
}  