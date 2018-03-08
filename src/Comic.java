public class Comic {
    String Held ;
    String Verlag;
    int ComicNr;

    public String getHeld() {
        return Held;
    }

    public String getVerlag() {
        return Verlag;
    }

    public int getComicNr(){
           return ComicNr;
    }

    public Comic (String Held, String Verlag, int ComicNr){
        Held = this.Held;
        Verlag = this.Verlag;
        ComicNr = this.ComicNr;
    }




}
