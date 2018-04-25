package be.retailsonar.be.retailsonar.objects;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class CustomEigenschapIngevuld {
    private int customEigenscahpIngevuld_id;
    private int categorieId;
    private int filiaalId;
    private String inhoud;
    private String eenheid;
    private String naam;
    private String type;

    public CustomEigenschapIngevuld(int customEigenscahpIngevuld_id, int categorieId, int filiaalId, String inhoud, String eenheid, String naam, String type) {
        this.customEigenscahpIngevuld_id = customEigenscahpIngevuld_id;
        this.categorieId = categorieId;
        this.filiaalId = filiaalId;
        this.inhoud = inhoud;
        this.eenheid = eenheid;
        this.naam = naam;
        this.type = type;
    }

    public int getCustomEigenscahpIngevuld_id() {
        return customEigenscahpIngevuld_id;
    }

    public void setCustomEigenscahpIngevuld_id(int customEigenscahpIngevuld_id) {
        this.customEigenscahpIngevuld_id = customEigenscahpIngevuld_id;
    }

    public int getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(int categorieId) {
        this.categorieId = categorieId;
    }

    public int getFiliaalId() {
        return filiaalId;
    }

    public void setFiliaalId(int filiaalId) {
        this.filiaalId = filiaalId;
    }

    public String getInhoud() {
        return inhoud;
    }

    public void setInhoud(String inhoud) {
        this.inhoud = inhoud;
    }

    public String getEenheid() {
        return eenheid;
    }

    public void setEenheid(String eenheid) {
        this.eenheid = eenheid;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static List<CustomEigenschapIngevuld> genereerListUitHashMaps(List<LinkedHashMap> hashMapList){
        if(hashMapList.isEmpty()) return null;

        List<CustomEigenschapIngevuld> result = new LinkedList<CustomEigenschapIngevuld>();
        CustomEigenschapIngevuld e;

        int customEigenscahpIngevuld_id;
        int categorieId;
        int filiaalId;
        String inhoud;
        String eenheid;
        String naam;
        String type;

        for(LinkedHashMap hashMap : hashMapList){
            customEigenscahpIngevuld_id = (int) hashMap.get("customEigenscahpIngevuld_id");
            categorieId = (int) hashMap.get("categorieId");
            filiaalId = (int) hashMap.get("filiaalId");
            inhoud = (String) hashMap.get("inhoud");
            eenheid = (String) hashMap.get("eenheid");
            naam = (String) hashMap.get("naam");
            type = (String) hashMap.get("type");

            e = new CustomEigenschapIngevuld(customEigenscahpIngevuld_id, categorieId, filiaalId, inhoud, eenheid, naam, type);

            result.add(e);
        }
        return result;
    }
}
