/*
* File: Employee.java
* Author: Andó Attila
* Copyright: 2023, Andó Attila
* Group: Szoft I/1/N
* Date: 2023-05-23
* Github: https://github.com/halando/
* Licenc: GNU GPL
*/
import java.time.LocalDate;

public class Employee {
    
    String name;
    String city;
    String address;
    LocalDate birth;
    Double salary;
    public Employee() {
    }
    public Employee(String name, String city, String address, LocalDate birth, Double salary) {
       
        this.name = name;
        this.city = city;
        this.address = address;
        this.birth = birth;
        this.salary = salary;
    }
    
}
