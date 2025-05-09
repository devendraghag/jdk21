package FinalKeywords;

class Book {
    String title = "Unknown";
}

class FinalObjectReferenceExample5 {
    public static void main(String[] args) {
        final Book myBook = new Book();
        myBook.title = "Java Basics"; // ✅ allowed
        // myBook = new Book();        // ❌ Error: cannot reassign final reference

        System.out.println(myBook.title);
    }
}
