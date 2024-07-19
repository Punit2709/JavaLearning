import Package1.Demo;
import Package1.Demo2;
import Package1.Inner.Demo3;

public class TestPackage {

    public static void main(String args[]) {
        Demo d1 = new Demo();
        d1.Display();

        Demo2 d2 = new Demo2();
        d2.Display();

        Demo3 d3 = new Demo3();
        d3.Display();
    }

}
