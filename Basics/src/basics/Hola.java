package basics;

import Basics.src.basics.Employee;
import Basics.src.basics.HoulyEmployee;
import Basics.src.basics.SalariedEmployee;
import Basics.src.basics.Worker;
import basics.Account;
import basics.Dog;
public class Hola {

	public static void mai() {

		Worker ivan = new Employee("Ivan Forero","19840420",80815173,"20240601");
		System.out.println(ivan.toString() +"\n"
		+ ivan.collectPay()+"\n"
		+ ivan.getAge());

		SalariedEmployee mauricio = new SalariedEmployee("Mauricio Forero", "19840420",80815173,"20240601", 84000000) ;
		System.out.println(mauricio);
		System.out.println("Mauricio Paycheck  : " +  mauricio.collectPay());

		HoulyEmployee mary = new HoulyEmployee("Maria","20000101",123456789,"20240101",15);
		System.out.println(mary);
		System.out.println("mary paycheck: "+ mary.collectPay());
		System.out.println("mary holyday: "+ mary.getDoublePay());
		/*
		ComplexNumber one = new ComplexNumber(1.0, 1.0);
		ComplexNumber number = new ComplexNumber(2.5, -1.5);
		one.add(1,1);
		System.out.println("one.real= " + one.getReal());
		System.out.println("one.imaginary= " + one.getImaginary());
		one.subtract(number);
		System.out.println("one.real= " + one.getReal());
		System.out.println("one.imaginary= " + one.getImaginary());
		number.subtract(one);
		System.out.println("number.real= " + number.getReal());
		System.out.println("number.imaginary= " + number.getImaginary());
		*/
		/*
		Dog d = new Dog();
        Account myAccount = new Account();		 
		Account myAccount2 = new Account();
		myAccount.deposit(1000);
		myAccount.withdraw(500);
		myAccount.withdraw(400);
		myAccount.deposit(1900);
		myAccount.withdraw(2100);

		myAccount2.deposit(1000);

		System.out.println(myAccount.getBalance());
		System.out.println(myAccount2.getBalance());


		/*
		Scanner sc = new Scanner(System.in) ; 
		System.out.println("nombre : ");
		String nombre = sc.nextLine(); 
		System.out.println("edad : ");
		int edad = sc.nextInt();
		System.out.println("Sexo :");
		char sexo = sc.next().charAt(0) ; 
		System.out.println("su nombre es "+ nombre);
		System.out.println("su edad es "+ edad);
		System.out.println("su sexo es "+ sexo);*/
		/*
		Car car = new Car();
		car.setMake("Porsche");
		car.setModel("Carrera");
		car.setColor("Red") ;
		car.describeCar();*/
	}

}
