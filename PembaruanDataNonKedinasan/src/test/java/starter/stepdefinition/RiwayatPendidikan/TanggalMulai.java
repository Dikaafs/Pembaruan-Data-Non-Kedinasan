package starter.stepdefinition.RiwayatPendidikan;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.RiwayatPendidikanPage;

public class TanggalMulai {
    @Steps
    RiwayatPendidikanPage riwayatPendidikanPage;

    @And("user click field tanggal mulai")
    public void clickTglMulai(){
        riwayatPendidikanPage.ClickTglMulai();
    }
    @And("user memilih tanggal masa depan")
    public void memilihTglMasaDepan(){
        riwayatPendidikanPage.InputTglMulai("2040");
    }
    @Then("pesan peringatan muncul bahwa tanggal mulai pendidikan tidak bisa menggunakan format masa depan")
    public void tidakbisaTglMasaDepan(){

    }
}
