package Java9_Features.Try_with_Resources;

import java.io.*;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new FileReader("test.txt"));
//            try (br) { // Java 9 feature: using existing variable
//                System.out.println(br.readLine());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}


//Here, br is:
//
//declared outside
//
//assigned inside the try block
//
//used in a nested try-with-resources