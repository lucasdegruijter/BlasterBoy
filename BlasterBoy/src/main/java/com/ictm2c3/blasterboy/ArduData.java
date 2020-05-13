package com.ictm2c3.blasterboy;

public class ArduData
{
    double angle;
    private static ArduData single_instance = null;

    public static ArduData getInstance()
    {
        if (single_instance == null)
            single_instance = new ArduData();

        return single_instance;
    }

    public double getAngle()
    {
        return angle;
    }

    public void setAngle(double angle)
    {
        this.angle = angle / 2.84166666667;
    }
}