import org.json.JSONArray;

import java.io.IOException;
import java.util.ArrayList;

public class ProcessData {

    public static void main(String[] args) throws IOException {

        LoadJason data = new LoadJason();
        ArrayList<Movie> listMovie = new ArrayList<>();

        // Lê um array do Json
        JSONArray movies = new JSONArray(data.getDataset());
        ParserJson temp = new ParserJson();
        listMovie = temp.parserAll(movies);

        for (Movie lm : listMovie) {
            System.out.println("Titulo: "+ lm.getTitle());
            System.out.println("Diretor: "+ lm.getDirector());
            System.out.println("Total gasto:" + lm.getBudget());
        }
    }

}
