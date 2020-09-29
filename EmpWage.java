public class EmpWage{
public static final int IS_FULL_TIME=2;
public static final int IS_PART_TIME=1;
public static int computeEmpWage(String Company, int empRatePerHour,int numOfWorkingDays, int maxHoursPerMonth){
int empHrs=0;
int totalEmpHrs=0 , totalWorkingDays=0 ;
System.out.println("Welcome");
while((totalEmpHrs<=maxHoursPerMonth) && (totalWorkingDays<numOfWorkingDays)){
totalWorkingDays++;
int check=(int)Math.floor(Math.random()*10 % 3);
switch (check)
{
case IS_FULL_TIME:
empHrs=8;
break;

case IS_PART_TIME:
empHrs=4;
break;

default:

empHrs=0;
}
totalEmpHrs  +=empHrs;
System.out.println("Day: " + totalWorkingDays + " Emp Hr: "+empHrs);
}
int totalEmpWage=totalEmpHrs*empRatePerHour;

System.out.println("Total Emp Wage for Company: "+Company+" is: " + totalEmpWage);
return totalEmpWage;
}
public static void main(String[] args){
computeEmpWage("DMart",20,2,10);
computeEmpWage("Reliance",10,4,20);
}
}
