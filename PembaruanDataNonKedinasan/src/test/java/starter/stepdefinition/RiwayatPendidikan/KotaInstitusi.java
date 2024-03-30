package starter.stepdefinition.RiwayatPendidikan;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.RiwayatPendidikanPage;

public class KotaInstitusi {
    @Steps
    RiwayatPendidikanPage riwayatPendidikanPage;

    @And("user menginput kota institusi dengan angka")
    public void inputKotaInstitusi(){
        riwayatPendidikanPage.inputKotaInstitusi("Bandung0");
    }
    @Then("angka otomatis tidak terinput")
    public void AngkaTidakTerinput(){

    }
}
