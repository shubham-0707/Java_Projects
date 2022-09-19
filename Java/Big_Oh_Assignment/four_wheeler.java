package Big_Oh_Assignment;

public class four_wheeler extends Vehicle {


    // this class is made to uniquely add some features to the cars which are not common to bike...
    private int no_of_airbags;

    private   String autopilot_or_not;


    public int getNo_of_airbags() {
        return no_of_airbags;
    }

    public void setNo_of_airbags(int no_of_airbags) {
        this.no_of_airbags = no_of_airbags;
    }

    public String getAutopilot_or_not() {
        return autopilot_or_not;
    }

    public void setAutopilot_or_not(String autopilot_or_not) {
        this.autopilot_or_not = autopilot_or_not;
    }
}
