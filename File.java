public class File{
public static final int present=2;
public static final int Halfpresent=1;
public static final int RPH=20;
public static void main(String[] args){
int empH=0;
int empW=0;
double check=Math.floor(Math.random()*10 % 3);
System.out.println("Welcome");
if(check==present)
{
empH=8;
System.out.println("Employee is Present");
}
else if(check==Halfpresent)
{
empH=4;
}
else
{
empH=0;
System.out.println("Employee is Absent");
}
empW=empH*RPH;
System.out.println("Emp Wage: " + empW);
}
}
