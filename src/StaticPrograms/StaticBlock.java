package StaticPrograms;

class StaticBlock {
    static {
        System.out.println("static block is invoked");
    }

    public static void main(String args[]) {
        System.out.println("Hello main");
    }
}