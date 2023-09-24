package br.com.schumaker.hudson.java8.collectors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Hudson Schumaker
 */
public class CollectorEx7 {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Hudson", 33));
        employees.add(new Employee(2, "Humberto", 63));
        employees.add(new Employee(3, "Hugo", 22));

        Comparator<Employee> comparator = Comparator.comparing(Employee::getAge);

        // Get Min or Max Object
        Employee minObject = employees.stream().min(comparator).get();
        Employee maxObject = employees.stream().max(comparator).get();

        System.out.println("minObject = " + minObject);
        System.out.println("maxObject = " + maxObject);
    }
}
