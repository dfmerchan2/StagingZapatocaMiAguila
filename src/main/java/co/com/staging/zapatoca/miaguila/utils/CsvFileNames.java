package co.com.staging.zapatoca.miaguila.utils;

public enum CsvFileNames {

    USER("user");

    private final String value;

    CsvFileNames(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
