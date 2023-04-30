package Factories;

import Builders.BowmanBuilder;
import Builders.Builder;
import Builders.WarriorBuilder;
import Builders.WizardBuilder;
import Domain.Class;
import Domain.Gender;
import Domain.Warrior;

public class Game {
    CharacterBuilderFactory factory;

    public Game() {
    }

    public Builder createNewCharacterBuilder(Class type){
        switch (type) {
            case WARRIOR:
                return factory.getInstance().createWarriorBuilder();

            case WIZARD:
                return factory.getInstance().createWizardBuilder();

            case BOWMAN:
                return factory.getInstance().createBowmanBuilder();
        }
        return null;
    }
}
