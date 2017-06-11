package stickFighter;

import java.util.concurrent.ArrayBlockingQueue;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Arena extends Application {
	public static void main(String args[]) {
		launch(args);
	}

	private static Character player1;
	private static Character player2;
	private static ArrayBlockingQueue<String> queue;
	private static Group root = new Group();
	private static Scene scene = new Scene(root, 700, 500);

	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);

		setPlayer1(new Superman(1));
		setPlayer2(new Superman(2));

			createCharacter(getPlayer1());
			createCharacter(getPlayer2());
			
	

		// 😃😃😃😃😃😃😃😃😃😃😃😃😃😃😃😃😃😃😃😃😃😃😃

		primaryStage.show();

	}

	public void createCharacter(Character character) {
			

		root.getChildren().add(character.getCape());
	
		root.getChildren().add(character.getBody());
		root.getChildren().add(character.getSymbol());
	
		root.getChildren().add(character.getUnderwear());
		
		root.getChildren().add(character.getNeck());
	
		root.getChildren().add(character.getHead());
		root.getChildren().add(character.getFace());
		root.getChildren().add(character.getHlArm());		
		root.getChildren().add(character.getHrArm());	
		root.getChildren().add(character.getLlArm());	
		root.getChildren().add(character.getLrArm());	
		root.getChildren().add(character.getHhlLeg());	
		root.getChildren().add(character.getHhrLeg());	
		
		

		//		root.getChildren().add(character.getLeftArm());
//		root.getChildren().add(character.getRightArm());
//		root.getChildren().add(character.getLeftLeg());
//		root.getChildren().add(character.getRightLeg());
//		root.getChildren().add(character.getHitBox());

		Arena.getScene().setOnKeyPressed(new EventHandler<KeyEvent>() {
		public void handle(KeyEvent e) {
			KeyCode code = e.getCode();

			getPlayer1().executeP1Action(code);
			
			getPlayer2().executeP2Action(code);
			
			//	
//			if(code.equals(KeyCode.Q)){
//				getPlayer1().useQueue();
//				getPlayer2().useQueue();
//			}
		
//			if (code.equals(KeyCode.D)) {
//				getPlayer1().getQueue().add("right");
////				 getPlayer1().walk("right");
//			} else if (code.equals(KeyCode.A)) {
//				getPlayer1().getQueue().add("left");
////				 getPlayer1().walk("left");
//			} else if (code.equals(KeyCode.S) && !getPlayer1().isDucking()) {
//				getPlayer1().duck(true);
//			} else if (code.equals(KeyCode.W)) {
//				getPlayer1().jump();
//			} else if (code.equals(KeyCode.SHIFT)) {
//				getPlayer1().attack();
//			}

//			if (code.equals(KeyCode.RIGHT))
////				getPlayer2().getQueue().add("right");
//			 getPlayer2().walk("right");
//			else if (code.equals(KeyCode.LEFT))
////				 getPlayer2().walk("left");
//				getPlayer2().getQueue().add("left");
//			else if (code.equals(KeyCode.DOWN) && !getPlayer2().isDucking())
//				getPlayer2().duck(true);
//			else if (code.equals(KeyCode.UP))
//				getPlayer2().jump();
//
//			if (code.equals(KeyCode.ALT))
//				getPlayer2().attack();
//			
//			getPlayer1().useQueue();
//			getPlayer2().useQueue();
		}
	});

	getScene().setOnKeyReleased(new EventHandler<KeyEvent>() {
		public void handle(KeyEvent e) {
//			getPlayer1().useQueue();
//			getPlayer2().useQueue();
			KeyCode code = e.getCode();
			if (code.equals(KeyCode.S))
				getPlayer1().duck(false);
			if (code.equals(KeyCode.DOWN))
				getPlayer2().duck(false);
		}
	});

	}

	public static Group getRoot() {
		return root;
	}

	public static void setRoot(Group root) {
		Arena.root = root;
	}

	public static Scene getScene() {
		return scene;
	}

	public static void setScene(Scene scene) {
		Arena.scene = scene;
	}

	public static ArrayBlockingQueue<String> getQueue() {
		return queue;
	}

	public static void setQueue(ArrayBlockingQueue<String> queue) {
	Arena.queue = queue;
	}
	
	public static Character getPlayer1() {
		return player1;
	}

	public void setPlayer1(Character player1) {
		Arena.player1 = player1;
	}

	public static Character getPlayer2() {
		return player2;
	}

	public void setPlayer2(Character player2) {
		Arena.player2 = player2;
	}
	
	public static void runUseQueue() {

		System.out.println(Arena.getQueue().size());
		
		if (Arena.getPlayer1().isExecuteQueue() && Arena.getPlayer2().isExecuteQueue()) {
		Arena.getPlayer1().useQueue();	
		Arena.getPlayer2().useQueue();	
		}

	
	}
	
}


