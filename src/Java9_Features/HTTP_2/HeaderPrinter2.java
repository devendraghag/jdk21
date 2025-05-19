package Java9_Features.HTTP_2;

import java.net.URI;
import java.net.http.*;

public class HeaderPrinter2 {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://http2.golang.org/reqinfo"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Protocol Version: " + response.version());
        System.out.println("Headers:");
        response.headers().map().forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
