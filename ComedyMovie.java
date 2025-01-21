public class ComedyMovie extends Movie {
    public ComedyMovie(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("and it's a comedy movie!");

    }
}
