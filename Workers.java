package src;

public class Workers {
    private String name_worker;
    private String year_born;//год_рождения
    public Workers(String name_worker,String year_born){
        this.name_worker = name_worker;
        this.year_born = year_born;
    }
    public String getName_worker(){
        return name_worker;
    }
    public String getYear_born(){
        return year_born;
    }
}
