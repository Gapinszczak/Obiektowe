/**
 * Created by Michal on 2017-06-08.
 */
public class TV {

    private int size;
    private  String name;
    private boolean OnOff;

    public TV(int aSize, String name)
    {
        size = aSize;
        this.name=name;
    }

public int getSize()
{
    return size;
}
public String getName()
{
    return name;
}
public void setOnOff(boolean a)
{
    OnOff=a;
}
public void getOnOff()
{
    if(OnOff)
    {
        System.out.println("TV jest wlaczony");
    }
    else
        System.out.println("TV jest wylaczony");
}
}
