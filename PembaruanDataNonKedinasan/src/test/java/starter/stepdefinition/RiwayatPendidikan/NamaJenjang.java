package starter.stepdefinition.RiwayatPendidikan;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.RiwayatPendidikanPage;

public class NamaJenjang {
    @Steps
    RiwayatPendidikanPage riwayatPendidikanPage;

    @And("user menginput nama jenjang pendidikan dengan karakter spesial")
    public void inputNamaJenjang(){
        riwayatPendidikanPage.InputNamaJenjang("S1_");
    }
}
