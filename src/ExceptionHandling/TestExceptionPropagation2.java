package ExceptionHandling;

class TestExceptionPropagation2{
  void m(){
   // throw new java.io.IOException("device error");//checked exception
  }
  void n(){  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handeled");}  
  }  
  public static void main(String args[]){  
   TestExceptionPropagation2 obj=new TestExceptionPropagation2();  
   obj.p();  
   System.out.println("normal flow");  
  }  
}

//java: unreported exception java.io.IOException; must be caught or declared to be thrown