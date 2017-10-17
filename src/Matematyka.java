/**
 * Created by Michal on 2017-06-08.
 */
public class Matematyka {
    public static void main (String[] args)
    {
        Matematyka m=new Matematyka();
        m.classname();
        System.out.println(m.sqrt2(5.5));
        System.out.println(m.sqrt2(10.6));
        System.out.println(m.sqrt2(7));
    }
    public void classname ()
    {
        System.out.println("Matematyka");
    }
    public int sqrt(int a)
    {
        return a*a;
    }
    public double sqrt2(double b)
    {
        return b*b;
    }
}
