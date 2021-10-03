// Copy Constructor is special type of constructor that create new object as
// copy of existing object
// only one copy constructor is created by user or system
public class CopyConstructor {
    int a;
    int b;

    public CopyConstructor(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    public CopyConstructor(CopyConstructor c)
    {
        a = c.a;
        b = c.b;
        System.out.println("Copy Constructor Called..");
    }
    // Only one copy constructor is created by user or compiler


//    public CopyConstructor(CopyConstructor c1)
//    {
//        a = c1.a;
//        b = c1.b;
//        System.out.println("Copy Constructor Called..");
//    }
    public void display(int a,int b)
    {
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
        CopyConstructor c = new CopyConstructor(10,20);
        CopyConstructor c1 = new CopyConstructor(c);
        c.display(c.a,c.b);
        c.display(c1.a,c1.b);

    }
}
