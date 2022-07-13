package co.com.staging.zapatoca.miaguila.utils;

import co.com.staging.zapatoca.miaguila.models.User;

import java.io.IOException;

import static co.com.staging.zapatoca.miaguila.utils.CsvFileNames.USER;
import static co.com.staging.zapatoca.miaguila.utils.ErrorMessages.RESOURCE_NOT_FOUND_ERROR;

public class GetTestData {

    public static User getUserData(String filter) throws IOException {
        User user;
        try {
            user = User.getUser(CsvUtilities.getDataTest(USER.getValue(), filter)).get(0);
        } catch (IOException e) {
            throw new IOException(RESOURCE_NOT_FOUND_ERROR.getMessage(), e);
        }
        return user;
    }

    private GetTestData() {
    }
}
