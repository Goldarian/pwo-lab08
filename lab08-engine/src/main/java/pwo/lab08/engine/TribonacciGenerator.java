/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab08.engine;

import java.math.BigDecimal;

public class TribonacciGenerator extends FibonacciGenerator {

    public TribonacciGenerator() {
        f_3 = new BigDecimal(0);
    }

    @Override
    public void reset() {
        super.reset();
        f_3 = new BigDecimal(0);
    }

    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 2) {
            current = f_1.add(f_2).add(f_3);
            f_3 = f_2;
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 2) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }
        lastIndex++;
        return current;
    }

    @Override
    public BigDecimal previousTerm() {
        if (lastIndex > 2) {
            BigDecimal temp = current.subtract(f_3);
            f_1 = f_2;
            f_2 = f_3;
            f_3 = temp;
            current = temp;
        } else if (lastIndex == 2) {
            current = new BigDecimal(1);
        } else if (lastIndex == 1) {
            current = new BigDecimal(0);
        } else {
            current = new BigDecimal(-1);
        }

        lastIndex--;
        return current;
    }
}
