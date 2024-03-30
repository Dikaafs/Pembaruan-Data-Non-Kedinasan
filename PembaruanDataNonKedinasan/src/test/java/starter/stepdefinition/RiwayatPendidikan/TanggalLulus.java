package starter.stepdefinition.RiwayatPendidikan;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.RiwayatPendidikanPage;

public class TanggalLulus {
    @Steps
    RiwayatPendidikanPage riwayatPendidikanPage;

    @And("user click field tanggal lulus")
    public void ClickFieldLulus(){
        riwayatPendidikanPage.InputTglLulus("2044");
    }
}
