import java.io.*;
import java.util.*;

public class Application 
{
   
	public static void main(String[] args)
		{
			DuplicateCounter duplicateCounter = new DuplicateCounter();
			duplicateCounter.count("problem1.txt");
			duplicateCounter.write("unique_word_counts.txt");
		}
}
