package br.com.panvel.modulo8.slides.chainOfResponsability;

public class testChain {
    public static void main(String[] args) {

        Salesman salesmanSales = new Salesman(2000, 5500, 4.5, 0);
        Salesman salesmanAvarage = new Salesman(2000, 0, 4.5, 0);
        Salesman salesmanAbsences = new Salesman(2000, 0, 0, 0);
        Salesman salesmanNoBonus = new Salesman(2000, 0, 0, 1);

        System.out.println(
                "\nsalesmanSales: " + BonusCalculator.bonus( salesmanSales ) +
                "\nsalesmanAvarage: " + BonusCalculator.bonus( salesmanAvarage ) +
                "\nsalesmanAbsences: " + BonusCalculator.bonus( salesmanAbsences ) +
                "\nsalesmanNoBonus: " + BonusCalculator.bonus( salesmanNoBonus )
        );
    }
}
