import Builders.Builder;
import Builders.WarriorBuilder;
import Domain.Class;
import Factories.Game;

public class Main {


    public static void main(String[] args) {
        Game game = new Game();
        Builder wb = game.createNewCharacter(Class.WARRIOR);
	// write your code here
    }
}
git