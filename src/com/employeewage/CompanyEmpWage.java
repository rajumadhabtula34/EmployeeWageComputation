package com.employeewage;

import java.util.ArrayList;

public class CompanyEmpWage {

    String company;
    int empRatePerHour;
    int maxWorkingDays;
    int maxWorkingHours;
    int totalEmployeeWage;

    ArrayList<Integer> dailyWages = new ArrayList<>();

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

        return "\nCompany : " + company +
               "\nDaily Wages : " + dailyWages +
               "\nTotal Employee Wage : " + totalEmployeeWage;
    }
}