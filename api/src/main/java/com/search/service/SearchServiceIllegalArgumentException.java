package com.search.service;

public class SearchServiceIllegalArgumentException extends SearchServiceException {

    public SearchServiceIllegalArgumentException(final String message) {
        super(message);
    }

    public SearchServiceIllegalArgumentException(Throwable cause) {
        super(cause);
    }
}
