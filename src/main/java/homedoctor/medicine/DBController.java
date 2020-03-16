package homedoctor.medicine;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBController {

    @SuppressWarnings(("unchecked"))
    public static void loadJson() throws Exception {
        try {


        } catch (Exception e) {
            e.printStackTrace();

            System.err.println(e.getMessage());
        }


    }
    public static void saveDataInMysql() {
        try {
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/medicine?serverTimezone=UTC&characterEncoding=UTF-8";
            Connection conn = DriverManager.getConnection(myUrl, "root", "asd62351");
            Charset charset = StandardCharsets.UTF_8;
            Reader reader = Files.newBufferedReader(Paths.get("/Users/hongnadan/home-doctor/medicine/src/main/java/homedoctor/medicine/medical_rev03.json"), charset);

            // create parser
            Gson gson = new Gson();
            JsonObject object = gson.fromJson(reader,  JsonObject.class);
            JsonArray datajson = object.getAsJsonArray("data");
            for (Object jsonElement : datajson) {
                JsonObject jsonObject = (JsonObject) jsonElement;
                JsonElement item_code = jsonObject.get("item_code");
                JsonElement medicine_name = jsonObject.get("medicine_name");
                JsonElement effect = jsonObject.get("effect");
                JsonElement save_method = jsonObject.get("save_method");
                JsonElement valid_date = jsonObject.get("valid_date");
                JsonElement dosage = jsonObject.get("dosage");
                JsonElement bad_effect = jsonObject.get("bad_effect");

                String query = "insert into medicine (medicine_name, effect, save_method, valid_date, dosage, bad_effect) values (?, ?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = conn.prepareStatement(query);
                preparedStatement.setString(1, String.valueOf(medicine_name));
                preparedStatement.setString(2, String.valueOf(effect));
                preparedStatement.setString(3, String.valueOf(save_method));
                preparedStatement.setString(4, String.valueOf(valid_date));
                preparedStatement.setString(5, String.valueOf(dosage));
                preparedStatement.setString(6, String.valueOf(bad_effect));
                preparedStatement.execute();
                System.out.println(item_code + " : " + medicine_name + " : " + effect +
                        " : " + save_method + " : " + valid_date + " : " + dosage + " : " +
                        " : " + bad_effect);
            }


        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Got an exception");
            System.err.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws Exception {
        loadJson();
        saveDataInMysql();
    }
}
