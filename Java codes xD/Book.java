abstract class Book {
    String title;
    abstract void setTitle(String s);
    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    @Override
    void setTitle(String s) {
        title = s;
    }
}

public class Main {
    public static void main(String[] args) {
        MyBook book = new MyBook();
        book.setTitle("The Great Gatsby");
        System.out.println(book.getTitle());
    }
}
