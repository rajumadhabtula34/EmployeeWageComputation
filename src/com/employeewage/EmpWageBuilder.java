package com.employeewage;

import java.util.ArrayList;

public class EmpWageBuilder implements IComputeEmpWage {

    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;

    ArrayList<CompanyEmpWage> companyEmpWages;

    public EmpWageBuilder() {

        companyEmpWages = new ArrayList<>();
    }

    @Override
    public void addCompany(CompanyEmpWage companyEmpWage) {

        companyEmpWages.add(companyEmpWage);
    }

    @Override
    public void computeEmployeeWages() {

        for (CompanyEmpWage company : companyEmpWages) {

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

                int dailyWage = empHours * company.empRatePerHour;

                company.dailyWages.add(dailyWage);
            }

            company.setTotalEmployeeWage(
                    totalEmpHours * company.empRatePerHour);

            System.out.println(company);
        }
        
        
    }
    @Override
    public int getTotalWage(String companyName) {

        for (CompanyEmpWage company : companyEmpWages) {

            if (company.company.equals(companyName)) {
                return company.totalEmployeeWage;
            }
        }

        return 0;
    }
}