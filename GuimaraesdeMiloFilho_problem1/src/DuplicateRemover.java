import java.io.*;
import java.util.*;

public class DuplicateRemover {

		private Set<String> uniqueWords;

		public DuplicateRemover()
		{

			uniqueWords = new HashSet<>();
		}

		public void remove(String dataFile)
		{


			//try to open the file
			try
			{
				uniqueWords = new LinkedHashSet<>(); 
				Scanner x = new Scanner(new File(dataFile));

				while (x.hasNext())
				{
					
	                String words = x.nextLine();
	                //String[] words = line.split(" ");
	                for(int i=0;i<words.length();i++) {
	                	//converting into lower case
	                    String str=words.toLowerCase(); 
	                    uniqueWords.add(str);
	                }
					uniqueWords.add(x.next());
	            }
				
	            x.close();
	            
	        }
			
			//if it not works, the exception is going to be printed 
			//Exception e, represents all the exceptions
			catch (Exception e)
			{
	           System.out.println(e);
	        }

	    }

	    public void write(String outputFile)
	    {
	    	try
	    	{
	    		PrintWriter pt = new PrintWriter(new File(outputFile));

	            for (String string : uniqueWords)
	            {

	            	pt.println(string);
	            }
	            
	            pt.flush();
	            pt.close();
	        }
	    	
	    	catch (Exception e)
	    	{
	           System.out.println(e);
	        }
	    }
	   
	}
