package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Purpose - To implement Employee PayRoll Service System
 * @author - Sachin Kore
 * @version - 16.0
 */
public class EmployeePayRollService {
    public List<EmployeePayRoll> employeePayrollList = new ArrayList<>();

    public EmployeePayRollService(ArrayList<EmployeePayRoll> employeePayrollList) {
    }

    public static void main(String[] args) {
        System.out.println("WelCome to Employee Payroll Service");
        ArrayList<EmployeePayRoll> employeePayrollList = new ArrayList<EmployeePayRoll>();
        EmployeePayRollService employeePayrollService = new EmployeePayRollService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeeData(consoleInputReader);
        employeePayrollService.writeEmployeeData();
    }

    private void writeEmployeeData() {
        System.out.println("\nwriting employee payroll data to console\n"+ employeePayrollList);
    }

    private void readEmployeeData(Scanner consoleInputReader) {
        System.out.println("Enter Employee id: ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee name ");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee salary ");
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayRoll(id,name,salary));
    }
}
