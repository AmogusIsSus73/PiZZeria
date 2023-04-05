package src;

public class Bakers extends Workers{
    private int work_exp;
    public Bakers(String name_worker,String year_born,int work_exp){
        super(name_worker,year_born);
        this.work_exp = work_exp;
    }
    public int getWork_exp(){
        return work_exp;
    }
    
}
