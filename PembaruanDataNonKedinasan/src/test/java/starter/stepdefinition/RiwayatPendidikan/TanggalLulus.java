package starter.stepdefinition.RiwayatPendidikan;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.RiwayatPendidikanPage;

public class TanggalLulus {
    @Steps
    RiwayatPendidikanPage riwayatPendidikanPage;

    @And("user click field tanggal lulus")
    public void clickFieldTanggalLulus(){
        riwayatPendidikanPage.ClickFieldThnLulus();
    }
    @And("user memilih tahun lulus")
    public void TahunLulus(){
        riwayatPendidikanPage.InputThnLulus("2011");
    }
    @And("user memilih bulan lulus")
    public void MemilihBulanLulus(){
        riwayatPendidikanPage.MemilihBulanLulus();
    }
    @And("user memilih tanggal lulus")
    public void MemilihTanggalLulus(){
        riwayatPendidikanPage.MemilihTanggalLulus();
    }
    //Negative Case
    @And("user memilih bulan lulus dimasa depan")
    public void memilihBulanLulusMasaDepan(){

    }
    @And("user memilih tahun lulus dimasa depan")
    public void inputTahunLulusMasaDepan(){
        riwayatPendidikanPage.InputThnLulus("2030");
    }
    @And("user memilih tanggal lulus dimasa depan")
    public void memilihTglLulusMasaDepan(){

    }
}
