package task3;

public class Book {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    private int numOfPages;

    public Book(String title, int numOfPages) {
        this.setTitle(title);
        this.setNumOfPages(numOfPages);
    }

}
