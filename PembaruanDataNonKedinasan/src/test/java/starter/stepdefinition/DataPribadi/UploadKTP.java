package starter.stepdefinition.DataPribadi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.MyProfile.DataKaryawan.DataPribadiPage;

public class UploadKTP {
    @Steps
    DataPribadiPage dataPribadiPage;

    @And("user mengunggah KTP")
    public void uploadKTP(){
        dataPribadiPage.Uploadktp();
    }
    //Negative Case
    @And("user mengunggah KTP dengan size lebih dari 5mb")
    public void KTPmelebihi5mb(){
        dataPribadiPage.Upload5mb();
    }
    @Then("pop up peringatan ditampilkan bahwa file tidak boleh melebihi max size")
    public void PopUpShown(){
        Assertions.assertTrue(dataPribadiPage.AllertMaxSize());
    }
}
