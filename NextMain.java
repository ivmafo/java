public class NextMain {
    public static void main(String[] args) {
        Movie m = new Movie ("Matrix") ;
        m.watchMovie();


        ActionMovie action =  (ActionMovie)Movie.getMovie("a","accion") ;
        action.watchMovie();

        Object comedy = Movie.getMovie("c","comedia");
        Movie comedie = (ComedyMovie)comedy;
        comedie.watchMovie();

        var plano = Movie.getMovie("A", "caeroplano") ;
        plano.watchMovie();

    }
}
