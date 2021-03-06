package ie.dit;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class TuneBook{
	ArrayList<Tune> tunes = new ArrayList<Tune>();

	public TuneBook(String filename)
	{
		BufferedReader inputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader(filename));
            
            String l;
            while ((l = inputStream.readLine()) != null) {
            	//Tune t = new Tune(x, title, altTitle, notation);
                tunes.add(l);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } 
        finally 
        {
            if (inputStream != null) {
                try
                {
                    inputStream.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
	}

	public Tune findTune(String title)
	{
		for(Tune t:tunes)
		{
			if(title == t.title)
			{
				return t.title;
			}
		}
	}
		
	public static void main(String[] args)
    {
        TuneBook tb = new TuneBook("hnj0.abc");
        System.out.println(tb);

        Tune t = tb.findTune("Scotsman over the Border");
        t.play();
    }
}