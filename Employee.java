// Program Using Employee, Manager and Programmer Classes

class Employee 
{

    double calculateSalary() 
    {
        return 0;
    }
}

class Manager extends Employee 
{

    double calculateSalary() 
    {
        return 80000;
    }
}

class Programmer extends Employee 
{

    double calculateSalary() 
    {
        return 50000;
    }
}

class EmployeeDemo 
{
    public static void main(String[] args) 
    {

        Manager m = new Manager();
        Programmer p = new Programmer();

        System.out.println("Manager Salary = " + m.calculateSalary());
        System.out.println("Programmer Salary = " + p.calculateSalary());
    }
}