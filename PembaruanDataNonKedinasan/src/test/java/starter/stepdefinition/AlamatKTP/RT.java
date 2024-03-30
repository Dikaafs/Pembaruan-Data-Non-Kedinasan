package starter.stepdefinition.AlamatKTP;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.AlamatKTPPage;

public class RT {

    @Steps
    AlamatKTPPage alamatKTPPage;

    @And("user menginput RT menggunakan huruf")
    public void inputRTdenganHuruf(){
        alamatKTPPage.InputNoRT("dua belas");
    }

    @Then("field tidak akan terisi karena tidak dapat diinput dengan huruf")
    public void FieldtidakBisaHuruf(){
    }
}
