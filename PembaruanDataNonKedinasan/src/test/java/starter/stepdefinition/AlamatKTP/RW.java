package starter.stepdefinition.AlamatKTP;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.AlamatKTPPage;

public class RW {
    @Steps
    AlamatKTPPage alamatKTPPage;

    @And("user menginput RW menggunakan huruf")
    public void InputRWhuruf(){
        alamatKTPPage.InputNoRW("satu");
    }
}
