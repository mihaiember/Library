public class Novel extends Book {
    private String type;

    // constructor pentru clasa Novel cu mostenire din superclasa Book
    public Novel (String name, int noOfPages, String type){
        super(name, noOfPages);
        this.type=type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String listBook() {
        return super.listBook()+", "+type;
        }


}
