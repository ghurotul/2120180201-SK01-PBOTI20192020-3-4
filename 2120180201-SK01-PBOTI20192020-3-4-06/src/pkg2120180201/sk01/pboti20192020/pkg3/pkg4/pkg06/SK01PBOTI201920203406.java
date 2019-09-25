
package pkg2120180201.sk01.pboti20192020.pkg3.pkg4.pkg06;

public class SK01PBOTI201920203406 {

    public static void main(String[] args) {
        /*membuat segitiga sama kaki*/
        for(int i=1; i<=9;i++){/*membuat baris*/
            for(int j=9;j>=i;j--){/*kolom*/
                System.out.print(" ");/*membuat segitiga siku terbalik rata kiri*/
                
            }
            for(int x=1;x<=i;x++){
                System.out.print("6");/*membuat segitiga siku rata kanan,
                    semakin kebawah semakin banyak*/
            }
            for(int y=1;y<=i-1;y++){
                System.out.print("6");/*segitiga siku rata kiri yang dimulai baris 2,
                semakin kebawah semakin bertambah*/
             
            }
            System.out.println();
          }
        /*membuat segitiga sama kaki terbalik*/
         for(int i=1; i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");/*untuk membuat segitiga rata kiri*/
                
            }
            for(int x=9;x>=i;x--){
                System.out.print("6");/*membuat segitiga siku" terbalik rata kanan, 
                semakin kebawah semakin sedikit*/ 
            }
            for(int y=8;y>=i;y--){
                System.out.print("6");/*segitiha siku" terbalik rata kiri yang dimuali dari baris ke8,
                y bersifat-- semakin kebawah semakin sedikit*/
            }
            System.out.println();
        }
    }
    
}
