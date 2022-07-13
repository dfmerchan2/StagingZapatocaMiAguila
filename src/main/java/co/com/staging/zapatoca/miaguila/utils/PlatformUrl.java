package co.com.staging.zapatoca.miaguila.utils;

public enum PlatformUrl {
    DOMICILE_ZAPATOCA("https://staging-zapatoca.miaguila.com/login");

    private final String url;

    PlatformUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
