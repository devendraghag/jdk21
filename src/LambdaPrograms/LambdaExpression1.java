package LambdaPrograms;

//normal class
interface Transaction {
    public void withDraw(int amt);
}
class WithDraw implements Transaction {

    @Override
    public void withDraw(int amt) {
        System.out.print("Amount withdraw" + amt);
    }
}
public class LambdaExpression1 {
    public static void main(String[] args) {
        WithDraw obj = new WithDraw();
        obj.withDraw(1111);
    }
}
