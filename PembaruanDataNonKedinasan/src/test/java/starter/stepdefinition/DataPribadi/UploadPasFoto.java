package starter.stepdefinition.DataPribadi;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.DataPribadiPage;

import javax.xml.crypto.Data;

public class UploadPasFoto {
    @Steps
    DataPribadiPage dataPribadiPage;

    @And("user mengunggah pas foto")
    public void uploadPasFoto(){
        dataPribadiPage.uploadPasFoto();
    }

    //Negative case
    @And("user mengunggah pas foto melebihi batas maximal yang ditentukan")
    public void PasFotoMelebihi5MB(){
        dataPribadiPage.Upload5mb();
    }
}
