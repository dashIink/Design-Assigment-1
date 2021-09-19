import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Database {
    ArrayList<String> items = new ArrayList<String>();
    ArrayList<Integer> prices = new ArrayList<Integer>();
    public Database(){
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("src\\database.txt"));
            String line = br.readLine();

            int x;
            while (line != null) {
                items.add(line);
                line = br.readLine();
                x = Integer.parseInt(line);
                prices.add(x);
                line = br.readLine();
           }
            br.close();
        }
        catch(Exception e) {
            System.out.println("No file for the Database found");
        }

    }

    public int getPrice(String name){
        int x = items.indexOf(name);
        return prices.get(x);
    }


}
