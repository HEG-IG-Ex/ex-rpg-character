import Builders.Builder;
import Domain.*;
import Domain.Class;
import Factories.CharacterCreator;
import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {
        CharacterCreator creator = new CharacterCreator();

        // WARRIOR

        // Pre config Warrior
        Builder warBuilder = creator.createNewCharacterBuilder(Class.WARRIOR);
        // Custom Attributes
        warBuilder.setPhysicalAttributes(new ArrayList<>());
        // Finalize
        Warrior warrior = (Warrior) warBuilder.build();

        // Play
        warrior.buyEquipment(new Equipment(50, "Epee"));
        warrior.attack();

        // WIZARD

        Builder wizBuilder = creator.createNewCharacterBuilder(Class.WIZARD);
        wizBuilder.setPhysicalAttributes(new ArrayList<>());
        Wizard wizard = (Wizard) wizBuilder.build();
        wizard.buyEquipment(new Equipment(40, "Sceptre"));
        wizard.attack();

        // BOWMAN

        Builder bowBuilder = creator.createNewCharacterBuilder(Class.BOWMAN);
        bowBuilder.setPhysicalAttributes(new ArrayList<>());
        Bowman bowman = (Bowman) bowBuilder.build();
        bowman.buyEquipment(new Equipment(30, "Arc"));
        bowman.attack();
    }
}