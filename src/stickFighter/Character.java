package stickFighter;

import java.util.concurrent.ArrayBlockingQueue;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class Character {

	private boolean walk = true;
	private int walkDistance;
	private int speed;
	private int strokeWidth;
	private int walkDirectionNum;
	private int walkFromX;
	private boolean isDoneWalking;

	
	private Polygon cape;
	private Polygon body;
	private Rectangle hitBox;

	private Polygon hlArm;
	private Polygon hrArm;
	private Polygon llArm;
	private Polygon lrArm;
	private Polygon hhlLeg;
	private Polygon hhrLeg;
	private Polygon hlLeg;
	private Polygon hrLeg;
	private Polygon llLeg;
	private Polygon lrLeg;
	private Rectangle neck;
	private Rectangle leftHand;
	private Polygon rightHand;
	private Polygon leftFoot;
	private Polygon rightFoot;
	private Polygon underwear;
	private ImageView symbol;
	private Circle head;
	private ImageView face;
	private int player;
	private boolean isDucking;
	private boolean executeQueue;

	public void attack() {
		// Line attackLimb;
		// if (getWalkDirectionNum() < 0) {
		// rotateLimb(getRightArm(), 360, 1200 / getSpeed(), 1);
		// attackLimb = getRightArm();
		// } else {
		// rotateLimb(getLeftArm(), -360, 1200 / getSpeed(), 1);
		// attackLimb = getLeftArm();
		// }
		// if (((Path) Shape.intersect(Arena.getPlayer1().getHitBox(), Arena
		// .getPlayer2().getHitBox())).getElements().size() > 0) {
		// System.out.println("Hit!");
		// }
	}

	public void walk(String direction) {
		// if (direction.equals("left"))
		// setWalkDirectionNum(-1);
		// else if (direction.equals("right"))
		// setWalkDirectionNum(1);
		//
		// if (isDoneWalking())
		// if (isWalk()) {
		// rotateLimb(getRightArm(), 35, 1200 / getSpeed(), 1);
		// rotateLimb(getLeftArm(), -35, 1200 / getSpeed(), 1);
		// rotateLimb(getRightLeg(), 35, 1200 / getSpeed(), 1);
		// rotateLimb(getLeftLeg(), -35, 1200 / getSpeed(), 1);
		// setWalk(false);
		// } else {
		// rotateLimb(getRightArm(), -35, 1200 / getSpeed(), 1);
		// rotateLimb(getLeftArm(), 35, 1200 / getSpeed(), 1);
		// rotateLimb(getRightLeg(), -35, 1200 / getSpeed(), 1);
		// rotateLimb(getLeftLeg(), 35, 1200 / getSpeed(), 1);
		// setWalk(true);
		// }
		//
		// setDoneWalking(false);
		// Shape[] bodyPartArray = { getBody(), getRightArm(), getLeftArm(),
		// getRightLeg(), getLeftLeg(), getHead(), getHitBox() };
		//
		// for (Shape bodyPart : bodyPartArray) {
		// TranslateTransition translateTransition = new TranslateTransition(
		// Duration.millis(225 / getSpeed()), bodyPart);
		//
		// translateTransition.setFromX(getWalkFromX());
		//
		// translateTransition.setToX(translateTransition.getFromX()
		// + getWalkDirectionNum()*getSpeed());
		//
		// translateTransition.setCycleCount(1);
		// translateTransition.play();
		// translateTransition.setOnFinished(new EventHandler<ActionEvent>() {
		// @Override
		// public void handle(ActionEvent ev) {
		// setWalkFromX(getWalkFromX() + getWalkDirectionNum()*getSpeed());
		// }
		// });
		//
		// }

	}

	public void duck(boolean isDucking) {

		// if (isDucking) {
		// if (isWalk()) {
		// rotateLimb(getRightArm(), 90, 1000 / getSpeed(), 1);
		// rotateLimb(getLeftArm(), -90, 1000 / getSpeed(), 1);
		// rotateLimb(getRightLeg(), 90, 1000 / getSpeed(), 1);
		// rotateLimb(getLeftLeg(), -90, 1000 / getSpeed(), 1);
		// } else {
		// rotateLimb(getRightArm(), -90, 1000 / getSpeed(), 1);
		// rotateLimb(getLeftArm(), 90, 1000 / getSpeed(), 1);
		// rotateLimb(getRightLeg(), -90, 1000 / getSpeed(), 1);
		// rotateLimb(getLeftLeg(), 90, 1000 / getSpeed(), 1);
		// }
		//
		// Shape[] bodyPartArray = { getBody(), getRightArm(), getLeftArm(),
		// getRightLeg(), getLeftLeg(), getHead(), getHitBox() };
		//
		// for (Shape bodyPart : bodyPartArray) {
		// TranslateTransition translateTransition = new TranslateTransition(
		// Duration.millis(1200 / getSpeed()), bodyPart);
		//
		// translateTransition.setFromY(0);
		//
		// translateTransition.setToY(35);
		// translateTransition.setCycleCount(1);
		// translateTransition.play();
		// setDucking(true);
		// }
		// } else {
		// if (isWalk()) {
		// rotateLimb(getRightArm(), -90, 1200 / getSpeed(), 1);
		// rotateLimb(getLeftArm(), 90, 1200 / getSpeed(), 1);
		// rotateLimb(getRightLeg(), -90, 1200 / getSpeed(), 1);
		// rotateLimb(getLeftLeg(), 90, 1200 / getSpeed(), 1);
		// } else {
		// rotateLimb(getRightArm(), 90, 1200 / getSpeed(), 1);
		// rotateLimb(getLeftArm(), -90, 1200 / getSpeed(), 1);
		// rotateLimb(getRightLeg(), 90, 1200 / getSpeed(), 1);
		// rotateLimb(getLeftLeg(), -90, 1200 / getSpeed(), 1);
		// }
		//
		// Shape[] bodyPartArray = { getBody(), getRightArm(), getLeftArm(),
		// getRightLeg(), getLeftLeg(), getHead(), getHitBox() };
		//
		// for (Shape bodyPart : bodyPartArray) {
		// TranslateTransition translateTransition = new TranslateTransition(
		// Duration.millis(1200 / getSpeed()), bodyPart);
		//
		// translateTransition.setFromY(35);
		//
		// translateTransition.setToY(0);
		// translateTransition.setCycleCount(1);
		// translateTransition.play();
		//
		// setDucking(false);
		// }
		// }

	}

	// TODO
	// public void action(){
	// case
	// jump
	// duck
	// walk
	// action
	// }

	public void jump() {
		// duck(true);
		// duck(false);
		//
		// if (isWalk()) {
		// rotateLimb(getRightArm(), -90, 1000 / getSpeed(), 1);
		// rotateLimb(getLeftArm(), 90, 1000 / getSpeed(), 1);
		// rotateLimb(getRightLeg(), 30, 1000 / getSpeed(), 1);
		// rotateLimb(getLeftLeg(), -30, 1000 / getSpeed(), 1);
		// } else {
		// rotateLimb(getRightArm(), 90, 1000 / getSpeed(), 1);
		// rotateLimb(getLeftArm(), -90, 1000 / getSpeed(), 1);
		// rotateLimb(getRightLeg(), -30, 1000 / getSpeed(), 1);
		// rotateLimb(getLeftLeg(), 30, 1000 / getSpeed(), 1);
		// }
		//
		// Shape[] bodyPartArray = { getBody(), getRightArm(), getLeftArm(),
		// getRightLeg(), getLeftLeg(), getHead(), getHitBox() };
		//
		// for (Shape bodyPart : bodyPartArray) {
		// TranslateTransition translateTransition = new TranslateTransition(
		// Duration.millis(1200 / getSpeed()), bodyPart);
		//
		// translateTransition.setFromY(0);
		//
		// translateTransition.setToY(-70);
		//
		// translateTransition.setCycleCount(1);
		//
		// translateTransition.play();
		//
		// translateTransition.setOnFinished(new EventHandler<ActionEvent>() {
		// @Override
		// public void handle(ActionEvent ev) {
		// if (isWalk()) {
		// rotateLimb(getRightArm(), 90 / bodyPartArray.length,
		// 1000 / getSpeed(), 1);
		// rotateLimb(getLeftArm(), -90 / bodyPartArray.length,
		// 1000 / getSpeed(), 1);
		// rotateLimb(getRightLeg(), -30 / bodyPartArray.length,
		// 1000 / getSpeed(), 1);
		// rotateLimb(getLeftLeg(), 30 / bodyPartArray.length,
		// 1000 / getSpeed(), 1);
		// } else {
		// rotateLimb(getRightArm(), -90 / bodyPartArray.length,
		// 1000 / getSpeed(), 1);
		// rotateLimb(getLeftArm(), 90 / bodyPartArray.length,
		// 1000 / getSpeed(), 1);
		// rotateLimb(getRightLeg(), 30 / bodyPartArray.length,
		// 1000 / getSpeed(), 1);
		// rotateLimb(getLeftLeg(), -30 / bodyPartArray.length,
		// 1000 / getSpeed(), 1);
		// }
		//
		// TranslateTransition translateDownTransition = new
		// TranslateTransition(
		// Duration.millis(1200 / getSpeed()), bodyPart);
		// translateDownTransition.setFromY(-70);
		// translateDownTransition.setToY(0);
		// translateDownTransition.setCycleCount(1);
		// translateDownTransition.playFromStart();
		// }
		// });
		// }
	}

	public void rotateLimb(Line limb, int degrees, int speed, int cycleCount) {
		Rotate rotate = new Rotate();
		rotate.pivotXProperty().bind(limb.startXProperty());
		rotate.pivotYProperty().bind(limb.startYProperty());
		limb.getTransforms().add(rotate);

		Timeline timeline = new Timeline();
		timeline.setCycleCount(cycleCount);

		KeyValue keyValue = new KeyValue(rotate.angleProperty(), degrees);
		KeyFrame keyFrame = new KeyFrame(Duration.millis(speed), keyValue);

		timeline.getKeyFrames().add(keyFrame);
		timeline.play();

		timeline.setOnFinished(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent ev) {
				setDoneWalking(true);
			}
		});

	}

	public Polygon getHlArm() {
		return hlArm;
	}

	public void setHlArm(Polygon hlArm) {
		this.hlArm = hlArm;
	}

	public Polygon getHrArm() {
		return hrArm;
	}

	public void setHrArm(Polygon hrArm) {
		this.hrArm = hrArm;
	}

	public Polygon getLlArm() {
		return llArm;
	}

	public void setLlArm(Polygon llArm) {
		this.llArm = llArm;
	}

	public Polygon getLrArm() {
		return lrArm;
	}

	public void setLrArm(Polygon lrArm) {
		this.lrArm = lrArm;
	}

	public Polygon getHhlLeg() {
		return hhlLeg;
	}

	public void setHhlLeg(Polygon hhlLeg) {
		this.hhlLeg = hhlLeg;
	}

	public Polygon getHhrLeg() {
		return hhrLeg;
	}

	public void setHhrLeg(Polygon hhrLeg) {
		this.hhrLeg = hhrLeg;
	}

	public Polygon getHlLeg() {
		return hlLeg;
	}

	public void setHlLeg(Polygon hlLeg) {
		this.hlLeg = hlLeg;
	}

	public Polygon getHrLeg() {
		return hrLeg;
	}

	public void setHrLeg(Polygon hrLeg) {
		this.hrLeg = hrLeg;
	}

	public Polygon getLlLeg() {
		return llLeg;
	}

	public void setLlLeg(Polygon llLeg) {
		this.llLeg = llLeg;
	}

	public Polygon getLrLeg() {
		return lrLeg;
	}

	public void setLrLeg(Polygon lrLeg) {
		this.lrLeg = lrLeg;
	}

	public Rectangle getLeftHand() {
		return leftHand;
	}

	public void setLeftHand(Rectangle leftHand) {
		this.leftHand = leftHand;
	}

	public Polygon getRightHand() {
		return rightHand;
	}

	public void setRightHand(Polygon rightHand) {
		this.rightHand = rightHand;
	}

	public Polygon getLeftFoot() {
		return leftFoot;
	}

	public void setLeftFoot(Polygon leftFoot) {
		this.leftFoot = leftFoot;
	}

	public Polygon getRightFoot() {
		return rightFoot;
	}

	public void setRightFoot(Polygon rightFoot) {
		this.rightFoot = rightFoot;
	}

	public Polygon getUnderwear() {
		return underwear;
	}

	public void setUnderwear(Polygon underwear) {
		this.underwear = underwear;
	}

	public void setHead(Circle head) {
		this.head = head;
	}

	public Circle getHead() {
		return head;
	}

	public void setHead(Circle head, Paint tertiaryColor) {
		head.setStrokeWidth(1);
		head.setFill(tertiaryColor);
		this.head = head;
	}

	public Rectangle getNeck() {
		return neck;
	}

	public void setNeck(Rectangle neck) {
		this.neck = neck;
	}

	public Polygon getBody() {
		return body;
	}

	public void setBody(Polygon body) {

		this.body = body;
	}

	public boolean isDoneWalking() {
		return isDoneWalking;
	}

	public void setDoneWalking(boolean isDoneWalking) {
		this.isDoneWalking = isDoneWalking;
	}

	public int getWalkDirectionNum() {
		return walkDirectionNum;
	}

	public void setWalkDirectionNum(int walkDirectionNum) {
		this.walkDirectionNum = walkDirectionNum;
	}

	public int getWalkFromX() {
		return walkFromX;
	}

	public void setWalkFromX(int walkFromX) {
		this.walkFromX = walkFromX;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStrokeWidth() {
		return strokeWidth;
	}

	public void setStrokeWidth(int strokeWidth) {
		this.strokeWidth = strokeWidth;
	}

	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}

	public int getWalkDistance() {
		return walkDistance;
	}

	public void setWalkDistance(int walkDistance) {
		this.walkDistance = walkDistance;
	}

	public Rectangle getHitBox() {
		return hitBox;
	}

	public void setHitBox(Rectangle hitBox) {
		this.hitBox = hitBox;
	}

	public ImageView getFace() {
		return face;
	}

	public void setFace(ImageView face) {
		this.face = face;
	}

	public boolean isDucking() {
		return isDucking;
	}

	public void setDucking(boolean isDucking) {
		this.isDucking = isDucking;
	}

	public boolean isWalk() {
		return walk;
	}

	public void setWalk(boolean walk) {
		this.walk = walk;
	}

	public Polygon getCape() {
		return cape;
	}

	public void setCape(Polygon cape) {
		this.cape = cape;
	}

	public ImageView getSymbol() {
		return symbol;
	}

	public void setSymbol(ImageView symbol) {
		this.symbol = symbol;
	}

	public boolean isExecuteQueue() {
		return executeQueue;
	}

	public void setExecuteQueue(boolean executeQueue) {
		this.executeQueue = executeQueue;
	}

	public void createCharacter(int speed, int strokeWidth, int player,
			Paint primaryColor, Paint secondaryColor, Paint tertiaryColor,
			Image symbolImage, Image faceImage) {
		setSpeed(speed);
		setStrokeWidth(strokeWidth);
		setPlayer(player);

		Polygon body;

//		if (getPlayer() == 1) {
//			body = new Polygon(105, 350, 195, 350, 150, 440);
//		} else {
//			body = new Polygon(410, 350, 490, 350, 450, 420);
//		}

//		body.setStroke(Color.BLACK);
//		body.setFill(primaryColor);
	
		
		
		setBody(new Polygon(105, 350 - 20, 195, 350- 20, 150, 440- 20));
		
		getBody().setStroke(Color.BLACK);
		getBody().setFill(primaryColor);

		
		
		setSymbol(new ImageView(symbolImage));
		getSymbol().setX(115);
		getSymbol().setY(350- 20);

		
		setNeck(new Rectangle(130, 335- 20, 40, 15));
		getNeck().setStroke(Color.BLACK);
		getNeck().setFill(tertiaryColor);

		setHlArm(new Polygon(105, 350- 20, 85, 390- 20, 102.5, 397- 20, 117, 375- 20));

		getHlArm().setStroke(Color.BLACK);
		getHlArm().setFill(primaryColor);

		setHrArm(new Polygon(195, 350- 20, 215, 390- 20, 197.5, 397- 20, 183, 375- 20));

		getHrArm().setStroke(Color.BLACK);
		getHrArm().setFill(primaryColor);

		setLlArm(new Polygon(89.5, 382- 20, 125, 395- 20, 117, 413- 20, 80.5, 400- 20));

		getLlArm().setStroke(Color.BLACK);
		getLlArm().setFill(primaryColor);
	
		
		setLrArm(new Polygon(210.5, 382- 20, 175, 395- 20, 183, 413- 20, 219.5, 400- 20));

		getLrArm().setStroke(Color.BLACK);
		getLrArm().setFill(primaryColor);
	
		setHhlLeg(new Polygon(150, 440- 20,  120, 440 -20, 135, 410- 20));

		getHhlLeg().setStroke(Color.BLACK);
		getHhlLeg().setFill(primaryColor);
		
		setHhrLeg(new Polygon(150, 440- 20,  180, 440 -20, 165, 410- 20));

		getHhrLeg().setStroke(Color.BLACK);
		getHhrLeg().setFill(primaryColor);
		
		
		setUnderwear(new Polygon(135, 410- 20, 165, 410- 20, 150, 440- 20));

		getUnderwear().setStroke(Color.BLACK);
		getUnderwear().setFill(secondaryColor);
		
		setCape(new Polygon(105, 350- 20, 85, 460- 20, 215, 460- 20, 195, 350- 20));
		
		getCape().setStroke(Color.BLACK);
	
		getCape().setFill(secondaryColor);	
		
		setFace(new ImageView(faceImage));

		getFace().setX(117);
		getFace().setY(295- 20);

		setHead(new Circle(150, 315- 20, 30));
		getHead().setStroke(Color.BLACK);
		getHead().setFill(tertiaryColor);

		
		
		System.out.println(getBody().getPoints().get(1));

		// setLeftArm(new Line(body.getStartX(), body.getStartY() + 15,
		// body.getStartX() - 15, body.getEndY() - 15));
		// getLeftArm().setStroke(primaryColor);
		// setRightArm(new Line(body.getStartX(), body.getStartY() + 15,
		// body.getStartX() + 15, body.getEndY() - 15));
		// getRightArm().setStroke(primaryColor);
		// setLeftLeg(new Line(body.getStartX(), body.getEndY(),
		// body.getStartX() - 15, body.getEndY() + 50));
		// getLeftLeg().setStroke(primaryColor);
		// setRightLeg(new Line(body.getStartX(), body.getEndY(),
		// body.getStartX() + 15, body.getEndY() + 50));
		// getRightLeg().setStroke(primaryColor);
		// setHitBox(new Rectangle(body.getStartX() - 30,
		// ((body.getStartY() + body.getEndY()) / 2) - 90, 60, 170));
		// setHead(new Circle(body.getStartX(), body.getStartY() - 27,
		// 27),tertiaryColor);

		// getHitBox().setVisible(true);
		// getHitBox().setFill(null);
		// getHitBox().setStroke(Color.BLACK);
		// setDucking(false);
		// setDoneWalking(true);

		Arena.setQueue(new ArrayBlockingQueue<String>(20));

	}

	public void executeP1Action(KeyCode code) {

		if (code.equals(KeyCode.D)) {
			// Arena.getQueue().add("right");
			walk("right");
		} else if (code.equals(KeyCode.A)) {
			// Arena.getQueue().add("left");
			walk("left");
		} else if (code.equals(KeyCode.S) && !isDucking()) {
			duck(true);
		} else if (code.equals(KeyCode.W)) {
			jump();
		} else if (code.equals(KeyCode.SHIFT)) {
			attack();
		}

		// System.out.println(Arena.getQueue().size());
		setExecuteQueue(true);
		Arena.runUseQueue();

	}

	public void executeP2Action(KeyCode code) {

		if (code.equals(KeyCode.RIGHT))
			// Arena.getQueue().add("right");
			walk("right");
		else if (code.equals(KeyCode.LEFT))
			walk("left");
		// Arena.getQueue().add("left");
		else if (code.equals(KeyCode.DOWN) && !isDucking())
			duck(true);
		else if (code.equals(KeyCode.UP))
			jump();

		if (code.equals(KeyCode.ALT))
			attack();

		// System.out.println(Arena.getQueue().size());
		setExecuteQueue(true);
		Arena.runUseQueue();
	}

	public void useQueue() {
		for (String action : Arena.getQueue()) {
			walk(action);
			System.out.println(this.getClass());
		}
		Arena.getQueue().clear();
	}

}
