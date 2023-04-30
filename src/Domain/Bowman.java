package Domain;

import java.util.List;

public class Bowman extends Character implements AttackStrategy{

    public Bowman(String name, Gender gender, List<Object> physicalAttributes, int credit, int force, int dexterity, int intelligence, int endurance, int speed, int constitution) {
        super(name, gender, physicalAttributes, credit, force, dexterity, intelligence, endurance, speed, constitution);
    }

    @Override
    public void attack() {
        System.out.println("Shoot an arrow !");
    }
}
