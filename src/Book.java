
public class Book {
    private String name;
    private int noOfPages;
    private static long counter;
    private final long id = counter++;

    /**
     * Constructor for class book
     * @param name
     * @param noOfPages
     */
    public Book(String name, int noOfPages) {
        this.name = name;
        this.noOfPages = noOfPages;
    }

    /**
     * Sets the name of the book
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * sets the number of pages of the book
     * @param noOfPages
     */
    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;

    }

    /**
     * @return the name of the book
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the index of the book in array list
     */
    public long getId() {
        return id;
    }

    /**
     * @return number of pages
     */
    public int getNoOfPages() {
        return noOfPages;
    }
}
