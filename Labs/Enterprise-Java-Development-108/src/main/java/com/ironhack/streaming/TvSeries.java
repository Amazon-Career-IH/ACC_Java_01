package com.ironhack.streaming;

public class TvSeries extends Video {
    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    @Override
    public String getInfo() {
        return "Título: " + getTitle() + "\n"
                + "Duración: " + getDuration() + "\n"
                + "Episodios: " + getEpisodes();
    }
}
