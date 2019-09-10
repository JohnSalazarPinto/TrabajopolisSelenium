package project.ui.pages;

import core.utils.TrabajopolisUtils;
import org.openqa.selenium.By;

public class Jobs extends TrabajopolisUtils {

    /**
     * This method get the result for assert.
     *
     * @return value - Value for the assertion.
     */
    public String searchInfo(final String name) {
        String value = value(By.className(name));
        return value;
    }
}
