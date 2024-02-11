package SimpleFactory;

public class WoddenDoor implements Door{

	protected float height;
	protected float width;

	public WoddenDoor(float height, float width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public float getWidth() {
		return width;
	}

	@Override
	public float getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "WoddenDoor [height=" + height + ", width=" + width + "]";
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setWidth(float width) {
		this.width = width;
	}

}
