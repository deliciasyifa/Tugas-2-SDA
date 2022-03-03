import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("===================================");
        System.out.println("TUGAS 2 STRUKTUR DATA DAN ALGORITMA");
        System.out.println("            LINKED LIST            ");
        System.out.println("===================================\n");

        Scanner input = new Scanner(System.in);
        String inputan;
        String pilihan;
        boolean isLanjutkan = true;
        int x;
        

        LinkedList<String> saya = new LinkedList<>();
        saya.add("D");
        saya.add("E");
        saya.add("L");
        saya.add("I");
        saya.add("C");
        saya.add("I");
        saya.add("A");
        saya.add(" ");
        saya.add("S");
        saya.add("Y");
        saya.add("I");
        saya.add("F");
        saya.add("A");
        

        while(isLanjutkan){
            System.out.println("Menu Pilihan :");
            System.out.println("1. Menambahkan Data");
            System.out.println("2. Menyisipkan Data");
            System.out.println("3. Menghapus Data");
            System.out.println("4. Push Data");
            System.out.println("5. Pop Data");

            System.out.print("\n\nMasukkan Pilihan   : ");
            pilihan = input.next();
            System.out.println();

            switch(pilihan){
                case "1" :
                            System.out.println("Menambahkan Karakter");
                            System.out.println("====================");

                            System.out.println("Data Linked List Sebelum ditambah : ");
                            System.out.println(saya + "ukuran : " +  saya.size());
                            System.out.print("Masukkan Karakter yang akan ditambahkan = ");
                            inputan = input.next();
                            saya.add(inputan);
                            System.out.println("Data Linked List setelah ditambah : ");
                            System.out.println(saya + "ukuran : " +  saya.size());
                break;
    
                case "2" :
                            System.out.println("Menyisipkan Karakter");
                            System.out.println("====================");
    
                            System.out.println("Data Linked List Sebelum ditambah : ");
                            System.out.println(saya + "ukuran : " +  saya.size());
                            System.out.print("Masukkan Karakter yang akan disisipkan = ");
                            inputan = input.next();
                            System.out.println("Masukkan indeks karakter yang akan disisipkan = ");
                            x = input.nextInt();
                            saya.set(x, inputan);
                            System.out.println("Data Linked List setelah disisipkan : ");
                            System.out.println(saya + "ukuran : " +  saya.size());

                break;
    
                case "3" :
                            System.out.println("Menghapus Karakter");
                            System.out.println("==================");

                            System.out.println("Data Linked List Sebelum dihapus : ");
                            System.out.println(saya + "ukuran : " +  saya.size());
                            System.out.printf("Masukkan Karakter yang akan dihapus = ");
                            inputan = input.next();
                            saya.remove(inputan);
                            System.out.println("Data Linked List setelah dihapus : ");
                            System.out.println(saya + "ukuran : " +  saya.size());
                break;
    
                case "4" :
                            System.out.println("Push Karakter");
                            System.out.println("=============");

                            System.out.println("Data Linked List Sebelum dipush : ");
                            System.out.println(saya + "ukuran : " +  saya.size());
                            System.out.print("Masukkan Karakter yang akan dipush = ");
                            inputan = input.next();
                            saya.push(inputan);
                            System.out.println("Data Linked List setelah dipush : ");
                            System.out.println(saya + "ukuran : " +  saya.size());    
                break;
                case "5" :
                            System.out.println("Pop Karakter");
                            System.out.println("============");

                            System.out.println("Data Linked List Sebelum dipop : ");
                            System.out.println(saya + "ukuran : " +  saya.size());
                            saya.pop();
                            System.out.println("Data Linked List setelah dipush : ");
                            System.out.println(saya + "ukuran : " +  saya.size());
                            break;
            }

            System.out.print("\nApakah Anda Masih Ingin Lanjut[y/n]? ");
            pilihan = input.next();
            isLanjutkan = pilihan.equalsIgnoreCase ("y");
        }
        

       


        


       
    }
}
