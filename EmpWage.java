public class EmpWage{
public static final int IS_FULL_TIME=2;
public static final int IS_PART_TIME=1;
private final String Company;
private final int empRatePerHour;
private final int numOfWorkingDays;
private final int maxHoursPerMonth;
private int totalEmpWage;
public EmpWage(String Company, int empRatePerHour,int numOfWorkingDays, int maxHoursPerMonth){
this.Company=Company;
this.empRatePerHour=empRatePerHour;
this.numOfWorkingDays=numOfWorkingDays;
this.maxHoursPerMonth=maxHoursPerMonth;
}
public void computeEmpWage(){
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
totalEmpWage=totalEmpHrs*empRatePerHour;
}
@Override
public String toString(){
return "Total Emp Wage for Company: "+Company+" is: "+totalEmpWage;
}
public static void main(String[] args){
EmpWage dMart = new EmpWage("DMart",20,2,10);
EmpWage reliance=new EmpWage("Reliance",10,4,20);
dMart.computeEmpWage();
System.out.println(dMart);
reliance.computeEmpWage();
System.out.println(reliance);
}
}
