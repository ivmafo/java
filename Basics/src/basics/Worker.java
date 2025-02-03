package Basics.src.basics;

import java.time.Year;


public class Worker {
    private String name ;
    private String birthDate;
    protected String endDate ;

    public Worker(){

    }
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getAge(){
        int current = Year.now().getValue();
        int age = Integer.parseInt(this.birthDate.substring(0,4));;

        return current-age ;
    }

    public double collectPay(){
        double pay;
        pay = 0.0;
        return pay ;
    }

    public void terminate(String endDate){
        this.endDate = endDate ;
        System.out.println("Contract terminated ");
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
