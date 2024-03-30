package starter.pages.MyProfile.DataKaryawan;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RiwayatPendidikanPage extends PageObject {
    private By riwayatpendidikan(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[1]/div/div/span[11]");
    }
    private By AsalBiaya(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[1]/div/div/div[2]/div[11]/div/div/div/div[1]/div[2]");
    }
    private By Gelar(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[1]/div/div/div[2]/div[5]/div/input");
    }
    private By Ijazah(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[1]/div/div/div[2]/div[6]/div/div/div/div/span");
    }
    private By Institusi(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/input");
    }
    private By IPK(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[1]/div/div/div[2]/div[4]/div/input");
    }
    private By Keterangan(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[1]/div/div/div[2]/div[12]/div/input");
    }
    private By KotaInstitusi(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[1]/div/div/div[2]/div[8]/div/input");
    }
    private By NamaJenjang(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/input");
    }
    private By NamaJurusan(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/div/input");
    }
    private By Negara(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[1]/div/div/div[2]/div[7]/div/input");
    }
    private By FieldTglMulai(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[1]/div/div/div[2]/div[9]/div/input");
    }
    private By TglMuLai(){
        return By.xpath("/html/body/div[5]/div[1]/div/div/div/input");
    }
    private By TglLulus(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[1]/div/div/div[2]/div[10]/div/input");
    }
    public void clickriwayatpendidikan(){
        $(riwayatpendidikan()).click();
    }
    public void memilihAsalBiaya(String asalbiaya){
        $(AsalBiaya()).type(asalbiaya);
    }
    public void menginputGelar(String gelar){
        $(Gelar()).type(gelar);
    }
    public void UploadIjazah(){
        WebElement uploadElement = $(Ijazah());
        uploadElement.sendKeys("C:/Users/yudika/(UPLOAD DI PATH INI");
        $(Ijazah()).click();
    }
    public void inputInstitusi(String institusi){
        $(Institusi()).type(institusi);
    }
    public void inputIPK(String ipk){
        $(IPK()).type(ipk);
    }
    public void InputKeterangan(String ket){
        $(Keterangan()).type(ket);
    }
    public void inputKotaInstitusi(String KI){
        $(KotaInstitusi()).type(KI);
    }
    public void InputNamaJenjang(String NJ){
        $(NamaJenjang()).type(NJ);
    }
    public void InputNamaJurusan(String Jurusan){
        $(NamaJurusan()).type(Jurusan);
    }
    public void InputNegara(String negara){
        $(Negara()).type(negara);
    }
    public void ClickTglMulai(){
        $(FieldTglMulai()).click();
    }
    public void InputTglMulai(String tglmulai){
        $(TglMuLai()).type(tglmulai);
    }
    public void InputTglLulus(String tgllulus){
        $(TglLulus()).type(tgllulus);
    }
}
