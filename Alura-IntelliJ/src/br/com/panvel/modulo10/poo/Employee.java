package br.com.panvel.modulo10.poo;

import java.math.BigDecimal;
import java.util.List;

public class Employee {
    String name;
    BigDecimal salary;
    String id;

    public Employee(String name, BigDecimal salary, String id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public void raise(double raisePercent){
        if(raisePercent > 0.4)
            return;

        salary = salary.add(salary.multiply(BigDecimal.valueOf(raisePercent)));
    }

    List<Raise> getRaiseHistory(){return null;}

    BigDecimal sumRaises()
    {
        BigDecimal total = BigDecimal.ZERO;
        for (Raise r: getRaiseHistory()) {
            total = total.add(r.getValue());
        }
        return total;
    }
}

class EmpyeeSystem{
    Employee employee = (Employee)DatabaseUtil.Import("empoyee", 231);

    BigDecimal sum1 = employee.sumRaises();
    BigDecimal sum2 = RaisesUtil.sumRaises(employee);
}

class DatabaseUtil{
    public static Object Import(String type, int id){return null;}
}

class Raise{BigDecimal getValue(){return null;}}

class RaisesUtil
{
    static BigDecimal sumRaises(Employee em)
    {
        BigDecimal total = BigDecimal.ZERO;
        for (Raise r: em.getRaiseHistory()) {
            total = total.add(r.getValue());
        }
        return total;
    }
}