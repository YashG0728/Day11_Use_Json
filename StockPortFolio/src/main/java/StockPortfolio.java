import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StockPortfolio {
    public static void main(String[] args) throws IOException, JSONException {
        String data = new String(Files.readAllBytes(Paths.get("./StockPortfolio.json")));

        JSONArray jsonArray = new JSONArray(data);
        for (int i = 0; i < jsonArray.length(); i++) {

            JSONObject object = jsonArray.getJSONObject(i);

            String str = jsonArray.get(i).toString();
            JSONObject object1 = new JSONObject(str);

            String name = object1.getString("name");
            int numOfShares = object1.getInt("numOfShares");
            int priceOfShare = object1.getInt("priceOfShare");

            System.out.println("Name : " + name);
            System.out.println("numOfShares : " + numOfShares);
            System.out.println("priceOfShare : " + priceOfShare);

        }
    }
}

