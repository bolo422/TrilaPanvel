package br.com.panvel.modulo8.slides.chainAndTemplate;

import br.com.panvel.modulo8.slides.chainAndTemplate.bonuses.*;

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
