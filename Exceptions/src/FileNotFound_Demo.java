// Author 			: Oisin Cawley
// Date 			: Jan-2017
// Purpose 			: An example checked exception

import java.io.File;
import java.io.FileReader;

public class FileNotFound_Demo {

	public static void main(String args[]) 
   	{		
    	File file = new File("E://file.txt");
		FileReader fr = new FileReader(file); 
   	}
}


