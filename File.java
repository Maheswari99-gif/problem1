public class File{
public static final int present=2;
public static final int Halfpresent=1;
public static final int RPH=20;
public static void main(String[] args){
int empH=0;
int empW=0;
int check=(int)Math.floor(Math.random()*10 % 3);
System.out.println("Welcome");
switch (check)
{
case present:
empH=8;
System.out.println("Employee is Present");
break;

case Halfpresent:
empH=4;
break;

default:

empH=0;
System.out.println("Employee is Absent");
}
empW=empH*RPH;
System.out.println("Emp Wage: " + empW);
}
}
