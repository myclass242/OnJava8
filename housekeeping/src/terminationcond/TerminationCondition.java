package terminationcond;


class Book {
    boolean checkOut = false;

    Book(boolean checkOut) {
        this.checkOut = checkOut;
    }

    void checkIn() {
        checkOut = false;
    }

    @Override
    protected void finalize() throws Throwable{
        try {
            if (checkOut) {
                System.out.println("Error:checkOut");
            }
        } finally {
            super.finalize();
        }
    }
}

public class TerminationCondition {
    public static void main(String[] args) throws InterruptedException{
        Book novel = new Book(true);
        novel.checkIn();

        new Book(true);

        System.gc();
        Thread.sleep(1000);
    }
}
