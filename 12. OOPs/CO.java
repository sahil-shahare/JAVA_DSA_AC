public class CO {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        // BankAccount c1 = new BankAccount();
        // c1.username = "Sahil";
        // c1.setPassword("1234");
    }
}

class Pen {
    private String color;
    private int tip;

    //Setter
    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
    //Getter
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }
}
