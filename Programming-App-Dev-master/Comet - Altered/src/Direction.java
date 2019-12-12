public enum Direction
{
	NORTH (0, -2),
	SOUTH (0, 3),
	EAST  (1, 0),
	WEST  (-2, 0);
	
	int x;
	int y;
	Direction(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}