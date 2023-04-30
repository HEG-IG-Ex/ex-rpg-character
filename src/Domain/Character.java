package Domain;
import java.util.ArrayList;
import java.util.List;

public abstract class Character {
    private String name;

    private Gender gender;

    private List<Object> physicalAttributes;

    private int credit;
    private List<Equipment> equipments;

    private int force;
    private int dexterity;
    private int intelligence;
    private int endurance;
    private int speed;
    private int constitution;

    public Character(String name, Gender gender, List<Object> physicalAttributes, int credit, int force, int dexterity, int intelligence, int endurance, int speed, int constitution) {
        this.name = name;
        this.gender = gender;
        this.physicalAttributes = physicalAttributes;
        this.credit = credit;
        this.force = force;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.endurance = endurance;
        this.speed = speed;
        this.constitution = constitution;
        equipments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Object> getPhysicalAttributes() {
        return physicalAttributes;
    }

    public void setPhysicalAttributes(List<Object> physicalAttributes) {
        this.physicalAttributes = physicalAttributes;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public void buyEquipment(Equipment e){
        credit -= e.getPrice();
        equipments.add(e);

    }
}
