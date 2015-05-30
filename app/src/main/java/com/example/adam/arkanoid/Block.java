package com.example.adam.arkanoid;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

import java.util.Random;

/**
 * Created by Adam on 2015-05-28.
 */
public class Block
{
    public Paint paint;
    public Rect rectCoordinates;
    private String[] colors = {"RED", "BLUE", "CYAN", "GREEN","MAGENTA"};

    public Block(int x, int y, int width, int height)
    {
        Random rand = new Random();
        int randomNumb = rand.nextInt(((colors.length-1) - 0) + 1) + 0;
        rectCoordinates = new Rect(x, y, x + width, y + height);
        paint = new Paint();
        //paint.setColor(Color.MAGENTA);
        paint.setColor(Color.parseColor(colors[randomNumb]));

    }

    public void paintBrick(Canvas canvas)
    {
        canvas.drawRect(rectCoordinates, paint);
    }
}
