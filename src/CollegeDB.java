import java.util.ArrayList;

public class CollegeDB {
    private ArrayList<College> colleges;

    public CollegeDB(){

    }
    //overloaded contructor
    public CollegeDB(ArrayList<College> colleges){
        this.colleges = colleges;
    }
    public ArrayList<College> getColleges(){
        return this.colleges;
    }
    public void setColleges(ArrayList<College> college){
        this.colleges = colleges;
    }

}
