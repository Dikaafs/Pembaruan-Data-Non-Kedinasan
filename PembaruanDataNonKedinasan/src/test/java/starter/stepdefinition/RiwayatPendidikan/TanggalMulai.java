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
    @And("user memilih tahun mulai")
    public void inputTahunMulai(){
        riwayatPendidikanPage.InputTahunMulai("2011");
    }
    @And("user memilih tanggal mulai")
    public void MemilihTanggalmulai(){
        riwayatPendidikanPage.MemilihTanggalMulai();
    }
    @And("user memilih bulan mulai")
    public void MemilihBulanMulai(){
        riwayatPendidikanPage.MemilihBulanMulai();
    }
    //Negative Case
    @And("user memilih tanggal mulai dimasa depan")
    public void memilihTanggalMulaiMasaDepan(){
        riwayatPendidikanPage.MemilihTanggalMulai();
    }
    @And("user memilih bulan mulai dimasa depan")
    public void MemilihBulanMasaDepan(){
        riwayatPendidikanPage.MemilihBulanMulai();
    }
    @And("user memilih tahun mulai dimasa depan")
    public void inputTahunMasaDepan(){
        riwayatPendidikanPage.InputTahunMulai("2040");
    }
    @Then("pesan peringatan muncul bahwa tanggal mulai pendidikan tidak bisa menggunakan format masa depan")
    public void tidakbisaTglMasaDepan(){

    }
}
