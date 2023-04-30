package Factories;
import Builders.Builder;
import Domain.Class;

public class CharacterCreator {
    CharacterBuilderFactory factory;

    public CharacterCreator() {
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
