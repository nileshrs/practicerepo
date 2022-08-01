public class SingleTon
{
private static SingleTon st;

private SingleTon()
{

}
public static SingleTon getInstance()
{
  if(st==null)
  {
   st=new SingleTon();
  }
 return st;
}
public static void main(String args[])
{
 SingleTon s1=SingleTon.getInstance();
 SingleTon s2=SingleTon.getInstance();
 SingleTon s3=SingleTon.getInstance();

 System.out.println(s1);
 System.out.println(s2);
 System.out.println(s3);
}
}