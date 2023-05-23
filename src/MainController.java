/*
* File: MainController.java
* Author: Andó Attila
* Copyright: 2023, Andó Attila
* Group: Szoft I/1/N
* Date: 2023-05-23
* Github: https://github.com/halando/
* Licenc: GNU GPL
*/
import java.util.ArrayList;

public class MainController {
    MainFrame mainFrame;
    ArrayList<Employee>emplist;
    int actual;
    public MainController() {
        this.actual = 0;
        this.mainFrame =new  MainFrame();
        this.emplist = LoadFile.load();
        System.out.println("Hello-----------------------------------------------------");
        System.out.println(this.emplist.size());
        this.handleEvent();
        this.loadEmployee(this.emplist.get(0));
      
    }
   private void handleEvent(){
    this.mainFrame
    .getPreviousButton()
    .addActionListener(e -> {
        this.startPrevious();
    });
    this.mainFrame
    .getNextButton()
    .addActionListener(e -> {
        this.startNext();
    });
   }
    private void startPrevious(){
        System.out.println("Vissza...");
        if(this.actual > 0){
            this.actual--;
        this.loadEmployee(this.emplist.get(this.actual));
        }
        

    }
    private void startNext(){
        System.out.println("Előre....");
        int count = this.emplist.size();
        if(this.actual < count -1){
            this.actual++;
            this.loadEmployee(this.emplist.get(this.actual));
        }

    
       

    }
    private void loadEmployee(Employee emp){
    this.mainFrame.namePanel.setValue(emp.name);
    this.mainFrame.cityPanel.setValue(emp.city);
    this.mainFrame.addressPanel.setValue(emp.address);
    this.mainFrame.birthPanel.setValue(emp.birth.toString());
    this.mainFrame.salaryPanel.setValue(emp.salary.toString());
    }

    
}
