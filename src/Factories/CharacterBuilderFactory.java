package Factories;

import Builders.BowmanBuilder;
import Builders.Builder;
import Builders.WarriorBuilder;
import Builders.WizardBuilder;
import Domain.Gender;

public class CharacterBuilderFactory {
    private static CharacterBuilderFactory instance;

    private CharacterBuilderFactory() {
    }

    public static CharacterBuilderFactory getInstance() {
        if (instance == null) {
            instance = new CharacterBuilderFactory();
        }
        return instance;
    }
    public WarriorBuilder createWarriorBuilder(){
        WarriorBuilder wb = new WarriorBuilder();
        this.makeWarrior(wb);
        return wb;
    }
    public WizardBuilder createWizardBuilder(){
        WizardBuilder wb = new WizardBuilder();
        this.makeWizard(wb);
        return wb;
    }
    public BowmanBuilder createBowmanBuilder(){
        BowmanBuilder bb = new BowmanBuilder();
        this.makeBowman(bb);
        return bb;
    }


    public void makeWarrior(Builder wb){
        wb.setName("Warrior");
        wb.setGender(Gender.MALE);

        wb.setCredit(100);

        wb.setConstitution(15);
        wb.setEndurance(10);
        wb.setForce(15);
    }

    public void makeWizard(Builder wb){
        wb.setName("Wizard");
        wb.setGender(Gender.FEMALE);

        wb.setCredit(100);

        wb.setConstitution(10);
        wb.setEndurance(10);
        wb.setIntelligence(20);
    }

    public void makeBowman(Builder wb){
        wb.setName("Bowman");
        wb.setGender(Gender.MALE);

        wb.setCredit(100);

        wb.setConstitution(10);
        wb.setEndurance(10);
        wb.setSpeed(5);
        wb.setDexterity(15);
    }
}
