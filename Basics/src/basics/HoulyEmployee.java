package Basics.src.basics;

public class HoulyEmployee extends Employee  {
    private double hourlyPayRate ;

    public HoulyEmployee(String name, String birthDate, long employeeId, String hireDate, double hourlyPayRate) {
        super(name, birthDate, employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
          return 40 * hourlyPayRate;
    }

    public double getDoublePay(){
        return collectPay() * 2 ;
    }
}
