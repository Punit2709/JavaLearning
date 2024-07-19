public class Super
{
    public void display()
    {
        System.out.println("Super Display");
    }
}

class Sub extends Super
{
    // Super.display();
    public void display()
    {
        System.out.println("Sub Display");
    }
}

public class Override
{
    public static void main(String[] args) 
    {
        Super s=new Sub();
        s.display();
        // s.super.display();  give error
          
    }    
} 
    
