package br.com.panvel.modulo8.slides.chainAndTemplate;

public class Salesman {
    private double salary;
    private double sales;
    private double avarageEvaluation;
    private int absences;


    public Salesman(double salary, double sales, double avarageEvaluation, int absences) {
        this.salary = salary;
        this.sales = sales;
        this.avarageEvaluation = avarageEvaluation;
        this.absences = absences;

    }

    public double getSalary() {
        return salary;
    }

    public double getSales() {
        return sales;
    }

    public int getAbsences() {
        return absences;
    }

    public double getAvarageEvaluation() {
        return avarageEvaluation;
    }
}

