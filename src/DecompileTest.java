import java.util.ArrayList;

import java.util.List;

import com.google.gson.Gson;

public class DecompileTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("name");
        Gson gson = new Gson();
        String json1 = gson.toJson(list); // Add a breakpoint at this line, and step into
        String json2 = gson.toJson(list, ArrayList.class);
        System.out.println("json serialization: " + json2);

    }

}