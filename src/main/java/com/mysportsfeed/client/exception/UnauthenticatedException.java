package com.mysportsfeed.client.exception;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class UnauthenticatedException extends MySportsFeedException {
    public UnauthenticatedException(HttpRequest request, HttpResponse<?> response, String message) {
        super(request, response, message);
    }
}
