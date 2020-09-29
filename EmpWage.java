public class EmpWage{
public static final int IS_FULL_TIME=2;
public static final int IS_PART_TIME=1;
private int numOfCompany =0;
private CompanyEmpWage[] companyEmpWageArray;
public EmpWage(){
companyEmpWageArray=new CompanyEmpWage[5];
}
public void addCompanyEmpWage(String Company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
companyEmpWageArray[numOfCompany]=new CompanyEmpWage( Company, empRatePerHour, numOfWorkingDays,  maxHoursPerMonth);
numOfCompany++;
}
public void computeEmpWage(){
for(int i=0;i<numOfCompany;i++){
companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
System.out.println(companyEmpWageArray[i]);
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
EmpWage empwage = new EmpWage();
empwage.addCompanyEmpWage("DMart",20,2,10);
empwage.addCompanyEmpWage("Reliance",10,4,20);
empwage.computeEmpWage();
}
}
