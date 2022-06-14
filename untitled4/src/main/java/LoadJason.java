import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LoadJason {

    private String dataset;
    public LoadJason() throws IOException {
        dataset = new String(Files.readAllBytes(Paths.get("C:\\Users\\jorge\\IdeaProjects\\untitled4\\src\\main\\resources\\movies.json")));
    }

    public String getDataset() {
        return dataset;
    }

    public void setDataset(String dataset) {
        this.dataset = dataset;
    }
}
