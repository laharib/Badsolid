class AdministrationStaff{
    void work(){}
    void print_details(){}
}

class Helpers{
    void work(){}
    void print_details(){}
}
public class Staff {
    AdministrationStaff admin;
    Helpers peon;
    public Staff(AdministrationStaff newAdmin, Helpers newPeon)
    {
        this.admin=newAdmin;
        this.peon=newPeon;
        //code to add a new staff member of type AdministrationStaff
    }
}
