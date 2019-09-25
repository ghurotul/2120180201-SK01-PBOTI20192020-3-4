
package pkg2120180201.sk01.pboti20192020.pkg3.pkg4.pkg02;

public class SK01PBOTI201920203402 {
    public static void main(String[] args) {
  
        for(int i=1;i<=9; i++){/*membuat 9 baris*/
            for(int j=8; j>=i; j--){
                System.out.print(" ");/*membentuk segitiga siku terbalik lurus kiri yang terdiri dari spasi,
                dimulai dari baris ke 8,bersifat -- semakin kebawah semakin berkurang
                */
            }
            for(int x=1;x<=i;x++){
                System.out.print("2");/*memunculkan angka 2 dimulai baris 1,
                dan bersifat ++ jadi semakin kebawah semakin bertambah*/
               
     
            }
            System.out.println();
        }
    }
    
}
