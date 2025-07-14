package workshop.beans;

public class TemperatureApplication {
    public TemperatureApplications(){

    }
    public static void main(String[]args){
        Organaization vet= new  Organaization("Vellalar",
        "Thindal","www.vet.com","Contact@vet.com",
        "+91-9486841411",200387951);

        System.out.println(vet);
        System.out.println(vet.name());
        System.out.println(vet.completeAddress());
        System.out.println(vet.website());
        System.out.println(vet.email());
        System.out.println(vet.contactNumber());
        System.out.println(vet.registrationNumber());
    }

}
