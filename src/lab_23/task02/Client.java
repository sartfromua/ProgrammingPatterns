package lab_23.task02;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        final List<MilitaryObject> militaryObjects = new ArrayList<>();
        militaryObjects.add(new GeneralStaff(20, 100));
        militaryObjects.add(new MilitaryBase(10, 1000, 300, 20));

        for (MilitaryObject military : militaryObjects) {
            System.out.println(military);
        }

        SecretAgent secretAgent = new SecretAgent();
        Diversant diversant = new Diversant();

        militaryObjects.getFirst().acceptSpy(diversant);
        militaryObjects.getFirst().acceptSpy(secretAgent);
        System.out.println("Found " + secretAgent.getInfo() + " secret documents");

        militaryObjects.get(1).acceptSpy(diversant);
        militaryObjects.get(1).acceptSpy(secretAgent);
        militaryObjects.getFirst().acceptSpy(diversant);
        militaryObjects.getFirst().acceptSpy(diversant);
        militaryObjects.getFirst().acceptSpy(secretAgent);
        System.out.println("Found " + secretAgent.getInfo() + " secret documents");

        for (MilitaryObject military : militaryObjects) {
            System.out.println(military);
        }
    }

}
