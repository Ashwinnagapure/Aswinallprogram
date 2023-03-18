interface Moterbike
{
    void speed ();
}
interface cycle

{
    void distance();
}
abstract class car1 implements Moterbike
{
   public  void display()
    {
        System.out.println("RollsRoyce");
    }
}
class Twowheeler extends  car1
{
     public void speed()
    {
        System.out.println("moterbike speed 90km/hr");
    }
    public void distance()
    {
        System.out.println("50m");
    }
}
public class mc
{
    public static void main(String[] args)
    {
        Twowheeler a = new Twowheeler();
        a.display();
        a.speed();
        a.distance();
    }
}
