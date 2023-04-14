package org.example.app.services;

import org.example.app.utils.Constants;
import org.example.app.utils.Rounder;

public class BonusService {

    private final static double BONUS_RATE = 10;

    public String getRes(double sales) {
        if (sales > 0.0) {
            return roundRes(calcBonus(sales));
        } else {
            return Constants.SMTH_WENT_WRONG_MSG;
        }
    }

    public double calcBonus(double sales) {
        return sales * BONUS_RATE / 100;
    }

    String roundRes(double res) {
        return Rounder.roundValue(res);
    }
}
