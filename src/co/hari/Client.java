package co.hari;

public class Client {
    public static void main(String[] args) {

        Employee eRef = new Employee();
        eRef.seteId(101);
        eRef.seteAddress("Britan");
        eRef.seteName("Sherlock");

        System.out.println("Employee :" + eRef);



    }
}
