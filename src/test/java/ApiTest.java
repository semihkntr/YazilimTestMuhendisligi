import io.restassured.RestAssured;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ApiTest {

    // --- 1. TEST: Veri Çekme (GET) ---
    @Test
    public void getRequestTest() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        System.out.println("--- GET Testi Başlıyor ---");

        given()
                .header("Content-Type", "application/json")
                .when()
                .get("/todos/1")
                .then()
                .statusCode(200)
                .time(lessThan(5000L))
                .body("id", equalTo(1))
                .log().all(); // Konsola yazdır
    }

    // --- 2. TEST: Veri Gönderme (POST) ---
    @Test
    public void postRequestTest() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // Göndereceğimiz JSON verisi (Request Body)
        String yeniVeri = "{\n" +
                "  \"title\": \"Test Odevi\",\n" +
                "  \"body\": \"Rest Assured ile otomasyon\",\n" +
                "  \"userId\": 1\n" +
                "}";

        System.out.println("--- POST Testi Başlıyor ---");

        given()
                .header("Content-Type", "application/json")
                .body(yeniVeri) // Veriyi paketin içine koyuyoruz
                .when()
                .post("/posts") // /posts adresine gönderiyoruz
                .then()
                .statusCode(201) // DİKKAT: Yeni kayıt başarılıysa kod 201 (Created) döner
                .time(lessThan(5000L)) // 5 saniyeden kısa sürsün
                .body("title", equalTo("Test Odevi")) // Gönderdiğimiz başlık doğru gitmiş mi?
                .body("id", notNullValue()) // Bize yeni bir ID vermiş mi?
                .log().all();
    }
}


