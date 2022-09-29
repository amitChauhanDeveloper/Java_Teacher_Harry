package com.MyPolymorphism;

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
    public void sampleMethod()
    {
        System.out.println("Method");
    }
}
public class cwh_59_polymorphism {
    public static void main(String[] args) {
        Camera cam = new SmartPhone(); // This is a smartphone but,use it as a camera
//        cam.getNetworks(); ---> Not allowed
//        cam.sampleMethod(); ---> Not allowed
          cam.takeSnap();
          cam.recordVideo();
          cam.record4KVideo();
          cam.record8KVideo();
          SmartPhone s = new SmartPhone();
          s.callNumber(7990);
          s.pickCall();
          s.getNetworks();
          s.sampleMethod();
          s.takeSnap();
          s.recordVideo();
          s.record4KVideo();
          s.record8KVideo();
    }
}
