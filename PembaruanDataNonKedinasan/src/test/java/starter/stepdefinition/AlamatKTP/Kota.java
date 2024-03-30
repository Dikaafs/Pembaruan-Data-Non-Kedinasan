package starter.stepdefinition.AlamatKTP;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.AlamatKTPPage;

public class Kota {
    @Steps
    AlamatKTPPage alamatKTPPage;

    @And("user menginput Kota dengan angka")
    public void inputKotaDenganAngka(){
        alamatKTPPage.InputKota("Jakarta2");
    }
    @Then("pesan peringatan ditampilkan bahwa field Kota tidak dapat diisi menggunakan angka")
    public void KotaTidakDapatDiisiAngka(){
    }
}
