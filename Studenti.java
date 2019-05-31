
public class Studenti {
    String emri,mbiemri,datelindja,nota,piket;
    int id;
    String Lenda;
    public Studenti(String emri,String mbiemri,int id,String Lenda,String nota,String piket)
    {
        this.emri=emri;
        this.mbiemri=mbiemri;
        this.id=id;
        this.datelindja=datelindja;
        this.nota=nota;
        this.Lenda=Lenda;
        this.piket=piket;
    }
    public String getEmri()
    {return emri;}

    public String getMbiemri()
    {return mbiemri;}

public String getLenda()
    {return Lenda;}
    public int getId()
    {return id;}

    public String getDatelindja()
    {return datelindja;}

    public String getNota()
    {return nota;}

    public String getPiket()
    {return piket;}

    public void setNota(String i)
    {nota=i;}

    public void setPiket(String i)
    {piket=i;}
}