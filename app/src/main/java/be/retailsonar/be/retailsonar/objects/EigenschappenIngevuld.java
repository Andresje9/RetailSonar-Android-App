package be.retailsonar.be.retailsonar.objects;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class EigenschappenIngevuld {
    private int eigenschappenBedrijfIngevuldId;
    private int filiaalId;
    private int categorieId;
    private String inhoud;
    private String eenheid;
    private String naam;
    private String type;

    public EigenschappenIngevuld(int eigenschappenBedrijfIngevuldId, int filiaalId, int categorieId, String inhoud, String eenheid, String naam, String type) {
        this.eigenschappenBedrijfIngevuldId = eigenschappenBedrijfIngevuldId;
        this.filiaalId = filiaalId;
        this.categorieId = categorieId;
        this.inhoud = inhoud;
        this.eenheid = eenheid;
        this.naam = naam;
        this.type = type;
    }

    public int getEigenschappenBedrijfIngevuldId() {
        return eigenschappenBedrijfIngevuldId;
    }

    public void setEigenschappenBedrijfIngevuldId(int eigenschappenBedrijfIngevuldId) {
        this.eigenschappenBedrijfIngevuldId = eigenschappenBedrijfIngevuldId;
    }

    public int getFiliaalId() {
        return filiaalId;
    }

    public void setFiliaalId(int filiaalId) {
        this.filiaalId = filiaalId;
    }

    public int getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(int categorieId) {
        this.categorieId = categorieId;
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

    public static List<EigenschappenIngevuld> genereerListUitHashMaps(List<LinkedHashMap> hashMapList){
        if(hashMapList.isEmpty()) return null;

        List<EigenschappenIngevuld> result = new LinkedList<EigenschappenIngevuld>();
        EigenschappenIngevuld e;

        int eigenschappenBedrijfIngevuldId;
        int filiaalId;
        int categorieId;
        String inhoud;
        String eenheid;
        String naam;
        String type;

        for(LinkedHashMap hashMap : hashMapList){
            eigenschappenBedrijfIngevuldId = (int) hashMap.get("eigenschappenBedrijfIngevuldId");
            filiaalId = (int) hashMap.get("filiaalId");
            categorieId = (int) hashMap.get("categorieId");
            inhoud = (String) hashMap.get("inhoud");
            eenheid = (String) hashMap.get("eenheid");
            naam = (String) hashMap.get("naam");
            type = (String) hashMap.get("type");

            e = new EigenschappenIngevuld(eigenschappenBedrijfIngevuldId, filiaalId, categorieId, inhoud, eenheid, naam, type);

            result.add(e);
        }
        return result;
    }
}
