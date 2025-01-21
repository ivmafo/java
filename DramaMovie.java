public class DramaMovie extends Movie {
    public DramaMovie(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Dramatic scene");
    }
}
