package com.MyPackage;

interface Camera
{
    void takeSnap();
    void recordVideo();
    private void greet()
    {
        System.out.println("Good Morning");
    }
    default void  record4KVideo()
        {
            System.out.println("Recording 4K Video....");
        }
        default void record8KVideo()
        {
            greet();
            System.out.println("Recording 8K Video...");
        }
}


interface Wifi
{
    String[] getNetworks();
    void connectToNetwork(String Network);
}
class CellPhone
{
    void callNumber(int phoneNumber)
    {
        System.out.println("Calling..." + phoneNumber);
    }
    void pickCall()
    {
        System.out.println("Connecting...");
    }
}
class SmartPhone extends CellPhone implements Wifi,Camera
{
       public void takeSnap()
    {
        System.out.println("Taking Snap");
    }
    public void recordVideo()
    {
        System.out.println("Taking Record Video");
    }
//    public void record4KVideo()
//    {
//        System.out.println("Taking snap and record in 4k video");
//    }
    public String[] getNetworks()
    {
        System.out.println("Getting List of Networks");
        String[] networkList = {"Amit4G","Harry","Sanjay4G"};
        return networkList;
    }
    public void connectToNetwork(String network)
    {
        System.out.println("Connecting to " + network);
    }
}

public class cwh_57_default_methods {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
//        s.greet(); ---> throws an error!
        s.takeSnap();
        s.recordVideo();
        s.record4KVideo();
        s.record8KVideo();
        s.callNumber(200015);
        s.pickCall();
        String[] ar = s.getNetworks();
        for (String item:ar)
        {
            System.out.println(item);
        }
    }
}
