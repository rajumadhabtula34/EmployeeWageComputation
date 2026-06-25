package com.employeewage;

public class EmployeeWageComputation {

    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;

    public static int computeEmployeeWage(String company,
                                          int empRatePerHour,
                                          int maxWorkingDays,
                                          int maxWorkingHours) {

        int totalEmpHours = 0;
        int totalWorkingDays = 0;

        while (totalEmpHours < maxWorkingHours &&
               totalWorkingDays < maxWorkingDays) {

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

        int totalEmployeeWage = totalEmpHours * empRatePerHour;

        System.out.println(company + " Total Employee Wage = " + totalEmployeeWage);

        return totalEmployeeWage;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation");

        computeEmployeeWage("TCS", 20, 20, 100);

        computeEmployeeWage("Infosys", 25, 22, 120);
    }
}