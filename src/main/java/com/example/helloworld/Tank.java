package com.example.helloworld;

public class Tank {

    public double getQuantity(){
        return Util.GenerateRandomNumber(1, 600);
    }

    public StatusCode GetStatusForTankQuantity(){
        double p = getQuantity();

        if (p <= 49 && p >= 1){
            StatusCode code = TankStatusCodes.CriticalUnderpresssure;
            code.TankPressure = p;
            return code;
        }
        else if (p >= 301 && p <= 501){
            StatusCode code = TankStatusCodes.CriticalOverpressure;
            code.TankPressure = p;
            return code;
        }
        else if(p >= 501){
            StatusCode code = TankStatusCodes.DangerAhead;
            code.TankPressure = p;
            return code;
        }
        else if(p >= 181 && p<= 219){
            StatusCode code = TankStatusCodes.OptimalQuantity;
            code.TankPressure = p;
            return code;
        }
        else if(p >= 50 && p<= 180){
            StatusCode code = TankStatusCodes.Underpressure;
            code.TankPressure = p;
            return code;
        }
        else if(p >= 220){
            StatusCode code = TankStatusCodes.Overpressure;
            code.TankPressure = p;
            return code;
        }

        // Kein Status
        return TankStatusCodes.StatusError;
    }
}