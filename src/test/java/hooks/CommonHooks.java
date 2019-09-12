package hooks;


import cucumber.api.java.After;
import io.cucumber.java.Before;

public class CommonHooks {

    @Before("@Hello")
    public void hello() {
        System.out.println("helloooooo");
    }

    /**
     * Deletes created Case after scenarios.
     */
    @After(value = "@CaseCreation")
    public void deleteCaseAfterCreation() {
        System.out.println("johnjohnojohnljohn");
    }
}
