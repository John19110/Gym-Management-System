package gym;


public class Equipment

 {
       public String name,code;

        public int quantity;
public Equipment(String name, String code, int quantity) {
        this.name = name;
        this.code = code;
        this.quantity = quantity;
}

public String getName() {
    return name;
}
public String getCode() {
    return code;
}
public int getQuantity() {
    return quantity;
}
public void setEquepmentName(String name) {
    this.name = name;
}
public void setCode(String code) {
    this.code = code;
}
public void setQuantity(int quantity) {
    this.quantity = quantity;
}


}