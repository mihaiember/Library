public class App {
    public static void main(String[] args) {

        Album album1 = new Album ("Culori vii", 15, "fine");
        System.out.println(album1.listBook());


        Novel novel1=new Novel("Maitrei", 89, "lectura");
        Novel novel2=new Novel("De veghe in lanul de secara", 250, "proza");

        System.out.println(novel1.listBook());
        System.out.println(novel2.listBook());




    }
}
