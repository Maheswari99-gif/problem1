<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> 5c686bf915b7993c168b8cc50e43cb41bd5470ef
public class EmpWage implements IComputeEmpWage{
public static final int IS_FULL_TIME=2;
public static final int IS_PART_TIME=1;
private int numOfCompany =0;
private ArrayList<CompanyEmpWage> companyEmpWageList;
public EmpWage(){
companyEmpWageList=new ArrayList<>();
}
public void addCompanyEmpWage(String Company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
CompanyEmpWage companyEmpWage=new CompanyEmpWage( Company, empRatePerHour, numOfWorkingDays,  maxHoursPerMonth);
companyEmpWageList.add(companyEmpWage);
}
public void computeEmpWage(){
for(int i=0;i<companyEmpWageList.size();i++){
CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
System.out.println(companyEmpWage);
}
}
public int computeEmpWage(CompanyEmpWage companyEmpWage){
int empHrs=0;
int totalEmpHrs=0 , totalWorkingDays=0 ;
System.out.println("Welcome");
while((totalEmpHrs<=companyEmpWage.maxHoursPerMonth) && (totalWorkingDays<companyEmpWage.numOfWorkingDays)){
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
return totalEmpHrs*companyEmpWage.empRatePerHour;
}

public static void main(String[] args){
IComputeEmpWage empWage = new EmpWage();
empWage.addCompanyEmpWage("DMart",20,2,10);
empWage.addCompanyEmpWage("Reliance",10,4,20);
empWage.computeEmpWage();
}
}
