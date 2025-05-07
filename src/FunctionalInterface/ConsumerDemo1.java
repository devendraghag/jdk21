package FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo1 implements Consumer<Integer> {
    @Override
    public void accept(Integer t){
        System.out.println("Printing "+ t);
    }
    public static void main (String args[]){
        ConsumerDemo1 demo1 = new ConsumerDemo1();
        demo1.accept(1111);
    }
}
