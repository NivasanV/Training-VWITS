

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import in.co.vwits.emppayroll.module.Employee;


public class TestEmployee {
    public static void main(String[] args) throws Exception {
        List<Employee> emps = new ArrayList<>();

        Employee e1 = new Employee();
        e1.setId(20);
        e1.setName("Amit");

        Employee e2 = new Employee();
        e2.setId(10);
        e2.setName("Sachin");

        Employee e3 = new Employee();
        e3.setId(15);
        e3.setName("Sumit");

        emps.add(e3);
        emps.add(e2);
        emps.add(e1);

        System.out.println("Employees before sorting");
        System.out.println(emps);

        // Collections is built-in class from java.util package
        // Sort is built-in method of Collecions class
        // Sort methods except list
        // items of the list must be implemetating java.lang.Comparable
        Collections.sort(emps);
        System.out.println("Employees after sorting using Comparable(Natural sorting algorithm)");
        System.out.println(emps);

        System.out.println("Employees after sorting using Comparator(Additional sorting algorithm)");
        Collections.sort(emps,(e11,e22) -> e22.getId() - e11.getId()); // lambda expression for Comparator interface
        System.out.println(emps); 

    }
}
