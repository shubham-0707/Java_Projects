package Big_Oh_Assignment;

public class two_wheeler extends Vehicle{


    // This class is made to uniquely add some features in the bike which are not common to car....

    private String model; // BS-4 or BS-5
    private String wheel_type; // alloy or non alloy...

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWheel_type() {
        return wheel_type;
    }

    public void setWheel_type(String wheel_type) {
        this.wheel_type = wheel_type;
    }

}
