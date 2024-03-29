package com.rikyahmadfathoni.test.weatherapp.data.model;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.rikyahmadfathoni.test.weatherapp.data.model.current.Clouds;
import com.rikyahmadfathoni.test.weatherapp.data.model.current.Coord;
import com.rikyahmadfathoni.test.weatherapp.data.model.current.Main;
import com.rikyahmadfathoni.test.weatherapp.data.model.current.Sys;
import com.rikyahmadfathoni.test.weatherapp.data.model.current.Weather;
import com.rikyahmadfathoni.test.weatherapp.data.model.current.Wind;
import com.rikyahmadfathoni.test.weatherapp.util.UtilsGson;

public class WeatherCurrentModel {

    public static WeatherCurrentModel getNonNullInstance() {
        final WeatherCurrentModel model = new WeatherCurrentModel();
        model.createInstance();
        return model;
    }

    @SerializedName("coord")
    @Expose
    private Coord coord;
    @SerializedName("weather")
    @Expose
    private List<Weather> weather = null;
    @SerializedName("base")
    @Expose
    private String base;
    @SerializedName("main")
    @Expose
    private Main main;
    @SerializedName("visibility")
    @Expose
    private Integer visibility;
    @SerializedName("wind")
    @Expose
    private Wind wind;
    @SerializedName("clouds")
    @Expose
    private Clouds clouds;
    @SerializedName("dt")
    @Expose
    private Integer dt;
    @SerializedName("sys")
    @Expose
    private Sys sys;
    @SerializedName("timezone")
    @Expose
    private Integer timezone;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("cod")
    @Expose
    private Integer cod;

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public Integer getTimezone() {
        return timezone;
    }

    public void setTimezone(Integer timezone) {
        this.timezone = timezone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    private void createInstance() {
        this.sys = new Sys();
        this.clouds = new Clouds();
        this.wind = new Wind();
        this.main = new Main();
        this.coord = new Coord();
        this.weather = new ArrayList<Weather>() {{{
            add(new Weather());
        }}};
    }

    @Override
    @NonNull
    public String toString() {
        final String json = UtilsGson.toJson(this);
        if (json != null) {
            return json;
        } else {
            return "WeatherResult{" +
                    "coord=" + coord +
                    ", weather=" + weather +
                    ", base='" + base + '\'' +
                    ", main=" + main +
                    ", visibility=" + visibility +
                    ", wind=" + wind +
                    ", clouds=" + clouds +
                    ", dt=" + dt +
                    ", sys=" + sys +
                    ", timezone=" + timezone +
                    ", id=" + id +
                    ", name='" + name + '\'' +
                    ", cod=" + cod +
                    '}';
        }
    }
}
