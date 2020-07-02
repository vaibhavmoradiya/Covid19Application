package com.example.covid19;

public class CountryModel {
    private  String flag,country,cases,todayCases,deaths,todatDeaths,recoverd,active,critical;

    public CountryModel() {
    }

    public CountryModel(String flag, String country, String cases, String todayCases, String deaths, String todatDeaths, String recoverd, String active, String critical) {
        this.flag = flag;
        this.country = country;
        this.cases = cases;
        this.todayCases = todayCases;
        this.deaths = deaths;
        this.todatDeaths = todatDeaths;
        this.recoverd = recoverd;
        this.active = active;
        this.critical = critical;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCases() {
        return cases;
    }

    public void setCases(String cases) {
        this.cases = cases;
    }

    public String getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(String todayCases) {
        this.todayCases = todayCases;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public String getTodatDeaths() {
        return todatDeaths;
    }

    public void setTodatDeaths(String todatDeaths) {
        this.todatDeaths = todatDeaths;
    }

    public String getRecoverd() {
        return recoverd;
    }

    public void setRecoverd(String recoverd) {
        this.recoverd = recoverd;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getCritical() {
        return critical;
    }

    public void setCritical(String critical) {
        this.critical = critical;
    }
}
