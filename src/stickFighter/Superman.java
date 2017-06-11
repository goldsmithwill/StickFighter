package stickFighter;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class Superman extends Character {
	public Superman(int player) {
		createCharacter(5, 9, player, Color.BLUE, Color.RED, Color.TAN,
				new Image("file:superman-clipart-9i4E9jeiE.gif"), new Image("file:SupermanFace.png"));
	}
}
