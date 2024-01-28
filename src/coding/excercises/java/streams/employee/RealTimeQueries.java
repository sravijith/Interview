package coding.excercises.streams.employee;

import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/*
 * https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/
 *
 */
public class RealTimeQueries {

    private static final Logger log = Logger.getLogger(RealTimeQueries.class.getName());

    List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {

        // Real Time Queries On employeeList

        RealTimeQueries realTimeQueries = new RealTimeQueries();

        realTimeQueries.getEmployees();

        System.out.println("\n1. How many male and female employees are there in the organization? \n");
        realTimeQueries.method1();

        System.out.println("\n2. Print the name of all departments in the organization? \n");
        realTimeQueries.method2();

        System.out.println("\n3. What is the average age of male and female employees? \n");
        realTimeQueries.method3();

        System.out.println("\n4. Get the details of highest paid employee in the organization? \n");
        realTimeQueries.method4();

        System.out.println("\n5. Get the names of all employees who have joined after 2015? \n");
        realTimeQueries.method5();

        System.out.println("\n6. Count the number of employees in each department? \n");
        realTimeQueries.method6();

        System.out.println("\n7. What is the average salary of each department? \n");
        realTimeQueries.method7();

        System.out.println("\n8. Get the details of youngest male employee in the product development department? \n");
        realTimeQueries.method8();

        System.out.println("\n9. Who has the most working experience in the organization? \n");
        realTimeQueries.method9();

        System.out.println("\n10. How many male and female employees are there in the sales and marketing team? \n");
        realTimeQueries.method10();

        System.out.println("\n11. What is the average salary of male and female employees? \n");
        realTimeQueries.method11();

        System.out.println("\n12. List down the names of all employees in each department? \n");
        realTimeQueries.method12();

        System.out.println("\n13. What is the average salary and total salary of the whole organization? \n");
        realTimeQueries.method13();

        System.out.println("\n14. Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years. \n");
        realTimeQueries.method14();

        System.out.println("\n15. Who is the oldest employee in the organization? What is his age and which department he belongs to? \n");
        realTimeQueries.method15();

    }

    public void getEmployees() {

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
    }

    public void method1() {

        Map<String, Long> noOfMaleAndFemaleEmployees = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        noOfMaleAndFemaleEmployees.forEach((key, value) -> System.out.println(key + " : " + value));
    }

    public void method2() {

        employeeList.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);
    }

    public void method3() {

        Map<String, Double> avgAgeOfMaleAndFemaleEmployees =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

        System.out.println("avgAgeOfMaleAndFemaleEmployees : " + avgAgeOfMaleAndFemaleEmployees);
    }


    public void method4() {

        Optional<Employee> highestPaidEmployeeWrapper =
                employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

        Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();

        System.out.println("Details Of Highest Paid Employee : " + highestPaidEmployee);
    }

    public void method5() {

        employeeList.stream()
                .filter(e -> e.getYearOfJoining() > 2015)
                .map(Employee::getName)
                .forEach(System.out::println);
    }

    public void method6() {

        Map<String, Long> employeeCountByDepartment =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        Set<Map.Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();

        for (
                Map.Entry<String, Long> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void method7() {

        Map<String, Double> avgSalaryOfDepartments =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        Set<Map.Entry<String, Double>> entrySet = avgSalaryOfDepartments.entrySet();

        for (
                Map.Entry<String, Double> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void method8() {

        Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper =
                employeeList.stream()
                        .filter(e -> "Male".equals(e.getGender()) && "Product Development".equals(e.getDepartment()))
                        .min(Comparator.comparingInt(Employee::getAge));

        Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();

        System.out.println("Details Of Youngest Male Employee In Product Development: " + youngestMaleEmployeeInProductDevelopment);

    }

    public void method9() {

        Optional<Employee> seniorMostEmployeeWrapper =
                employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();

        Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();

        System.out.println("Senior Most Employee Details Employee: " + seniorMostEmployee);
    }

    public void method10() {

        Map<String, Long> countMaleFemaleEmployeesInSalesMarketing =
                employeeList.stream()
                        .filter(e -> "Sales And Marketing".equals(e.getDepartment()))
                        .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(countMaleFemaleEmployeesInSalesMarketing);
    }

    public void method11() {

        Map<String, Double> avgSalaryOfMaleAndFemaleEmployees =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(avgSalaryOfMaleAndFemaleEmployees);
    }

    public void method12() {

        Map<String, List<Employee>> employeeListByDepartment =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        Set<Map.Entry<String, List<Employee>>> entrySet = employeeListByDepartment.entrySet();

        for (Map.Entry<String, List<Employee>> entry : entrySet) {

            System.out.println("\nEmployees In " + entry.getKey() + " : \n");

            List<Employee> list = entry.getValue();

            for (Employee e : list) {
                System.out.println(e.getName());
            }
        }
    }

    public void method13() {

        DoubleSummaryStatistics employeeSalaryStatistics =
                employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("Average Salary = " + employeeSalaryStatistics.getAverage());

        System.out.println("Total Salary = " + employeeSalaryStatistics.getSum());
    }

    public void method14() {

        Map<Boolean, List<Employee>> partitionEmployeesByAge =
                employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));

        Set<Map.Entry<Boolean, List<Employee>>> entrySet = partitionEmployeesByAge.entrySet();

        for (Map.Entry<Boolean, List<Employee>> entry : entrySet) {

            if (entry.getKey()) {
                System.out.println("\nEmployees older than 25 years :\n");
            } else {
                System.out.println("\nEmployees younger than or equal to 25 years :\n");
            }

            List<Employee> list = entry.getValue();

            for (Employee e : list) {
                System.out.println(e.getName());
            }
        }

    }

    public void method15() {

        Optional<Employee> oldestEmployeeWrapper = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));

        Employee oldestEmployee = oldestEmployeeWrapper.get();

        System.out.println("Name : " + oldestEmployee.getName());

        System.out.println("Age : " + oldestEmployee.getAge());

        System.out.println("Department : " + oldestEmployee.getDepartment());
    }

}
