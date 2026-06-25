package com.employeewage;

public class EmployeeWageComputation {

    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation");

        int empCheck = (int) (Math.random() * 3);
        int empHours = 0;

        switch (empCheck) {

            case IS_PART_TIME:
                empHours = 4;
                System.out.println("Employee is Part Time");
                break;

            case IS_FULL_TIME:
                empHours = 8;
                System.out.println("Employee is Full Time");
                break;

            default:
                empHours = 0;
                System.out.println("Employee is Absent");
        }

        int empWage = empHours * EMP_RATE_PER_HOUR;

        System.out.println("Daily Employee Wage = " + empWage);
    }
}