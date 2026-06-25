package com.employeewage;

public class EmpWageBuilder implements IComputeEmpWage {

    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;

    CompanyEmpWage[] companyEmpWages;
    int numberOfCompanies = 0;

    public EmpWageBuilder() {
        companyEmpWages = new CompanyEmpWage[10];
    }

    @Override
    public void addCompany(CompanyEmpWage companyEmpWage) {

        companyEmpWages[numberOfCompanies] = companyEmpWage;
        numberOfCompanies++;
    }

    @Override
    public void computeEmployeeWages() {

        for (int i = 0; i < numberOfCompanies; i++) {

            CompanyEmpWage company = companyEmpWages[i];

            int totalEmpHours = 0;
            int totalWorkingDays = 0;

            while (totalEmpHours < company.maxWorkingHours &&
                    totalWorkingDays < company.maxWorkingDays) {

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

            company.setTotalEmployeeWage(
                    totalEmpHours * company.empRatePerHour);

            System.out.println(company);
        }
    }
}