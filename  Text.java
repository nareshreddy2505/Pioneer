class Test
{
    //static variables
    static int a=100;
    static int b=200;
    //static method
    //instance method
    void m1()
    {
        //instance area
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args)
    {
        //static area
        System.out.println(Test.a);
        System.out.println(Test.b);
        Test t = new Test();
        t.m1();
        
    }
    }
