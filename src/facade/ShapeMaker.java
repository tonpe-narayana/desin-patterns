package facade;

public class ShapeMaker {
	private Rectangle rectangle;
	private Circle circle;
	private Square square;
	
	public ShapeMaker()
	{
		rectangle = new Rectangle();
		circle = new Circle();
		square = new Square();
	}
	public void drawRectangle()
	{
		rectangle.draw();
	}
	public void drawCircle()
	{
		circle.draw();
	}public void drawSquare()
	{
		square.draw();
	}

}
