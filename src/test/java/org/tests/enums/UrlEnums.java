package org.tests.enums;

/**
 * Created by Mariusz Ciślak on 03.05.2017 14:53 in IntelliJ IDEA.
 */
public enum UrlEnums {
    USER_LOGIN_PAGE_URL ("http://127.0.0.1:8080/litecart/en/"),
    ADMIN_LOGIN_PAGE_URL ("http://127.0.0.1:8080/litecart/admin/login.php");

    private final String text;
    UrlEnums(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
