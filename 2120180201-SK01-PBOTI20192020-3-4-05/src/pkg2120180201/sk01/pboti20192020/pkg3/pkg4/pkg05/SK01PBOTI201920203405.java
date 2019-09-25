
package pkg2120180201.sk01.pboti20192020.pkg3.pkg4.pkg05;

public class SK01PBOTI201920203405 {

    public static void main(String[] args) {
        /*untuk membuat segitiga rata kiri*/
         for(int i=1; i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
                
            }
            for(int x=9;x>=i;x--){
                System.out.print("5");/*membuat segitiga siku" terbalik rata kanan, 
                semakin kebawah semakin sedikit*/ 
            }
            for(int y=8;y>=i;y--){
                System.out.print("5");/*segitiha siku" terbalik rata kiri yang dimuali dari baris ke8,
                y bersifat-- semakin kebawah semakin sedikit*/
            }
            System.out.println();
        }
    }
    
}
