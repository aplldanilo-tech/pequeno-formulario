# Code Citations

## License: MIT
https://github.com/edufolly/zuhause-api/tree/0f1cff9729d5e095d3750e0840dbaff0bf77b633/src/zuhause/router/intelbras/WRN240.java

```
();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }
            return response.body().string();
        }
```

