package Factories;

import Builders.BowmanBuilder;
import Builders.Builder;
import Builders.WarriorBuilder;
import Builders.WizardBuilder;
import Domain.Class;

public class Game {
    CharacterBuilderFactory factory;

    public Game() {
        this.factory = new CharacterBuilderFactory();
    }

    public Builder createNewCharacter(Class type){
        switch (type) {
            case WARRIOR:
                return new WarriorBuilder();

            case WIZARD:
                return new WizardBuilder();

            case BOWMAN:
                return new BowmanBuilder();
        }
        return null;
    }
}
