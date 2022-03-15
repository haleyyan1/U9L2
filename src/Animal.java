public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private String color;
    public Animal(String n, int a, boolean v,String c){
        name=n;
        age=a;
        vaccinated=v;
        color=c;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public String getColor() {
        return color;
    }

    public void adopt() {
        System.out.println("I have been adopted");
    }
    public void feed() {
        System.out.println("I have been fed");
    }
    public void groom(){
        System.out.println("I have been cleaned");
    }
}
