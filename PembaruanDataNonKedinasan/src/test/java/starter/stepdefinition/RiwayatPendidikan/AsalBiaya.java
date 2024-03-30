package starter.stepdefinition.RiwayatPendidikan;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.RiwayatPendidikanPage;

public class AsalBiaya {
    @Steps
    RiwayatPendidikanPage riwayatPendidikanPage;

    @And("user click Riwayat Pendidikan")
    public void clickRiwayatPendidikan(){
        riwayatPendidikanPage.clickriwayatpendidikan();
    }
    @And("user memilih asal biaya yang tidak terdaftar")
    public void memilihAsalBiayaTidakTerdaftar(){
        riwayatPendidikanPage.memilihAsalBiaya("kemdikbud");
    }
}
