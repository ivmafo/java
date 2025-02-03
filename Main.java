import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car2 car = new Car2(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }
}



//        // crear instancia de Car
//        System.out.println("Car class");
//        Car car = new Car("2022 Blue Ferrari 296 GTS");
//        runRace(car);
//
//        // crear instancia de GasPoweredCar
//        System.out.println("GasPoweredCar class");
//        Car car2 = new GasPoweredCar("2022 Blue Ferrari 3000 GTS", 10.5, 6);
//        runRace(car2);
//    }
//    public static void runRace(Car car) {
//        car.startEngine();
//        car.drive();
//    }
//}
//        // crear instancia de Movie
//        Scanner s = new Scanner(System.in);
//        while (true) {
//            System.out.print("Enter Type (A for Adventure, C for Comedy, " +
//                    "S for Science Fiction, or Q to quit): ");
//            String type = s.nextLine();
//            if ("Qq".contains(type)) {
//                break;
//            }
//            System.out.print("Enter Movie Title: ");
//            String title = s.nextLine();
//            Movie movie = Movie.getMovie(type, title);
//            movie.watchMovie();
//        }




//        Universidad universidad = new Universidad();
//        // Crear estudiantes
//        Estudiante e1 = new Estudiante("Juan", "Perez","E001", "Ingeniería");
//        Estudiante e2 = new Estudiante("Maria", "Garcia", "E002", "Medicina");
//
//        // Agregar estudiantes a la universidad
//        universidad.agregarEstudiante(e1);
//        universidad.agregarEstudiante(e2);
//
//        // Crear profesores
//        Profesor p1 = new Profesor("Ana", "Lopez", "P001", "Ingeniería");
//        Profesor p2 = new Profesor("Carlos", "Martinez", "P002", "Medicina");
//
//        // Agregar profesores a la universidad
//        universidad.agregarProfesor(p1);
//        universidad.agregarProfesor(p2);
//
//        // Crear cursos
//        Curso c1 = new Curso("C001", "Matemáticas", 3, p1);
//        Curso c2 = new Curso("C002", "Biología", 4, p2);
//
//
//
//
//        // Agregar cursos a la universidad
//        universidad.agregarCurso(c1);
//        universidad.agregarCurso(c2);
//
//        // Inscribir estudiantes en cursos
//        universidad.inscribirEstudiantesEnCurso(e1, c1);
//        universidad.inscribirEstudiantesEnCurso(e2, c2);
//
//        // Registrar evaluaciones
//        universidad.registrarEvaluacion(e1, c1, new Nota(  9, LocalDateTime.now()));
//        universidad.registrarEvaluacion(e1, c1, new Nota(  7, LocalDateTime.now()));
//        universidad.registrarEvaluacion(e2, c2, new Nota( 8, LocalDateTime.now()));
//
//        // print e1 consultar historico
//        System.out.println( "e1 c1");
//        for (Nota nota : universidad.consultarEvaluaciones(e1, c1)) {
//            System.out.println(nota.getValor());
//        }
//
//        // Mostrar reporte de la universidad
//        universidad.mostrarReporte();

//    }
//}


//        Inventario inventario = new Inventario();
//        Producto p1 = new Producto("Manzana", 5, 100);
//        Producto p2 = new Producto("Banana", 3, 150);
//        inventario.agregarProducto(p1);
//        inventario.agregarProducto(p2);
//        System.out.println("Inventario inicial:");
//        inventario.mostrarInventario();
//        inventario.actualizarProducto("Manzsana", "Manzana Campesina", 6, 500);
//        System.out.println("\nDespués de actualizar el precio de Manzana:");
//        inventario.mostrarInventario();
//        inventario.actualizarProducto("Banana", "Plátano", null, 200);
//        System.out.println("\nDespués de actualizar el nombre y la cantidad de Banana:");
//        inventario.mostrarInventario();
//        inventario.actualizarProducto("Plátano", "Plátano Maduro", 35, 180);
//        System.out.println("\nDespués de actualizar todos los atributos de Plátano:");
//        inventario.mostrarInventario();




//        Printer printer = new Printer(50, true);
//        System.out.println(printer.addToner(50));
//        System.out.println("initial page count = " +printer.getPagesPrinted());
//        int pagesPrinted = printer.printPages(4);
//        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
//        pagesPrinted = printer.printPages(2);
//        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());


//        Wall wall1 = new Wall("West");
//        Wall wall2 = new Wall("East");
//        Wall wall3 = new Wall("South");
//        Wall wall4 = new Wall("North");
//
//        Ceiling ceiling = new Ceiling(12, 55);
//
//        Bed bed = new Bed("Modern", 4, 3, 2, 1);
//
//        Lamp lamp = new Lamp("Classic", false, 75);
//
//        Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
//        bedRoom.makeBed();
//
//        bedRoom.getLamp().turnOn();

//        ComputerCase thecase = new ComputerCase("2209","Dell","240");
//        Monitor monitor = new Monitor("2334LG","LG",80,"1080x1040");
//        Motherboard motherboard = new Motherboard("SnapDragon","NVidia",8,2,"AmericanThreads");
//        Computer computer = new Computer("Azus3000","Azus",thecase,monitor,motherboard);
//        computer.powerUp();
//
//        SmartKitchen smartKitchen = new SmartKitchen();
//        smartKitchen.setKitchenState(false,true,true);
//        smartKitchen.doKitchenWork();

//        computer.getMonitor().drawPixelAt(10,10,"blue");
//        computer.getMotherboard().loadProgram("Linux");
//        computer.getComputerCase().pressPowerButton();




