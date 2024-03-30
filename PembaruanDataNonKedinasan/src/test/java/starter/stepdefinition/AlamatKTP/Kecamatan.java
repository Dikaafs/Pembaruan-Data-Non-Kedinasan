package starter.stepdefinition.AlamatKTP;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.AlamatKTPPage;

public class Kecamatan {
    @Steps
    AlamatKTPPage alamatKTPPage;

    @And("user click Alamat KTP")
    public void clickAlamatKTPPage(){
        alamatKTPPage.ValidateOnAlamatKTPPage();
    }
    @And("user menginput Kecamatan menggunakan angka")
    public void inputKecamatanMenggunakanAngkka(){
        alamatKTPPage.InputKecamatan("sukajadi21");
    }
    @Then("pesan peringatan ditampilkan bahwa field Kecamatan tidak dapat diisi menggunakan angka")
    public void kecamatanAngka(){

    }
}
