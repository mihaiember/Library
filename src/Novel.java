public class Novel extends Book {
    private String type;

    /**
     * Constructor for class Novel with inheritance from class Book
     * @param name
     * @param noOfPages
     * @param type
     */

    public Novel(String name, int noOfPages, String type) {
        super(name, noOfPages);
        this.type = type;
    }

    /**
     * Setter sets the type of the novel
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter
     * @return the tyoe of the novel
     */
    public String getType() {
        return type;
    }

    /**
     * Method used for printing the characteristics of the novel
     * @return novels characteristics
     */
    @Override
    public String toString() {
        return super.getId() + "- " + super.getName() + ", nr. de pagini " + super.getNoOfPages() + ", " + getType() + ".";
    }
}
