package amd;

public class Test {
    private Test(int a)
    {

    }
    public static void main(String[] args) throws Exception{
    Class cls = Class.forName("Test");
    Test test=(Test)cls.newInstance();
    System.out.println(test.getClass().getName());


    }
}

