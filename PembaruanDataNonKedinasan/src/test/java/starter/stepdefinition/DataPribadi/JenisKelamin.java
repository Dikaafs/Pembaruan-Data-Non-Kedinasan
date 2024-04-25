package starter.stepdefinition.DataPribadi;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.DataPribadiPage;

public class JenisKelamin {

    @Steps
    DataPribadiPage dataPribadiPage;

    @And("user click field jenis kelamin")
    public void clickFieldJenisKelamin(){
        dataPribadiPage.ClickFieldJenisKelamin();
    }

    @And("user memilih jenis kelamin")
    public void memilihJenisKelamin(){
        dataPribadiPage.jenisKelamin("WANITA");
    }
    //Negative case
    @And("user memilih jenis kelamin yang tidak tersedia")
    public void memilihJenisKelaminTidakTersedia(){
        dataPribadiPage.InvalidJenisKelamin("Test");
    }
}
