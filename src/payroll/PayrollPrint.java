/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import java.util.Scanner;

/**This class for
 * printing final salary including bonus
 * @author srinivsi
 */
public class PayrollPrint 
{
public static void main(String[] args) 
{
/* here assumed that 50 employee accounts can be created
 for the given bank */
Payroll ac[]=new Payroll[50];

Scanner sc=new Scanner(System.in);
System.out.println("Please enter the employee name:");
//add code
String employee=sc.nextLine();
System.out.println("Please enter the salary: salary <=3000");
double salary=sc.nextDouble();
//salary validation
while(salary>3000 || salary<0){
    System.out.println("Please enter salary <=3000");
    salary=sc.nextDouble();
} 

Payroll self=new Payroll(salary,employee);

System.out.println("The final Salary of  "+self.getEmp()+" is "+self.finalSalary(salary));

}

}
