import java.io.*;
import java.util.*;


public class DuplicateCounter {
  
	private Integer wordCounter;
	private Map<String, Integer> map;
  
	public DuplicateCounter()
	{
		this.wordCounter = 0;
		this.map = new HashMap<>();
	}
  
	public void count(String dataFile)
	{

		Scanner fileReader;
		try
		{
			fileReader = new Scanner(new File(dataFile));
			while(fileReader.hasNextLine())
			{
				String line = fileReader.nextLine();
				String[] data = line.split("[\\W]+");
				for(String word : data)
				{
					this.wordCounter = map.get(word);
					this.wordCounter = (this.wordCounter == null) ? 1 : ++this.wordCounter;
					map.put(word, this.wordCounter);
				}
			}
			
			fileReader.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.exit(1);
		}
	}
  
	public void write(String outputFile)
	{
		FileWriter Writer;
		PrintWriter Print;
		
		try 
		{
			Writer = new FileWriter(new File(outputFile));
			Print = new PrintWriter(Writer);
			
			for(Map.Entry<String, Integer> entry : map.entrySet())
			{
				Print.write(entry.getKey() + " " + entry.getValue() + "\n");
			}
			System.out.println("Map data written to file: " + outputFile);

			Writer.close();
			Print.close();
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}