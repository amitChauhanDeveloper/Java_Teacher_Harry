package com.MyPackage;

interface TVRemote
{
    void powerButton();
    void videoButton();
    void muteButton();

}
interface SmartTVRemote extends TVRemote
{
    void powerButton();
}
class TV
{
    public void powerButton()
    {
        System.out.println("Power On..");
    }
    public void videoButton()
    {
        System.out.println("video Mode...");
    }
    public void muteButton() {
        System.out.println("Mute mode..");
    }
}
public class cwh_60_Chapter11_ps_06_07 {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.muteButton();
        tv.powerButton();
        tv.videoButton();


    }
}
