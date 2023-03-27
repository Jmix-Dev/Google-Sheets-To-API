import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

public class Request {

    RestTemplate restTemplate = new RestTemplate();

  static  HttpHeaders headers = new HttpHeaders();

    String baseUrl = "https://core.qyre.io/api/cvs/productions";

    static HttpRequest requests;

    String accept = "application/json, text/plain, */*, application/vnd.qyre-v1+json";

    String authorization;

    public void createCvProduction(@RequestBody ProductionModel productionModel) {

        restTemplate.postForObject(baseUrl, productionModel, ProductionModel.class);

       // HttpHeaders.ACCEPT( = "application/json, text/plain, */*, application/vnd.qyre-v1+json");

    }
}
