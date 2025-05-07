package IIBPrograms;

class ExceptionHandlingIIBExample5 {
    int num;

    {
        try {
            num = Integer.parseInt("abc");  // Will throw NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Exception in IIB: " + e);
            num = -1;
        }
    }

    public static void main(String[] args) {
        ExceptionHandlingIIBExample5 obj = new ExceptionHandlingIIBExample5();
        System.out.println("num = " + obj.num);
    }
}
