package starter.stepdefinition.RiwayatPendidikan;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.RiwayatPendidikanPage;

public class NamaJurusan {
    @Steps
    RiwayatPendidikanPage riwayatPendidikanPage;

    @And("user menginput nama jurusan dengan angka")
    public void inputNamaJurusan(){
        riwayatPendidikanPage.InputNamaJurusan("Kelautan2");
    }
}
