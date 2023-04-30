package Builders;
import Domain.Gender;
import Domain.Wizard;
import java.util.List;

public class WizardBuilder implements Builder{
    private String name;
    private Gender gender;
    private List<Object> physicalAttributes;
    private int credit;
    private int force;
    private int dexterity;
    private int intelligence;
    private int endurance;
    private int speed;
    private int constitution;

    @Override
    public void setName(String n) {
        this.name = n;
    }

    @Override
    public void setGender(Gender g) {
        this.gender = g;
    }

    @Override
    public void setPhysicalAttributes(List<Object> pa) {
        this.physicalAttributes = pa;
    }

    @Override
    public void setCredit(int c) {
        this.credit = c;
    }

    @Override
    public void setForce(int f) {
        this.force = f;
    }

    @Override
    public void setDexterity(int d) {
        this.dexterity = d;
    }

    @Override
    public void setIntelligence(int i) {
        this.intelligence = i;
    }

    @Override
    public void setEndurance(int e) {
        this.endurance = e;
    }

    @Override
    public void setSpeed(int s) {
        this.speed = s;
    }

    @Override
    public void setConstitution(int c) {
        this.constitution = c;
    }

    public Wizard build(){
        return new Wizard(name, gender, physicalAttributes, credit, force, dexterity, intelligence, endurance, speed, constitution);
    }
}
