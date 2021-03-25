package Example;

import sun.util.resources.LocaleData;

import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Cal Crar", 40000, 1987, 12, 15);
        for (Employee e : staff) {
            e.raiseSalary(5);
        }
        for (Employee e :staff) {
            System.out.println("name= "+e.getName()+", salary= "+e.getSalary()+",hireDay= "+e.getHireDay());
        }
    }

    static class Employee {
        private String name;
        private double salary;
        private LocalDate hireDay;

        public Employee(String n, double s, int year, int month, int day) {
            name = n;
            salary=s;
            hireDay = LocalDate.of(year, month, day);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public LocalDate getHireDay() {
            return hireDay;
        }

        public void setHireDay(LocalDate hireDay) {
            this.hireDay = hireDay;
        }
        public void raiseSalary(double byPercent){
            double raise = (salary*byPercent)/100;
            salary+=raise;
        }
    }
}
