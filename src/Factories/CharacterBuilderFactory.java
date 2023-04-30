package Factories;

import Builders.BowmanBuilder;
import Builders.WarriorBuilder;
import Builders.WizardBuilder;

public class CharacterBuilderFactory {
    public WarriorBuilder newWarriorBuilder(){
        return new WarriorBuilder();
    }
    public WizardBuilder newWizardBuilder(){
        return new WizardBuilder();
    }
    public BowmanBuilder newBowmanBuilder(){
        return new BowmanBuilder();
    }
}
