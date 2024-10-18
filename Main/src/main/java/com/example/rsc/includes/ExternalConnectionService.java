package com.example.rsc.includes;

import org.springframework.web.client.RestTemplate;

public interface ExternalConnectionService {
    String getExternalServiceUrl();

    default RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    default String getExternalServiceUrl(String path) {
        String base = getExternalServiceUrl();
        if (!base.endsWith("/")) {
            base += "/";
        }

        return base + path;
    }

    default <T> T getExternalObject(String path, Class<T> responseType) {
        return getRestTemplate().getForObject(getExternalServiceUrl(path), responseType);
    }

    default <T> T postExternalObject(String path, Object request, Class<T> responseType) {
        return getRestTemplate().postForObject(getExternalServiceUrl(path), request, responseType);
    }

    default void putExternalObject(String path, Object request) {
        getRestTemplate().put(getExternalServiceUrl(path), request);
    }

    default void deleteExternalObject(String path) {
        getRestTemplate().delete(getExternalServiceUrl(path));
    }
}
