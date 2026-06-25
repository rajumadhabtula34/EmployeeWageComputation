package com.employeewage;

public class EmployeeWageComputation {

    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;

    public static void computeEmployeeWage(CompanyEmpWage companyEmpWage) {

        int totalEmpHours = 0;
        int totalWorkingDays = 0;

        while (totalEmpHours < companyEmpWage.maxWorkingHours &&
                totalWorkingDays < companyEmpWage.maxWorkingDays) {

            totalWorkingDays++;

            int empCheck = (int) (Math.random() * 3);
            int empHours = 0;

            switch (empCheck) {

                case IS_PART_TIME:
                    empHours = 4;
                    break;

                case IS_FULL_TIME:
                    empHours = 8;
                    break;

                default:
                    empHours = 0;
            }

            totalEmpHours += empHours;
        }

        companyEmpWage.totalEmployeeWage =
                totalEmpHours * companyEmpWage.empRatePerHour;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation");

        CompanyEmpWage tcs =
                new CompanyEmpWage("TCS", 20, 20, 100);

        CompanyEmpWage infosys =
                new CompanyEmpWage("Infosys", 25, 22, 120);

        computeEmployeeWage(tcs);
        computeEmployeeWage(infosys);

        System.out.println(tcs);
        System.out.println(infosys);
    }
}