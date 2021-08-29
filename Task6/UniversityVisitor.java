package Task6;

public abstract class UniversityVisitor {

    private String name;
    private int id;

    public UniversityVisitor(String visitorName, int visitorId){
        this.name = visitorName;
        this.id = visitorId;

    }

    public UniversityVisitor(){
        this.name = null;
        this.id = 0;

    }

    public String myGetterName(){
        return this.name;
    }

}
