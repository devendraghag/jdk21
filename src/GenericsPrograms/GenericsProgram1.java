package GenericsPrograms;

import java.util.ArrayList;
import java.util.List;

public class GenericsProgram1 {
    public static void main(String[] args) {
        String [] names = new String [1000];
        names[0] = "abc";
        //names[1] = 1; this is not allowed because array are type safe and throw incompatablity error

        System.out.println(names[0]);
        System.out.println(names[1]); // this will work fine bcz of above comment



        ArrayList list = new ArrayList(); // raw type
        list.add("abc");
        list.add(new String("")); // this is allowed in collection bcz they are not type safe

        String value1 = (String) list.get(0); // OK
      //  String value2 = (String) list.get(1); // Runtime error: Integer can't be cast to String

        

        ArrayList<String> names1 = new ArrayList<String>();
        names1.add("abc");
       // names1.add(1);//this is not allowed because collection classes have used generic concept to achive type safe operation
    }
}
