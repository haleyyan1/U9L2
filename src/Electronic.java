public class Electronic {
    private String brand;
    private boolean isCharged;
    public Electronic(String b, boolean c){
        brand=b;
        isCharged=c;
    }
    public void charge(){
        isCharged=true;
        System.out.println("I have been charged");
    }

    public String getBrand() {
        return brand;
    }

    public boolean getIsCharged() {
        return isCharged;
    }
}
