package com.employeewage;

public interface IComputeEmpWage {

    void addCompany(CompanyEmpWage companyEmpWage);
    void computeEmployeeWages();
    int getTotalWage(String company);
}
