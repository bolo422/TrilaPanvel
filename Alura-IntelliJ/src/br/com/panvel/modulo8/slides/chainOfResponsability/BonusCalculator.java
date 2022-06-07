package br.com.panvel.modulo8.slides.chainOfResponsability;

import br.com.panvel.modulo8.slides.chainOfResponsability.bonuses.*;

public class BonusCalculator {
    public static double bonus(Salesman salesman) {

        return new SalesBonus(
                new AvarageEvaluationBonus(
                        new ZeroAbsencesBonus(
                                new ZeroAbsencesBonus(
                                        new NoBonus()
                                )
                        )
                )
        ).bonus(salesman);

    }
}
