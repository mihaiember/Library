public class Album extends Book {
    private String paperQuality;


    public Album(String name, int noOfPages, String paperQuality) {
        super(name,noOfPages);
        this.paperQuality=paperQuality;
    }


    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }

    @Override
    public String listBook() {
        return super.listBook()+", calitatea hartiei "+paperQuality;
    }
}
