public class CopyConstroctor {
    int a;
    int b;

    public CopyConstroctor(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
    public CopyConstroctor(CopyConstroctor c)
    {
        a = c.a;
        b = c.b;
        System.out.println("Copy Constructor Called..");
    }
    public void display(int a,int b)
    {
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
        CopyConstroctor c = new CopyConstroctor(10,20);
        CopyConstroctor c1 = new CopyConstroctor(c);
        c.display(c.a,c.b);
        c.display(c1.a,c1.b);

    }
}
