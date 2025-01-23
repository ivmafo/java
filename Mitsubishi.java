public class Mitsubishi extends Car2 {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }


    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }

}
