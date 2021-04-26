package com.pluralsight.order.util;

import java.sql.SQLException;
import java.text.MessageFormat;

/**
 * Utility class to handle exceptions
 */
public class ExceptionHandler {

    /**
     * Method to extract and print information from a SQLException
     * @param sqlException Exception from which information will be extracted
     */
    public static void handleException(SQLException sqlException) {
        System.out.println(MessageFormat.format("Error Code: {0}", sqlException.getErrorCode()));
        System.out.println(MessageFormat.format("SQL State: {0}", sqlException.getSQLState()));
        System.out.println(MessageFormat.format("Message: {0}", sqlException.getMessage()));
        System.out.println("Stack trace:");
        sqlException.printStackTrace();
    }
}
