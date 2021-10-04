package comp.comp152;

public class Person {
    private String Name;
    public Person(String Name){
        this.Name = Name;
    }

    public void getTreated(){
        System.out.println("My name is " + Name + "and I feel so much better!");
    }

    public void payBill(double bill){
        System.out.println("Ouch, I need to pay a bill off "+ bill);
    }
}
