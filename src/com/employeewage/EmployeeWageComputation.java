package com.employeewage;

public class EmployeeWageComputation {

    static final int IS_PRESENT = 1;
    static final int EMP_RATE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation");

        int attendance = (int) (Math.random() * 2);

        if (attendance == IS_PRESENT) {
            int dailyWage = EMP_RATE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employee is Present");
            System.out.println("Daily Employee Wage = " + dailyWage);
        } else {
            System.out.println("Employee is Absent");
            System.out.println("Daily Employee Wage = 0");
        }
    }
}