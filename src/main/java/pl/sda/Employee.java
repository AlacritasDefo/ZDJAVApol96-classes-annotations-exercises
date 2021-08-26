package pl.sda;

public class Employee {
    private Person person;

    class Department {
        String name;

        public Department(String name) {
            this.name = name;


        }

        @Override
        public String toString() {
            return "Department{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    private Department department;


    public Employee(String personFirstName, String personLastName, String departmentName) {
        this.department = new Department(departmentName);
        this.person = new Person(personFirstName, personLastName);

    }

    @Override
    public String toString() {
        return "Employee{" +
                "person=" + person +
                ", department=" + department +
                '}';
    }

}
