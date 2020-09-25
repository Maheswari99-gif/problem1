public class File{
public static final int present=2;
public static final int Halfpresent=1;
public static final int RPH=20;
public static final int numdays=20;
public static final int maxhours=100;
public static void main(String[] args){
int empH=0;
int empW=0;
int total=0 , totalWD=0 ,totalEH=0;
System.out.println("Welcome");
while(totalEH<=maxhours && totalWD<numdays){
totalWD++;
int check=(int)Math.floor(Math.random()*10 % 3);
switch (check)
{
case present:
empH=8;
break;

case Halfpresent:
empH=4;
break;

default:

empH=0;
}
totalEH +=empH;
System.out.println("Day: " + totalWD + " Emp Hr: "+empH);
}
total=totalEH*RPH;

System.out.println("Total Emp Wage: " + total);
}
}
