package comp.comp152;

import java.util.Random;

public class GovernmentProgram {
    private String programType;


    public GovernmentProgram(){
        String[] types ={"Medicare", "Medicaid", "VA", "ObamaCare", "Insuricare"};
        var numberPicker = new Random();
        var pick = numberPicker.nextInt(5);
        programType = types[pick];
    }

    public void payBill(double bill){
        if (programType.equals("Insuricare"))
            System.out.println(programType + "Just paid a bill of " + bill+3);
        else
            System.out.println(programType+" Just paid a bill of "+ bill);
    }

}
