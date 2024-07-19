import java.lang.*;
import java.util.*;

class CoffeeMachine
{
    private float milkQty;
    private float waterQty;
    private float coffeeQty;
    private float sugarQty;

    static private CoffeeMachine our = null; // this  should be static so it is same for all class.

    private CoffeeMachine()
    {
        milkQty = 1;
        waterQty = 1;
        coffeeQty = 1;
        sugarQty = 1;
    }

    public void fillWater(float qty)
    {
        waterQty=qty;
    }
    public void fillSugar(float qty)
    {
        sugarQty=qty;
    }
    public float getCoffee()
    {
        return 0.15f;
    }

    static CoffeeMachine getInstance() // this method should be static so it can call without creating OBJECT.
    {
        if(our==null)
            our=new CoffeeMachine();
        return our;
    }
}

public class Singelton
{
    public static void main(String[] args)
    {
        CoffeeMachine m1=CoffeeMachine.getInstance();
        CoffeeMachine m2=CoffeeMachine.getInstance();
        CoffeeMachine m3=CoffeeMachine.getInstance();

        
        
        System.out.println(m1+" "+m2+" "+m3);
        if(m1==m2 && m1==m3)
            System.out.println("Same");

    }

}