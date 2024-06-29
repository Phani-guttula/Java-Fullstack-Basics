package com.java.inheritance_polymorphism;

abstract class  Employ{
    String name;
    double salary;

    public Employ(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    double calculateBonus(){
        return 0.0;
    }
    void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary );
    }
}

class Manager extends Employ{
    double bonusPercentage;

    public Manager(String name, double salary, double bonusPercentage) {
        super(name, salary);
        this.bonusPercentage = bonusPercentage;
    }
    @Override
    double calculateBonus(){
        return salary * (bonusPercentage / 100);
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Bonus : " + calculateBonus());
    }
}

class Developer extends Employ{
    double fixedBonus;

    public Developer(String name, double salary, double fixedBonus) {
        super(name, salary);
        this.fixedBonus = fixedBonus;
    }
    @Override
    double calculateBonus(){
        return fixedBonus;
    }
    @Override
    void  displayInfo(){
        super.displayInfo();
        System.out.println("Bonus : " + calculateBonus());
    }


}

public class TestPolymorphism {
    public static void main(String[] args) {
        Manager manager = new Manager("Phaneendra", 50000,10);
        Developer developer = new Developer("Sindhu",45000,5000);

        System.out.println("Manager details :");
        manager.calculateBonus();
        manager.displayInfo();

        System.out.println("\nDeveloper details :");
        developer.calculateBonus();
        developer.displayInfo();
    }
}
