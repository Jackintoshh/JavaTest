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
            
            //String l;
            while ((l = inputStream.readLine()) != null) {
            	Tune t = new Tune();
                tunes.add(t);
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
		
			
}