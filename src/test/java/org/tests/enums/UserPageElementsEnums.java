package org.tests.enums;

/**
 * Created by Mariusz Ciślak on 30.04.2017 17:49 in IntelliJ IDEA.
 */

public enum UserPageElementsEnums {
    PAGE_TITLE ("My Store | Online Store"),
    CONTENT_LEFT_CATEGORIES ("Categories"),
    CONTENT_LEFT_RECENT ("Recently Viewed"),
    CONTENT_LEFT_SIGN_IN ("Sign In"),
    CONTENT_LEFT_NEW_CUSTOMER_LINK ("New customers click here"),
    SEARCH_PLACEHOLDER ("Search products …"),
    EMAIL_PLACEHOLDER ("Email Address"),
    PASSWORD_PLACEHOLDER ("Password"),
    LOGIN_ALERT_SUCCESS ("div[class = 'alert alert-success']");

    private final String text;
    UserPageElementsEnums(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}

