package TasarımDesenleri.BridgeDesignPatternFirst;

public class Bilgisayar {
    private Spotify spotify;
    private Hoparlör hoparlör;

    public Bilgisayar() {
        this.spotify = new Spotify();
        this.hoparlör = new Hoparlör();
    }
    public void MuzikCal(Muzik muzik){
       String ses = spotify.MuzikCal(muzik);
       Hoparlör.SesVer(ses);
    }
    public Spotify getSpotify() {
        return spotify;
    }

    public void setSpotify(Spotify spotify) {
        this.spotify = spotify;
    }

    public Hoparlör getHoparlör() {
        return hoparlör;
    }

    public void setHoparlör(Hoparlör hoparlör) {
        this.hoparlör = hoparlör;
    }
}
