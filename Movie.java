public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {

        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title) {

        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new  ActionMovie(title);
            case 'C' -> new ComedyMovie(title);
            case 'D' -> new DramaMovie(title);
            default -> new Movie(title);
        };
    }
}
