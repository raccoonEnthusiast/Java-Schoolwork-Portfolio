package task3;

import java.util.List;

public class BookApp {
	//Recursive method to calculate and return total number of book pages
    public int calcTotalPages(List<Book> bookList, int accum) {

        if(bookList == null || bookList.size() == 0) return accum;
        accum += bookList.get(0).getNumOfPages();

        List<Book> sublist = bookList.subList(1, bookList.size());

        return calcTotalPages(sublist, accum);
    }
}
