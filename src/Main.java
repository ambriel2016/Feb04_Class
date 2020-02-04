public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.cheer();

        //abstract one
        // does not work because abstract cannot be instantiated
//        Animal animal = new Animal();
        Dog dog = new Dog();
        dog.talk();

        //final
        College college = new College();
        System.out.println(college.getSTUDENTCAP());
    }
}
