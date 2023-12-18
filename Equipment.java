package Mygym;


public class Equipment 

 {
       public int code;
       public String name;
        public int quantity;

public Equipment(String name, int code, int quantity) {
        this.name = name;
        this.code = code;
        this.quantity = quantity;
}

public String getName() {
    return name;
}
public int getCode() {
    return code;
}
public int getQuantity() {
    return quantity;
}
public void setEquepmentName(String name) {
    this.name = name;
}
public void setCode(int code) {
    this.code = code;
}
public void setQuantity(int quantity) {
    this.quantity = quantity;
}

public String toString() {
    return "\n"+"Equipment Details:" +
           "\nName: " + name +
           "\nCode: " + code +
           "\nQuantity: " + quantity + "\n";
}
}