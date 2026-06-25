package com.employeewage;

public class EmployeeWageComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation");

        IComputeEmpWage empWageBuilder = new EmpWageBuilder();

        empWageBuilder.addCompany(
                new CompanyEmpWage("TCS", 20, 20, 100));

        empWageBuilder.addCompany(
                new CompanyEmpWage("Infosys", 25, 22, 120));

        empWageBuilder.addCompany(
                new CompanyEmpWage("Wipro", 30, 24, 140));

        empWageBuilder.computeEmployeeWages();
    }
}