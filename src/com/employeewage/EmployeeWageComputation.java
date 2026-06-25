package com.employeewage;

public class EmployeeWageComputation {

    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    static final int EMP_RATE_PER_HOUR = 20;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation");

        int totalEmpHours = 0;
        int totalWorkingDays = 0;

        while (totalEmpHours < MAX_WORKING_HOURS &&
               totalWorkingDays < MAX_WORKING_DAYS) {

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

            int dailyWage = empHours * EMP_RATE_PER_HOUR;

            System.out.println("Day " + totalWorkingDays +
                    " Hours = " + empHours +
                    " Wage = " + dailyWage);
        }

        int totalEmpWage = totalEmpHours * EMP_RATE_PER_HOUR;

        System.out.println("\nTotal Working Days = " + totalWorkingDays);
        System.out.println("Total Working Hours = " + totalEmpHours);
        System.out.println("Total Employee Wage = " + totalEmpWage);
    }
}