
import java.awt.Color;
import java.awt.Graphics;

public class Paddle
{

	public int paddleNumber;

	public int x, y, width = 20, height = 150;

	public int score;

	public Paddle(Pong pong, int paddleNumber)
	{
		this.paddleNumber = paddleNumber;

		if (paddleNumber == 1)
		{
			this.x = 0;
		}

		if (paddleNumber == 2)
		{
			this.x = pong.width - width;
		}

		this.y = pong.height / 2 - this.height / 2;
	}

	public void render(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillRect(x, y, width, height);
	}

	public void move(boolean up)
	{
		int speed = 30;

		if (up)
		{
			if (y - speed > 0)
			{
				y -= speed;
			}
			else
			{
				y = 0;
			}
		}
		else
		{
			if (y + height + speed < Pong.pong.height)
			{
				y += speed;
			}
			else
			{
				y = Pong.pong.height - height;
			}
		}
	}

}