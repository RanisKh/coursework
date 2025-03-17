import java.util.Random;

public class Main {

//    private final static Random RANDOM = new Random();
//    private final static String[] NAMES = {};
//    private final static String[] SURNAMES = {};
//    private final static String[] LASTNAMES = {};

    private final static Employee[] EMPLOYEES = new Employee[10];

//    private static void initEmployees() {
//        for (int i = 0; i < EMPLOYEES.length; i++) {
//            String fullName = SURNAMES
//        }
//    }

    public static void main(String[] args) {
        EMPLOYEES[0] = new Employee("Ivanov Ivan Petrovich", 1, 10000);
        EMPLOYEES[1] = new Employee("Ivanov Ivan Ivanovich", 2, 11000);
        EMPLOYEES[2] = new Employee("Ivanov Ivan Aleksandrovich", 3, 15000);
        EMPLOYEES[3] = new Employee("Ivanov Ivan Yakovovich", 4, 12000);
        EMPLOYEES[4] = new Employee("Ivanova Irina Ivanovna", 5, 10000);
        EMPLOYEES[5] = new Employee("Ivanov Ivan Alekseevich", 1, 11000);
        EMPLOYEES[6] = new Employee("Petrov Petr Nikolayevich", 2, 15000);
        EMPLOYEES[7] = new Employee("Ivanov Sergey Semenovich", 3, 18000);
        EMPLOYEES[8] = new Employee("Burunov Sergey Andreevich", 4, 13000);
        EMPLOYEES[9] = new Employee("Yakovlev Vladimir Sergeevich", 5, 11000);

        print();
        System.out.println("Средняя зп " + calculateAverageOfSalaries());
        System.out.println("Минимальная зп " + employeeWithMinSalary());
        System.out.println("Максимальная зп " + employeeWithMaxSalaru());
        printFullName();
        System.out.println("Сумма затрат в месяц " + calculateSumOfSalaries());
    }

    public static void print() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }

    public static int calculateSumOfSalaries() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee employeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employeeWithMinSalary == null || employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
            ;
        }
        return employeeWithMinSalary;
    }

    public static Employee employeeWithMaxSalaru() {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : EMPLOYEES) {
            if (employeeWithMaxSalary == null || employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;

    }

    public static double calculateAverageOfSalaries() {
        return (double) calculateSumOfSalaries()/ EMPLOYEES.length;
    }

    public static void printFullName() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getFullName());
        }
    }

}
