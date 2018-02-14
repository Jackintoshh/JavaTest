package ie.dit;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Tune implements Player{
	private int x;
	private String title, altTitle, notation;

	public Tune(int x, String title, String altTitle, String notation)
	{
		this.x = x;
		this.title = title;
		this.altTitle = altTitle;
		this.notation = notation;
	}

	public String toString()
    {
        StringBuffer sb = new StringBuffer();
        
        sb.append(x + ", " + title + ", " + altTitle);

        return sb.toString();

    }
}