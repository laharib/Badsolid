public interface CollegeFacilities {
    public void transportServices();
    public void foodServices();
    public void security();
    public void cleaning();
}
class BusService implements CollegeFacilities{
    public void transportServices(){}
    public void foodServices(){}
    public void security(){}
    public void cleaning(){}
}
class Canteen implements CollegeFacilities{
    public void transportServices(){}
    public void foodServices(){}
    public void security(){}
    public void cleaning(){}
}
class SecurityGuards implements CollegeFacilities{
    public void transportServices(){}
    public void foodServices(){}
    public void security(){}
    public void cleaning(){}
}