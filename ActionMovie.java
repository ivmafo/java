public class ActionMovie extends Movie {
    public ActionMovie(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Action Movie: ");
    }
}
