/*
* File: .java
* Author: Andó Attila
* Copyright: 2023, Andó Attila
* Group: Szoft I/1/N
* Date: 2023-05-23
* Github: https://github.com/halando/
* Licenc: GNU GPL
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class LoadFile {

      static final String FILE_NAME = "berkft.txt";
    public LoadFile() {
    }

    public static ArrayList<Employee> load() {
        ArrayList<Employee> employeeList = null;
        try {
           employeeList = tryload();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba! A fájl nem található!");
        }
        return employeeList;
    }

    public static ArrayList<Employee> tryload() throws FileNotFoundException {
        ArrayList<Employee> employeesList = new ArrayList<>();
        File file = new File(FILE_NAME);
        Scanner scanner= new Scanner(file, "utf-8");
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            String [] lineArrays = line.split(":");
            Employee emp = new Employee();
            emp.name = lineArrays[0];
            emp.city = lineArrays[1];
            emp.address = lineArrays[2];
           String[] dataStrArrays =lineArrays[3].split("-");
            int year = Integer.parseInt(dataStrArrays[0]);
            int month = Integer.parseInt(dataStrArrays[1]);
            int day = Integer.parseInt(dataStrArrays[2]);
            emp.birth = LocalDate.of(year,month,day);
            emp.salary = Double.parseDouble( lineArrays[4]);

            employeesList.add(emp);
          

        }


        return employeesList;
    }
}
