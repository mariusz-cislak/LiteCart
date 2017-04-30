package org.tests.enums;

/**
 * Created by Mariusz Ciślak on 30.04.2017 17:49 in IntelliJ IDEA.
 */

public enum PageElementsEnums {
    PAGE_TITLE ("My Store | Online Store");


    private final String text;
    private PageElementsEnums(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}

