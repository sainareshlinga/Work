import java.util.*;

public class geometricshape
{
  int area,a,r,l,b,rectangle;
  double pi=3.14;
  Scanner sc=new Scanner(System.in);
  void Square()
  {
    System.out.println("enter a value");
    a=sc.nextInt();
    area=a*a;
    System.out.println("area of sqaure"+area);
  }
  void circle()
  {
    System.out.println("enter r value");
    r=sc.nextInt();
    area=(int) (pi* r* r);
    System.out.println("area of circle"+area);
  }
  void rectangle()
  {
    System.out.println("enter l and b");
    l=sc.nextInt();
    b=sc.nextInt();
    String rectangle;
    System.out.println("rectangle is "+rectangle);
  }
  
  public static void main(String[] args)
  {
    geometricshape obj=new geometricshape();
    obj.Square();
    obj.circle();
    obj.rectangle();
  }

  

}