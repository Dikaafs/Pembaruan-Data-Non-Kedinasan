package starter.stepdefinition.AlamatKTP;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.AlamatKTPPage;

public class Kelurahan {
    @Steps
    AlamatKTPPage alamatKTPPage;

    @And("user menginput Kelurahan menggunakan angka")
    public void inputKelurahanDenganAngka(){
        alamatKTPPage.InputKelurahan("kelurahan12?");
    }
    @Then("pesan peringatan ditampilkan bahwa field Kelurahan tidak dapat diisi menggunakan angka")
    public void pesanPeringatanKelurahanNoNumber(){

    }
}
