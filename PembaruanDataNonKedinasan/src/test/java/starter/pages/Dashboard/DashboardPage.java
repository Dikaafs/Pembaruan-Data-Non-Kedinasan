package starter.pages.Dashboard;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DashboardPage extends PageObject {
    private By Dashboard(){
        return By.xpath("/html/body/div[4]/div/div[1]/div/div/div[2]/div/div[3]/div");
    }
    private By WelcomePopUP(){
        return By.xpath("/html/body/div[4]/div/div[1]/div/div/div[2]/div/div[3]/small");
    }
    private By Myprofile(){
        return By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/ul/li[2]/a/span");
    }

    @Step
    public boolean validateOnTheDashboardPage(){
        waitForCondition();
        return $(Dashboard()).isDisplayed();
    }
    @Step
    public void clickPopUp(){
        $(WelcomePopUP()).click();
    }
    @Step
    public void clickMyProfile(){
        waitForCondition();
        $(Myprofile()).click();
    }
}
