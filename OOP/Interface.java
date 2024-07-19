import java.lang.*;
import java.util.*;

class Phone 
{
    public void call() { System.out.println("Phone call"); }
    public void sms() { System.out.println("Phone sending SMS"); }
}

interface ICamera
{
    void click();
    void record();
}

interface IMusicPlayer
{
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer
{
    public void videoCall() { System.out.println("Smart Phone video calling"); }
   
    public void click() { System.out.println("Smart Phone Clicking Photo"); }
    public void record() { System.out.println("Smart Phone recording video"); }
    public void play() { System.out.println("Smart Phone playing music"); }
    public void stop() { System.out.println("Smart Phone stopped playing music"); }

}

public class Interface
{

    public static void main(String[] args) 
    {
        System.out.println("\nMusic :-");
        IMusicPlayer Msp=new SmartPhone();
        Msp.play();
        Msp.stop();

        System.out.println("\nCamera :-");
        ICamera Csp = new SmartPhone();
        Csp.click();
        Csp.record();

        System.out.println("\nSmartphone :-");
        SmartPhone Sp = new SmartPhone();
        Sp.call();
        Sp.sms();
        Sp.click();
        Sp.record();
        Sp.play();
        Sp.stop();
        Sp.videoCall();  0 0    
    }
    
}