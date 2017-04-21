package kata6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class MailListReader {
     
    public static ArrayList<Person> readFromFile(String name) throws FileNotFoundException, IOException {            
        ArrayList<Person> mlList = new ArrayList<>();
        BufferedReader fileRead = new BufferedReader(new FileReader(new File(name)));
        int id = 0;
        String ml;
        while((ml = fileRead.readLine())!= null) 
            if(ml.contains("@")) {
            	mlList.add(new Person(id++, ml));
            }
                
        return mlList;
    }    
}
