package Java9_Features.HTTP_2;

import java.net.URI;
import java.net.http.*;
import java.util.concurrent.*;

public class AsyncFetcher2 {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://http2.golang.org/reqinfo"))
                .GET()
                .build();

        CompletableFuture<HttpResponse<String>> future = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());

        future.thenAccept(response -> {
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response Body:\n" + response.body());
        });

        // Wait for the async call to complete
        future.join();
    }
}
