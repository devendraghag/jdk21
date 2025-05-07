package JavaVarargs;

class VarargsExample1{
   
 static void display(String... values){  
  System.out.println("display method invoked ");
  for(String s:values){
   System.out.println(s);
  }
 }  
  
 public static void main(String args[]){  
  
 display();//zero argument   
 display("my","name","is","varargs");//four arguments  
 }   
}
//
//void method(String... a, int... b){}//Compile time error
//
//void method(int... a, String b){}//Compile time error