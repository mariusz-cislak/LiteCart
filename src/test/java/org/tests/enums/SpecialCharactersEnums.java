package org.tests.enums;

/**
 * Created by Mariusz Ciślak on 03.05.2017 14:53 in IntelliJ IDEA.
 */
public enum SpecialCharactersEnums {
    EMOJI ("✨⚡☀⛅☺⛄❄☔");


    private final String text;
    SpecialCharactersEnums(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
