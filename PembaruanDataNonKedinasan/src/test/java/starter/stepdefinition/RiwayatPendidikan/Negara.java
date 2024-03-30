package starter.stepdefinition.RiwayatPendidikan;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.RiwayatPendidikanPage;

public class Negara {
    @Steps
    RiwayatPendidikanPage riwayatPendidikanPage;

    @And("user menginput negara dengan angka")
    public void inputNegara(){
        riwayatPendidikanPage.InputNegara("Indonesia1");
    }
}
