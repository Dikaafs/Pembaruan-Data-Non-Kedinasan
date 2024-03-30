package starter.stepdefinition.AlamatKTP;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.AlamatKTPPage;

public class KodePos {
    @Steps
    AlamatKTPPage alamatKTPPage;

    @And("user menginput Kode Pos menggunakan angka")
    public void inputKodePosAngka(){
        alamatKTPPage.InputKodePos("test");
    }
    @Then("Huruf pada kode pos tidak akan terinput")
    public void HurufTidakTerinput(){

    }
}
