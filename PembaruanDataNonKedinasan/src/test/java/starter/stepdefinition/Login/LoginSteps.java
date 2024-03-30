package starter.stepdefinition.Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import starter.pages.Auth.Login.LoginPage;
import starter.pages.Dashboard.DashboardPage;

public class LoginSteps extends PageObject {

    @Steps
    LoginPage loginPage;

    @Steps
    DashboardPage dashboardPage;

    @Given("user berada di halaman login")
    public void userBeradaDiHalamanLogin(){
        loginPage.openUrl("https://diarium-beta.telkom.co.id/login");
        loginPage.validateOnTheLoginPage();
    }

    @When("user memasukan NIK")
    public void InputNIK(){
        loginPage.EnterNIK("anon");
    }
    @And("user memasukan password")
    public void InputPassword(){
        loginPage.EnterPassword("anon");
    }
    @And("user click sign button")
    public void clickSignButton(){
        loginPage.clickSignButton();
    }
    @Then("user diarahkan ke dashboard page")
    public void diarahkanKeDashboardPage(){
        dashboardPage.validateOnTheDashboardPage();
    }
}
