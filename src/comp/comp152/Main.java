package comp.comp152;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    var inNetworkDoctor = new ArrayList<Doctor>();
	    inNetworkDoctor.add(new Doctor( "Pricy Univsersity", 400));
	    inNetworkDoctor.add(new Surgeon(  "Children's Hospital", " Fancy Univ", 1000.0));
        var sickPerson1 = new Person( "Stu dent");
	    var sickPerson2 = new Person( "Some Body");
	    var picker = new Random();
	    var choice = picker.nextInt(inNetworkDoctor.size());
	    Doctor doc = inNetworkDoctor.get(choice);
	    doc.treatPatient(sickPerson1);
	    doc.billPatient(sickPerson1);
    }
}
