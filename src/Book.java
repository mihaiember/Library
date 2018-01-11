public class Book {
    private String name;
    private int noOfPages;

    public Book(String name, int noOfPages) {
        this.name = name;
        this.noOfPages = noOfPages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public String listBook() {
        return name + ", numar de pagini:" + noOfPages;
    }


}
