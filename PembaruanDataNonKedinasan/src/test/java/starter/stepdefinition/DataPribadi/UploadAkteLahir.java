package starter.stepdefinition.DataPribadi;

import com.sun.source.tree.IdentifierTree;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.DataPribadiPage;

public class UploadAkteLahir {
    @Steps
    DataPribadiPage dataPribadiPage;

    @And("user mengunggah akte lahir")
    public void UploadAkteLahir(){
        dataPribadiPage.UploadAkteLahir();
    }

    //Negative Case
    @And("user mengunggah akte lahir dengan size lebih dari 5mb")
    public void AkteLahirMoreThanMax(){
        dataPribadiPage.UploadAkteLahir();
    }
    @Then("pop up peringatan ditampilkan bahwa file tidak boleh melebihi max size")
    public void PopUpShown(){

    }
}
