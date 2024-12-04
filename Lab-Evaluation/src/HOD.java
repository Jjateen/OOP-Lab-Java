public class HOD extends Employee {
    public HOD(int userID, String userName, String password, String userRole,
               String department, String contact, String nationality, String qualification) {
        super(userID, userName, password, userRole, department, contact, nationality, qualification);
    }

    public void viewReports() {
        System.out.println("Reports viewed.");
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
}
