public class Main {
    public static void main(String[] args) {
        Employee e1= new Employee(101,"Jj","abc","role","dep","4489","wDSG","EGWW");
        Employee e2= new Employee(2,"Ayush","abc","role","dep","4489","wDSG","EGWW");
        HRAdmin hra = new HRAdmin(3,"AdminSir","abc","role","dep","4489","wDSG","EGWW");
        hra.viewEmployee(101);
        hra.editEmployee(101,"Jjateen","abc","role","dep","4489","wDSG","EGWW");
        hra.viewEmployee(101);
        System.out.println("\n");
        hra.viewEmployees();
    }
}
