package starter.stepdefinition.DataPribadi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.DataPribadiPage;

import java.io.DataOutput;

public class TanggalLahir {
    @Steps
    DataPribadiPage dataPribadiPage;

    @And("user click field tanggal lahir")
    public void clickFieldTanggalLahir(){
        dataPribadiPage.ClickFieldTglLahir();
    }
    @And("user memilih bulan lahir")
    public void memilihBulanLahir(){
        dataPribadiPage.MemilihBulanLahir();
    }
    @And("user memilih tahun lahir")
    public void memilihTahunLahir(){
        dataPribadiPage.MemilihTahunLahir("1983");
    }
    @And("user memilih tanggal lahir")
    public void memilihTanggalLahir(){
        dataPribadiPage.MemilihTanggalLahir();
    }

    //Negative case
    @And("user memilih tahun lahir dimasa depan")
    public void memilihTahunLahirMasaDepan(){
        dataPribadiPage.MemilihTahunLahir("2030");
    }
    @Then("pesan peringatan muncul bahwa tanggal lahir tidak dapat menggunakan tanggal dimasa depan")
    public void pesanPeringatanTanggalLahir(){

    }
}
