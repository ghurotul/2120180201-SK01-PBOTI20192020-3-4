
package pkg2120180101.sk01.pboti20192020.pkg3.pkg4.pkg04;


public class SK01PBOTI201920203404 {

    public static void main(String[] args) {
        /*membuat segitiga siku terbalik rata kiri*/
        for(int i=1; i<=9;i++){/*membuat baris*/
            for(int j=8;j>=i;j--){/*kolom*/
                System.out.print(" ");
                
            }
            for(int x=1;x<=i;x++){
                System.out.print("4");/*membuat segitiga siku rata kanan,
                    semakin kebawah semakin banyak*/
            }
            for(int y=1;y<=i-1;y++){
                System.out.print("4");/*segitiga siku rata kiri yang dimulai baris 2,
                semakin kebawah semakin bertambah*/
             
            }
            System.out.println();
        }
    }
    
}
