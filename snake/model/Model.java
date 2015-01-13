package snake.model;

public class Model {

	protected int x;
	protected int y;

	private Apple apple;
	private Snake snake;
	private Track track;

	public Model() {
		track = new Track();
		snake = new Snake(this);
		apple = new Apple(this);

	}
	
	public void setTrack(Track track) {
		this.track = track;
	}

	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}

	public Track getTrack() {
		return track;
	}

	public Snake getSnake() {
		return snake;
	}

	public void setSnake(Snake snake) {
		this.snake = snake;
	}

	public void move(){
		snake.move();
	}

	public void requestNewDirection(Direction newD) {
		// TODO Auto-generated method stub
		snake.changeDirection(newD);
	}
}
