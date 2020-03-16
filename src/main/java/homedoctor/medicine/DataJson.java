package homedoctor.medicine;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class DataJson {

    private Long item_code;

    private String medicine_name;

    private String effect;

    private String save_method;

    private String valid_date;

    private String dosage;

    private String bad_effect;

    public Long getItem_code() {
        return item_code;
    }

    public void setItem_code(Long item_code) {
        this.item_code = item_code;
    }

    public String getMedicine_name() {
        return medicine_name;
    }

    public void setMedicine_name(String medicine_name) {
        this.medicine_name = medicine_name;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getSave_method() {
        return save_method;
    }

    public void setSave_method(String save_method) {
        this.save_method = save_method;
    }

    public String getValid_date() {
        return valid_date;
    }

    public void setValid_date(String valid_date) {
        this.valid_date = valid_date;
    }

    public String getDosage() {
        return dosage;
    }

    @Override
    public String toString() {
        return "datJson{" +
                "item_code=" + item_code +
                ", medicine_name='" + medicine_name + '\'' +
                ", effect='" + effect + '\'' +
                ", save_method='" + save_method + '\'' +
                ", valid_date='" + valid_date + '\'' +
                ", dosage='" + dosage + '\'' +
                ", bad_effect='" + bad_effect + '\'' +
                '}';
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getBad_effect() {
        return bad_effect;
    }

    public void setBad_effect(String bad_effect) {
        this.bad_effect = bad_effect;
    }
}
