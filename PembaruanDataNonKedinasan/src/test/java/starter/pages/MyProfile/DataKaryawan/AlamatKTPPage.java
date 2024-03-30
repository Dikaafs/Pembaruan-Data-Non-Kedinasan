package starter.pages.MyProfile.DataKaryawan;

import net.thucydides.core.pages.PageObject;
import org.codehaus.groovy.transform.sc.transformers.RangeExpressionTransformer;
import org.openqa.selenium.By;

public class AlamatKTPPage extends PageObject {
    private By AlamatKTPPage(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[1]/div/div/span[3]");
    }
    private By NoRT(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div/input");
    }
    private By NoRW(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div/input");
    }
    private By Kecamatan(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[1]/div/div/div/div[5]/div/input");
    }
    private By Kelurahan(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[1]/div/div/div/div[4]/div/input");
    }
    private By Kota(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[1]/div/div/div/div[6]/div/input");
    }
    private By Provinsi(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[1]/div/div/div/div[7]/div/input");
    }
    private By KodePos(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[1]/div/div/div/div[8]/div/input");
    }
    public boolean ValidateOnAlamatKTPPage(){
        return $(AlamatKTPPage()).isDisplayed();
    }
    public void InputKecamatan(String kecamatan){
        $(Kecamatan()).type(kecamatan);
    }
    public void InputKelurahan(String kelurahan){
        $(Kelurahan()).type(kelurahan);
    }
    public void InputNoRT(String noRT){
        $(NoRT()).type(noRT);
    }
    public void InputNoRW(String noRW){
        $(NoRW()).type(noRW);
    }
    public void InputKota(String kota){
        $(Kota()).type(kota);
    }
    public void InputProvinsi(String provinsi){
        $(Provinsi()).type(provinsi);
    }
    public void InputKodePos(String kodepos){
        $(KodePos()).type(kodepos);
    }
}
