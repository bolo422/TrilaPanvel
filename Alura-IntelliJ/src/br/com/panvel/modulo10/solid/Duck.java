package br.com.panvel.modulo10.solid;

class Employee {
    private ContributorInformation infos;
    private double salary;

    public Employee(String name, int id, String position, double salary) {
        infos = new ContributorInformation();
        infos.name = name;
        infos.id = id;
        infos.position = position;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class OutsourcedEmployee{
    private ContributorInformation infos;

    public OutsourcedEmployee(String name, int id, String position, double salary) {
        infos = new ContributorInformation();
        infos.name = name;
        infos.id = id;
        infos.position = position;
    }
}

class ContributorInformation{
    String name;
    int id;
    String position;
}

class BonusCalculator{
    public double getBonus(Employee employee){
        return employee.getSalary() * 0.2 + 300.00;
    }
}
