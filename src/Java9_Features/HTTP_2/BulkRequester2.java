package Java9_Features.HTTP_2;

import java.net.URI;
import java.net.http.*;
import java.util.List;
import java.util.concurrent.*;

public class BulkRequester2 {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();

        List<String> urls = List.of(
                "https://http2.golang.org/reqinfo",
                "https://httpbin.org/get",
                "https://jsonplaceholder.typicode.com/posts/1"
        );

        List<CompletableFuture<Void>> futures = urls.stream()
                .map(url -> {
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create(url))
                            .GET()
                            .build();
                    return client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                            .thenAccept(response -> {
                                System.out.println("[" + url + "] Status: " + response.statusCode());
                                System.out.println(response.body().substring(0, Math.min(100, response.body().length())) + "\n");
                            });
                }).toList();

        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();
    }
}
