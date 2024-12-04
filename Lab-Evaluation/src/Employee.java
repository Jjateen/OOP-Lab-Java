import java.util.ArrayList;

public class Employee extends User {
    String department;
    String contact;
    String nationality;
    String qualification;

    public Employee(int userID, String userName, String password, String userRole,
                    String department, String contact, String nationality, String qualification) {
        super(userID, userName, password, userRole);
        this.department = department;
        this.contact = contact;
        this.nationality = nationality;
        this.qualification = qualification;
        a.add(this);
    }
    void updateDetailsEmployee(int userID,String userName,String password,String userRole,String department, String contact, String nationality, String qualification){
        this.userID=userID;
        this.userName=userName;
        this.password=password;
        this.userRole=userRole;
        this.department = department;
        this.contact = contact;
        this.nationality = nationality;
        this.qualification = qualification;
    }
    public void applyLeave() {
        System.out.println("Leave application submitted for " + this.userID);
    }

    public void checkLeaveStatus() {
        System.out.println("Leave status checked.");
    }

    public void viewPaySlip() {
        System.out.println("Pay slip viewed.");
    }
    public String getContact() {
        return contact;
    }

    public String getDepartment() {
        return department;
    }

    public String getNationality() {
        return nationality;
    }

    public String getQualification() {
        return qualification;
    }
}
