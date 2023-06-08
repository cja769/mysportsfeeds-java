package com.mysportsfeed.client.exception;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FeedContentNotFoundException extends MySportsFeedException {
    public FeedContentNotFoundException(HttpRequest request, HttpResponse<?> response, String message) {
        super(request, response, message);
    }
}
