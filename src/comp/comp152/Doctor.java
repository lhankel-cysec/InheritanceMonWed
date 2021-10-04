package comp.comp152;

public class Doctor {
    protected String AlmaMater;
    public double fee;

    public Doctor(String MedSchool, double fee){
         AlmaMater = MedSchool;
         this.fee = fee;

    }

    public void treatPatient(Person patient){
        System.out.println("Doctor: I hope you feel better!");
        patient.getTreated();


    }

    public double billPatient(Person patient){
        patient.payBill(fee);
        return fee;
    }

    public double billPatient(boolean isMedicare, GovernmentProgram program){
        if (isMedicare)
            return fee/2;
        return fee;

    }
}
