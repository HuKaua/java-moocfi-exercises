public class Film {
    private String name;
    private int ageRating;

    public Film(String initialName, int initialAgeRating){
        this.name = initialName;
        this.ageRating = initialAgeRating;


    }
    public String name(){
        String name = this.name;
        return(name);
    }
    public int ageRating(){
        int ageRating = this.ageRating;
        return(ageRating);
    }


}
