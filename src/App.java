import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;


public class App {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("name");
        Gson gson = new Gson();
        String json1 = gson.toJson(list);
        String json2 = gson.toJson(list,ArrayList.class);
        System.out.println("json serialization of list: " + json2);
        
    }
}