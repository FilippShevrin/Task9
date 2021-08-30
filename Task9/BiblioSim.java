package Task9;

public class BiblioSim {
    private String title;
    private String author;
    private int year;
    private String ISBN;

    public BiblioSim(String tit, String auth, int yaerrr, String IS2)
    {
        this.title = tit;
        this.author = auth;
        this.year = yaerrr;
        this.ISBN = IS2;
    }

    public String getBookName()
    {
        return this.title;
    }

    public int getBookYear()
    {
        return this.year;
    }
}

