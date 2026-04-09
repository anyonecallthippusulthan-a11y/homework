package employeemanagementsystem;

public class employeedetail {
 private  String empID;
 private  String ename;
 private double Salary;

 
    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        
        
       if(Salary>=0)
       {
           this.Salary = Salary;
       }
        else {
            System.out.println("Invalid salary!");
        }
       
        
    }
    
    public void display(String name)
    {
        System.out.println("Employee ID           :"+empID);
        System.out.println("Empolyee Name         :"+ename);
        System.out.println("Empolyee designation  :"+name);
        System.out.println("Employee salaray      :"+Salary );
    }
 
}
