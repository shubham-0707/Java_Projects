package Big_Oh_Assignment;

public class Vehicle {
    private String name;
    private String structure;
    private String fuel_type;
    private String imp_or_not;

    private String new_or_used;


    // this is my default constructor...
    Vehicle(){
        this.name = "Test data";
        this.structure = "Test data";
        this.fuel_type = "Test data";
        this.imp_or_not = "Test data";
        this.new_or_used = "Test data";
    }


    // this is my parametrised constructor...
    Vehicle(String name , String structure , String fuel_type , String imp_or_not, String new_or_used){
        this.name = name;
        this.structure = structure;
        this.fuel_type = fuel_type;
        this.imp_or_not = imp_or_not;
        this.new_or_used = new_or_used;
    }


    // Applying getter and setter..
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public String getImp_or_not() {
        return imp_or_not;
    }

    public String getNew_or_used() {
        return new_or_used;
    }

    public void setNew_or_used(String new_or_used) {
        this.new_or_used = new_or_used;
    }

    public void setImp_or_not(String imp_or_not) {
        this.imp_or_not = imp_or_not;
    }
}
