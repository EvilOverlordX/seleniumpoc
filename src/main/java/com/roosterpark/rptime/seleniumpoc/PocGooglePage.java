package com.roosterpark.rptime.seleniumpoc;

/**
 * User: John
 * Date: 10/15/13
 * Time: 10:41 AM
 */
public class PocGooglePage {

    private static final String ADDRESS = "http://www.google.com";
    private static final String TEXT_AREA_ELEMENT = "gbqfq";
    private static final String SUBMIT_BUTTON_ELEMENT = "gbqfb";

    public String getAddress() {
        return ADDRESS;
    }

    public String getTextAreaElement() {
        return TEXT_AREA_ELEMENT;
    }

    public String getSubmitButtonElement() {
        return SUBMIT_BUTTON_ELEMENT;
    }

}
