package Day09;
public class Qus_01{
void A(){
          for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 5; j++) {
                                if(j==0&&i>=2||i+j==2||i==4||j-i==2||j==4&&i>2){
                                        System.out.print("*");
                                }
                                else{
                                        System.out.print(" ");
                                }
                        }
                        System.out.println();
                        
                }
                 System.out.println("\n");
}
void B(){
         for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 5; j++) {
                                if(j==0||i==0&&j<4||i==3&&j<4||i==6&&j<4||j==4&&i!=0&&i!=3&&i!=6){
                                        System.out.print("*");
                                }
                                else{
                                        System.out.print(" ");
                                }
                        }
                        System.out.println();
                        
                }
        System.out.println("\n");
}
               

void C(){
         for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 5; j++) {
                                if(j==0&&i!=0&&i!=6||i==0&&j!=0&&j<4||i==6&&j!=0&&j<4||j==4&&i==1||j==4&&i==5){
                                        System.out.print("*");
                                }
                                else{
                                        System.out.print(" ");
                                }
                        }
                        System.out.println();
                        
                }

         System.out.println("\n");

}
void D(){
          for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 5; j++) {
                                if(j==0||i==0&&j<4||i==6&&j<4||j==4&&i!=0&&i!=6){
                                        System.out.print("*");
                                }
                                else{
                                        System.out.print(" ");
                                }
                        }
                        System.out.println();
                        
                }
                 System.out.println("\n");
}

void E(){
          for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 5; j++) {
                                if(j==0||i==0||i==6||i==3&&j!=4){
                                        System.out.print("*");
                                }
                                else{
                                        System.out.print(" ");
                                }
                        }
                        System.out.println();
                        
                }
                 System.out.println("\n");
}

void F(){
          for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 5; j++) {
                                if(j==0||i==0||i==3&&j!=4){
                                        System.out.print("*");
                                }
                                else{
                                        System.out.print(" ");
                                }
                        }
                        System.out.println();
                        
                }
                 System.out.println("\n");
}

void G(){
          for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 5; j++) {
                                if(j==0&&(i!=0&&i!=6)||i==0&&j!=0&&j<4||i==6&&j!=0&&j<4||i==1&&j==4||(i==5||i==4)&&j==4||i==4&&j==3){
                                        System.out.print("*");
                                }
                                else{
                                        System.out.print(" ");
                                }
                        }
                        System.out.println();
                        
                }
                 System.out.println("\n");
}

void H(){
          for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 5; j++) {
                                if(j==0||j==4||i==3){
                                        System.out.print("*");
                                }
                                else{
                                        System.out.print(" ");
                                }
                        }
                        System.out.println();
                        
                }
                 System.out.println("\n");
}

        public static void main(String[] args) {
            Qus_01 obj1=new Qus_01();
                obj1.A();
                obj1.B();
                obj1.C();
                obj1.D();
                obj1.E();
                obj1.F();
                obj1.G();
                obj1.H();
        }
}