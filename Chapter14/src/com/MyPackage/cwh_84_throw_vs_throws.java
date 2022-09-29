package com.MyPackage;



class NegativeRadiusException extends Exception
{
    @Override
    public String toString()
    {
        return "Radius cannot be negative!" ;
    }
    @Override
    public String getMessage()
    {
        return "Radius cannot be negative";
    }
}
public class cwh_84_throw_vs_throws {

    public static double area (int r) throws  NegativeRadiusException
    {
        if (r<0)
        {
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static float divide(float a,float b)throws ArithmeticException
    {
        // Made my amit
        float result = a/b;
        return result;
    }
    public static void main(String[] args) {
        // ankit - uses divide function created by harry
        try
        {
            float c = divide(55,6);
            System.out.println(c);
//            double ar = area(0);
//            System.out.println(ar);
        }
        catch (Exception e)
        {
            System.out.println("Exception");
            System.out.println(e);
        }
    }
}
