package starter.stepdefinition.AlamatKTP;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.AlamatKTPPage;

public class Provinsi {
    @Steps
    AlamatKTPPage alamatKTPPage;

    @And("user menginput Provinsi dengan angka")
    public void inputProvinsiDenganAngka(){
        alamatKTPPage.InputProvinsi("DKI JAKARTA1");
    }
}
