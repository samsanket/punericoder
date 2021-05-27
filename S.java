package amd;

public class S {
    
    public void printstuff()
    {
        System.out.println("S class");
    }
    public static void main(String[] args) {
        S a = new B();
        a.printstuff();

    }
}
class B extends S
{
    public void printstuff()
    {
        super.printstuff();
        System.out.println(" B  Class");

    }

}
