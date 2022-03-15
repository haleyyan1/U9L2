public class Dog extends Animal{
    private boolean hasBeenWalked;
    private boolean hasBarked;
    public Dog(String n, int a,boolean v,String c,boolean w){
        super(n,a,v,c);
        hasBeenWalked=w;
    }
    public void walk(){
        hasBeenWalked=true;
        System.out.println("I have been walked");
    }

    public boolean isHasBeenWalked() {
        return hasBeenWalked;
    }

    public boolean isHasBarked() {
        return hasBarked;
    }
    public void bark(){
        hasBarked=true;
        System.out.println("Woof");
    }
}
