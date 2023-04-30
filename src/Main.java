import Builders.BowmanBuilder;
import Builders.Builder;
import Builders.WarriorBuilder;
import Builders.WizardBuilder;
import Domain.*;
import Domain.Class;
import Factories.Game;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Game game = new Game();

        // WARRIOR

        // Pre config Warrior
        Builder warBuilder = game.createNewCharacterBuilder(Class.WARRIOR);
        // Custom Attributes
        warBuilder.setPhysicalAttributes(new ArrayList<>());
        // Finalize
        Warrior warrior = (Warrior) warBuilder.build();

        // Play
        warrior.buyEquipment(new Equipment(50, "Epee"));
        warrior.attack();

        // WIZARD

        Builder wizBuilder = game.createNewCharacterBuilder(Class.WIZARD);
        wizBuilder.setPhysicalAttributes(new ArrayList<>());
        Wizard wizard = (Wizard) wizBuilder.build();
        wizard.buyEquipment(new Equipment(40, "Sceptre"));
        wizard.attack();

        // BOWMAN

        Builder bowBuilder = game.createNewCharacterBuilder(Class.BOWMAN);
        bowBuilder.setPhysicalAttributes(new ArrayList<>());
        Bowman bowman = (Bowman) bowBuilder.build();
        bowman.buyEquipment(new Equipment(30, "Arc"));
        bowman.attack();
    }
}