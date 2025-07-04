package temperaturedata.beans.arrays;

import java.util.Arrays;

public class EmployeeDetails {
        public static void main(String[]args){
            String[][]Employees = new String[63][4];
            Employees[0][0]="1001";
            Employees[0][1]="20,000";
            Employees[1][0]="1002";
            Employees[1][1]="25,000";
            Employees[2][0]="1003";
            Employees[2][1]="30,000";
            Employees[3][0]="1004";
            Employees[3][1]="35,000";
            for(String[] Employee : Employees) {
                System.out.println(Arrays.toString(Employee));
            }
        }
}
