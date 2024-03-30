package starter.stepdefinition.RiwayatPendidikan;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.RiwayatPendidikanPage;

public class keterangan {
    @Steps
    RiwayatPendidikanPage riwayatPendidikanPage;

    @And("user mengosongkan field keterangan")
    public void userMengosongkanFieldKeterangan(){
        riwayatPendidikanPage.InputKeterangan(" ");
    }
}
