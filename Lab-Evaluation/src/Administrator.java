import java.util.Objects;
import java.util.Scanner;
public class Administrator extends User {
    public Administrator(int userID, String userName, String password, String userRole) {
        super(userID, userName, password, userRole);
    }
    void addEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter userID"); int ui = sc.nextInt();
        System.out.println("Enter userName"); String un = sc.nextLine();
        System.out.println("Enter password"); String pass = sc.nextLine();
        System.out.println("Enter userRole"); String ur = sc.nextLine();
        System.out.println("Enter department"); String d = sc.nextLine();
        System.out.println("Enter contact"); String cc = sc.nextLine();
        System.out.println("Enter nationality"); String n = sc.nextLine();
        System.out.println("Enter qualification"); String q = sc.nextLine();
        Employee e = new Employee(ui,un,pass,ur,d,cc,n,q);
    }
    void defineAccessLevel(Employee e, String level){
        switch(level) {
            case "private":
                // define private access level for the employee
                System.out.println("Private access level defined for " + e.getUserName());
                break;
            case "default":
                // define default access level for the employee
                System.out.println("Default access level defined for " + e.getUserName());
                break;
            case "protected":
                // define protected access level for the employee
                System.out.println("Protected access level defined for " + e.getUserName());
                break;
            case "public":
                // define public access level for the employee
                System.out.println("Public access level defined for " + e.getUserName());
                break;
            default:
                System.out.println("Invalid access level. Please enter a valid access level.");
                break;
        }
    }

    void viewEmployees() {
        for(Employee e: a) {
                // Print employee data
                System.out.println("Employee ID: " + e.getUserID());
                System.out.println("Employee Name: " + e.getUserName());
                System.out.println("Employee userRole: " + e.getUserRole());
                System.out.println("Employee Department: " + e.getDepartment());
                System.out.println("Employee Department: " + e.getContact());
                System.out.println("Employee Department: " + e.getNationality());
                System.out.println("Employee Department: " + e.getQualification());
        }
    }
    void viewEmployee(int id) {
        for(Employee e: a) {
            if(e.userID==id){
                System.out.println("Employee ID: " + e.getUserID());
                System.out.println("Employee Name: " + e.getUserName());
                System.out.println("Employee userRole: " + e.getUserRole());
                System.out.println("Employee Department: " + e.getDepartment());
                System.out.println("Employee Contact: " + e.getContact());
                System.out.println("Employee Nationality: " + e.getNationality());
                System.out.println("Employee Qualification: " + e.getQualification());
            }
        }
    }
    void editEmployee(int nuserID, String newUserName, String npassword, String nuserRole, String ndepartment, String ncontact, String nnationality, String nqualification) {
        for (Employee e : a) {
            if (e.userID == nuserID) {
                e.updateDetailsEmployee(nuserID, newUserName, npassword, nuserRole, ndepartment, ncontact, nnationality, nqualification);
                System.out.println("Employee details updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    void newLogin(String uname,String pass){
        if(Objects.equals(this.userName, uname) && Objects.equals(this.password, pass)){
            System.out.println("You are logged in");
        }
        else{
            System.out.println("Invalid Credentials");
        }
    }

}
