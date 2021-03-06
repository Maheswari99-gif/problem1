import java.util.HashMap;
import java.util.*;
public class EmpWage implements IComputeEmpWage{
public static final int IS_FULL_TIME=2;
public static final int IS_PART_TIME=1;
private int numOfCompany =0;
private LinkedList<CompanyEmpWage> companyEmpWageList;
private Map<String,CompanyEmpWage> companyToEmpWageMap;
public EmpWage(){
companyEmpWageList=new LinkedList<>();
companyToEmpWageMap= new HashMap<>();
}
public void addCompanyEmpWage(String Company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
CompanyEmpWage companyEmpWage=new CompanyEmpWage( Company, empRatePerHour, numOfWorkingDays,  maxHoursPerMonth);
companyEmpWageList.add(companyEmpWage);
companyToEmpWageMap.put(Company,companyEmpWage);
}
public void computeEmpWage(){
for(int i=0;i<companyEmpWageList.size();i++){
CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
System.out.println(companyEmpWage);
}
}
@Override
public int getTotalWage(String Company){
return companyToEmpWageMap.get(Company).totalEmpWage;
}
public int computeEmpWage(CompanyEmpWage companyEmpWage){
int empHrs=0;
int totalEmpHrs=0 , totalWorkingDays=0,DailyWage ;
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
DailyWage=empHrs*companyEmpWage.empRatePerHour;
System.out.println("Daily Wage: "+DailyWage);
}
return totalEmpHrs*companyEmpWage.empRatePerHour;
}

public static void main(String[] args){
IComputeEmpWage empWage = new EmpWage();
empWage.addCompanyEmpWage("DMart",20,2,10);
empWage.addCompanyEmpWage("Reliance",10,4,20);
empWage.computeEmpWage();
System.out.println("Total Wage: "+empWage.getTotalWage("DMart"));
}
}
