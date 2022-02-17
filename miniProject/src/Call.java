import java.util.Scanner;
public class Call { // super class 
        public static void main(String[] args) { // ฟังชั่นเมนหลัก
     
            Base B1 = new Base();
            

            Scanner input = new Scanner(System.in);
            System.out.println("สวัสดีนี่คือระบบ การคำนวนค่าจอดรถ โปรดกรอกตามคำแนะนำ ");
            System.out.println("โปรดเลือกว่าจะจอด เป็น นาที หรือ ชั่ว โมง : ");
            System.out.println("1. คุณต้องการจอดเป็นนาที : ");
            System.out.println("2. คุณต้องการจอดเป็นชั่วโมง  : ");
            System.out.println("3. ปิดโปรแกรม");
            String answer = input.next(); //รับค่า Answer เข้าสู่ if เพื่อเช็ค
            

                if(answer.equals("1")){ // เช็ค Answer ถ้าเข้าเงื่อนไข 1
        
                    System.out.println("คุณเลือกจอดเป็นนาที \n โปรดกรอกเวลาที่คุณต้องการ :");
                    double Ansminute = input.nextDouble(); //รับค่าของ Ansminute
                    
                    double price = 100;
                    double hour = 0;
                    double minute = (Ansminute*price)/2; //คำนวนที่จอดรถของ นาที

                    Base B2 = new Base(hour,price,minute); // constructor method

                
                    System.out.println("คุณต้องการแก้ไขมั้ย ?");
                    System.out.printf("คุณต้องการจอดโดยใช้เวลาทั้งหมด " + Ansminute + "  นาที \n");
                    System.out.println("");

                    System.out.println("แก้ไขกด 1: ");
                    System.out.println("ไม่แก้ไขกด 2: ");
                    String fix = input.next(); //รับค่า fix เข้าสู่ if เพื่อเช็ค

                        if(fix.equals("1")){
                            price = 100;
                            hour = 0;
    

                            System.out.println("คุณเลือกจอดเป็นนาที \n โปรดกรอกเวลาที่คุณต้องการ :");
                            double Ansminute1 = input.nextDouble(); //รับค่าของ Ansminute

                            minute = (Ansminute1*price)/2; // ใส่ค่าใหม่ตอนแก้ไข

                            Base b3Base = new Base(hour,price,minute); // constructor method
                            System.out.printf("คุณต้องจ่ายเงินทั้งสิ้น %.2f" + "บาท" + "ในการจอดแบบนาที\n",b3Base.getMinute());
                        }

                        else{
                            System.out.printf("คุณต้องจ่ายเงินทั้งสิ้น %.2f" + "บาท" + "ในการจอดแบบนาที\n",B2.getMinute());
                            System.exit(0);}
                        

                }
        
                
                else if(answer.equals("2")){ // เช็ค Answer ถ้าเข้าเงื่อนไข 2
                    
                    System.out.println("คุณเลือกจอดเป็นชั่วโมง\n โปรดกรอกเวลาที่คุณต้องการ :");
                    double Anshour = input.nextDouble(); //รับค่าของ Anshour
                    double price = 100;
                    double hour = Anshour*price; //คำนวนที่จอดรถของ ชั่วโมง
                    double minute = 0;

                    Base B2 = new Base(hour,price,minute); // constructor method

                
                    System.out.println("คุณต้องการแก้ไขมั้ย ?");
                    System.out.printf("คุณต้องการจอดโดยใช้เวลาทั้งหมด " + Anshour + "  ชั่วโมง \n");
                    System.out.println("");

                    System.out.println("แก้ไขกด 1: ");
                    System.out.println("ไม่แก้ไขกด 2: ");
                    String fix1 = input.next(); //รับค่า fix เข้าสู่ if เพื่อเช็ค

                        if(fix1.equals("1")){
                            price = 100;
                            minute = 0;
    

                            System.out.println("คุณเลือกจอดเป็นนาที \n โปรดกรอกเวลาที่คุณต้องการ :");
                            double Anshour1 = input.nextDouble(); //รับค่าของ Ansminute

                            hour = Anshour1*price; // ใส่ค่าใหม่ตอนแก้ไข

                            Base b3BaseHour = new Base(hour,price,minute); // constructor method
                            System.out.printf("คุณต้องจ่ายเงินทั้งสิ้น %.2f" + "บาท" + "ในการจอดแบบนาที\n",b3BaseHour.getHour());
                        }

                        else{
                            System.out.printf("คุณต้องจ่ายเงินทั้งสิ้น %.2f" + "บาท" + "ในการจอดแบบนาที\n",B2.getHour());
                            System.exit(0);}
                        
                }

                else { //ไม่เข้าเงื่อนไขไรเลย
                    System.out.println("คุณเลือกตัวเลือกปิดโปรแกรม, โปรแกรมจะปิดระบบทันที"); 
                    System.exit(0);
                }
                
                
            


            input.close();
        }
}
