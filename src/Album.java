public class Album extends Book {
    private String paperQuality;

    /**
     * Constructor for class Album with inheritance from class Book
     * @param name
     * @param noOfPages
     * @param paperQuality
     */
    public Album(String name, int noOfPages, String paperQuality) {
        super(name, noOfPages);
        this.paperQuality = paperQuality;
    }

    /**
     * Setter sets the paper quality of the album
     * @param paperQuality
     */
    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }

    /**
     * Getter returns the paper quality of the album
     * @return paper quality
     */
    public String getPaperQuality() {
        return paperQuality;
    }

    /**
     * Method used for printing the characteristics of the album
     * @return albums characteristics
     */
    @Override
    public String toString() {
        return super.getId() + "- " + super.getName() + ", nr. de pagini " + super.getNoOfPages() + ", calitatea hartiei " + getPaperQuality() + ".";
    }
}
