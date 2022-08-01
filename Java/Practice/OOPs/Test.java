package Practice.OOPs;
import java.util.*;


public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        List<Patient> patient = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            Patient p = new Patient();
            String Code = sc.next();
            String Name = sc.next();
            int age = sc.nextInt();
            String doctorName = sc.next();
            double billAmount = sc.nextDouble();

            p.__init__(Code , Name , age , doctorName , billAmount);

            patient.add(p);
        }

        Doctor d = new Doctor();
        d.__init__(patient);

        Patient maximumAge = new Patient();
        maximumAge = d.findPatientWithMaximumAge();
        System.out.println(maximumAge.Code);
        System.out.println(maximumAge.Name);
        System.out.println(maximumAge.age);
        System.out.println(maximumAge.doctorName);
        System.out.println(maximumAge.billAmount);

        ArrayList<Double> ans = new ArrayList<Double>();

        ans = d.sortPatientByBillAmount();
        for(int i=0 ; i<ans.size() ; i++){
            System.out.println(ans.get(i));
        }
    }
}
