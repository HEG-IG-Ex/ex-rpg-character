package Domain;

import java.util.List;

public class Wizard extends Character implements AttackStrategy{
    public Wizard(String name, Gender gender, List<Object> physicalAttributes, int credit, int force, int dexterity, int intelligence, int endurance, int speed, int constitution) {
        super(name, gender, physicalAttributes, credit, force, dexterity, intelligence, endurance, speed, constitution);
    }

    @Override
    public void attack() {

    }
}
