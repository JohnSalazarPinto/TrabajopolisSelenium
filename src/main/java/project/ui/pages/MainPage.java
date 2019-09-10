package project.ui.pages;

import core.selenium.TrabajopolisConfig;
import core.utils.TrabajopolisUtils;
import org.openqa.selenium.By;

public class MainPage extends TrabajopolisUtils {

    /**
     * This method works for fill data.
     *
     * @param key - Data that will be fill.
     */
    public void sendKeyWord(final String key) {
        sendKey(By.id("keywords"), key);
    }

    /**
     * This method makes click action.
     */
    public void search() {
        click(By.id("btnSearch"));
    }
}
