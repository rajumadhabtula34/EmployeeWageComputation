package com.employeewage;

public class CompanyEmpWage {

    String company;
    int empRatePerHour;
    int maxWorkingDays;
    int maxWorkingHours;
    int totalEmployeeWage;

    public CompanyEmpWage(String company, int empRatePerHour,
            int maxWorkingDays, int maxWorkingHours) {

        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }
    public void setTotalEmployeeWage(int totalEmployeeWage) {
        this.totalEmployeeWage = totalEmployeeWage;
    }


    @Override
    public String toString() {
        return company + " Total Employee Wage = " + totalEmployeeWage;
    }
}
