package starter.stepdefinition.DataPribadi;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.DataPribadiPage;

import javax.xml.crypto.Data;

public class UploadNPWP {
    @Steps
    DataPribadiPage dataPribadiPage;

    @And("user mengunggah kartu NPWP")
    public void uploadNPWP(){
        dataPribadiPage.uploadNpwp();
    }

    //Negative case
    @And("user mengunggah kartu NPWP dengan size melebihi batas maximal yang sudah ditentukan")
    public void NPWPmelebihi5mb(){
        dataPribadiPage.Upload5mb();
    }
}
