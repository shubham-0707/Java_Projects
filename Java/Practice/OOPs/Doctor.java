package Practice.OOPs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Doctor {
    private String Doctor;
    private List<Patient> PatientList;

    public void __init__(List<Patient> PatientList){
        this.PatientList = PatientList;
    }

    public Patient findPatientWithMaximumAge(){
        if(PatientList.isEmpty()){
            System.out.println("No Data Found");
        }
        int maxi = 0;
        int pointer=0;
        int x = 0;
        for(Patient p : PatientList){
            if(p.age>maxi){
                maxi=p.age;
                pointer=x;
            }
            x++;
        }
        return PatientList.get(pointer);
    }

    public ArrayList<Double> sortPatientByBillAmount(){
        if(PatientList.isEmpty()){
            System.out.println("No Data Found");
        }
        ArrayList<Double> arr = new ArrayList<Double>();
        for(Patient p : PatientList){
            arr.add(p.billAmount);
        }
        Collections.sort(arr);
        return arr;
    }
}
