package co.com.staging.zapatoca.miaguila.utils;

public enum ErrorMessages {
    RESOURCE_NOT_FOUND_ERROR("Required resource not found"),
    UNEXPECTED_MESSAGE_ERROR("The message is not present");

    private final String message;

    ErrorMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
