public class CompanyEmpWage{
public final String Company;
public final int empRatePerHour;
public final int numOfWorkingDays;
public final int maxHoursPerMonth;
public int totalEmpWage;
public CompanyEmpWage(String Company, int empRatePerHour, int numOfWorkingDays,int maxHoursPerMonth){
this.Company=Company;
this.empRatePerHour=empRatePerHour;
this.numOfWorkingDays=numOfWorkingDays;
this.maxHoursPerMonth=maxHoursPerMonth;
}
public void setTotalEmpWage(int totalEmpWage){
this.totalEmpWage=totalEmpWage;
}
@Override
public String toString(){
return "Total Emp Wage for Company: "+Company+" is: "+totalEmpWage;
}
}
