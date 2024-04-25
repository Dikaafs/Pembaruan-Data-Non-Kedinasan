package starter.stepdefinition.DataPribadi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.DataPribadiPage;

public class createNewData {
    @Steps
    DataPribadiPage dataPribadiPage;

    @And("user click submit")
    public void ClickSubmit(){
        dataPribadiPage.clickSubmit();
    }
    @Then("status progress berubah menjadi diproses")
    public void StatusProses(){
        dataPribadiPage.ValidateProsesPembaruan();
    }

}
