import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class ParserJson {
    private ArrayList<Movie> movies = new ArrayList<>();
    Movie movietemp;
    public ParserJson(){
    }

    public ArrayList<Movie> parserAll(JSONArray s){
        JSONObject object;


        for(int i = 0; i < s.length(); i++){
            // parse in json object
            String str = movies.get(i).toString();
            object = new JSONObject(str);
            movies.add(parseMovie(object));
        }
        return movies;
    }
    private Movie parseMovie(JSONObject obj){
        movietemp.setTitle((String) obj.get("Title"));
        movietemp.setDirector((String) obj.get("Director"));
        movietemp.setBudget((double) obj.get("Production Budget"));
        movietemp.setBudget((double) obj.get("IMDB Rating"));
        movietemp.setBudget((int) obj.get("IMDB Votes"));

        return movietemp;
    }

}
