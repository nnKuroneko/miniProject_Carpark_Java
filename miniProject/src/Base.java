
public class Base{ // super class
    
    private double hour; // ค่าตัวแปลของ hour
    private double price; // ค่าตัวแปลของ price
    private double minute;// ค่าตัวแปลของ minute
    public Base(){
        
    }
    public Base(double newHour, double newPrice , double newMinute){ // Construct method ของ Base
        hour = newHour;
        price = newPrice;
        minute = newMinute;
    }
    // getter method

    public double getHour(){ // getter ของ hour
        return this.hour; //รับ return ค่าไปที่ชั่วโมง
    }
    public double getPrice(){ // getter ของ price
        return this.price; //รับ return ค่าไปที่ราคา
    }
    public double getMinute(){ // getter ของ minute
        return this.minute; //รับ return ค่าไปที่นาที
    }


    // setter method

    public void setHour(double newHour){ //setter ของ hour
        hour = newHour; // กำหนดค่า 
    }

    public void setPrice(double newPrice){ //setter ของ price
        price = newPrice; // กำหนดค่า
    }

    public void setMinute(double newMinute){ //setter ของ minute
        minute = newMinute; // กำหนดค่า
    }
    


}