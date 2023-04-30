package Builders;
import Domain.Gender;
import Domain.Warrior;
import Domain.Wizard;
import java.util.List;

public class WizardBuilder implements Builder<Wizard>{

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

    public void setName(String n) {
        this.name = n;
    }

    public void setGender(Gender g) {
        this.gender = g;
    }

    public void setPhysicalAttributes(List<Object> pa) {
        this.physicalAttributes = pa;
    }

    public void setCredit(int c) {
        this.credit = c;
    }

    public void setForce(int f) {
        if(!isAttributePointsInRange(f)) throw new IllegalArgumentException("Attributes points must be within the range 5 to 20");
        this.force = f;
    }

    public void setDexterity(int d) {
        if(!isAttributePointsInRange(d)) throw new IllegalArgumentException("Attributes points must be within the range 5 to 20");
        this.dexterity = d;
    }

    public void setIntelligence(int i) {
        if(!isAttributePointsInRange(i)) throw new IllegalArgumentException("Attributes points must be within the range 5 to 20");
        this.intelligence = i;
    }

    public void setEndurance(int e) {
        if(!isAttributePointsInRange(e)) throw new IllegalArgumentException("Attributes points must be within the range 5 to 20");
        this.endurance = e;
    }

    public void setSpeed(int s) {
        if(!isAttributePointsInRange(s)) throw new IllegalArgumentException("Attributes points must be within the range 5 to 20");
        this.speed = s;
    }

    public void setConstitution(int c) {
        if(!isAttributePointsInRange(c)) throw new IllegalArgumentException("Attributes points must be within the range 5 to 20");
        this.constitution = c;
    }

    public int getTotalPoint() {
        return this.force + this.dexterity + this.intelligence + this.endurance + this.speed + this.constitution;
    }

    public boolean isAttributePointsInRange(int value) {
        return (value >= 5 && value <= 20);
    }

    public void validate(){
        if (this.name == null || this.name.isEmpty()) {
            throw new IllegalStateException("Name cannot be null or empty");
        }
        if (this.gender == null) {
            throw new IllegalStateException("Gender cannot be null");
        }
        if (this.getTotalPoint() != 40) {
            throw new IllegalStateException("A total of 40 points should be allocated to the 6 characteristics");
        }
    }
    public Wizard build(){

        this.validate();

        return new Wizard(
                name,
                gender,
                physicalAttributes,
                credit,
                force,
                dexterity,
                intelligence,
                endurance,
                speed,
                constitution
        );
    }
}
