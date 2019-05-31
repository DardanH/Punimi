public class Arrays {
        Studenti []users= new Studenti[0];
        int []id=new int[0];

    public void add(Studenti u)
    {
        Studenti []users1=new Studenti[users.length+1];

        for (int i=0;i<users.length;i++)
        {
            users1[i]=users[i];
        }
        users1[users1.length-1]=u;
        users=users1;
    }
    
    
    public void delete(int index)
    {
        Studenti []users1=new Studenti[users.length-1];
        for (int i=0;i<index;i++)
        {
            users1[i]=users[i];
        }
        for (int i=index;i<users1.length;i++)
        {
            users1[i]=users[i+1];
        }
        users=users1;
    }
    public void addId(int n)
    {
        int [] id1=new int[id.length+1];
        for (int i=0;i<id.length;i++)
        {
            id1[i]=id[i];
        }
        id1[id1.length-1]=n;
        id=id1;
    }
    public boolean Id_unike(int u)
    {   boolean ok=false;
        for (int i=0;i<users.length;i++)
        {   Studenti array=users[i];
            if (array.getId()==u){ok=true;}

        }
        return ok;
    }



}