import java.util.Scanner;

class MemberLibrary {
    private String idMember;
    private String nama;
    private int poin;

    public MemberLibrary(String idMember, String nama, int poin) {
        this.idMember = idMember;
        this.nama = nama;
        this.poin = poin;
    }

    public void cetakKartu() {
        System.out.println("\n===== KARTU MEMBER PERPUSTAKAAN =====");
        System.out.println("ID Member   : " + this.idMember);
        System.out.println("Nama        : " + this.nama);
        System.out.println("Poin Reward : " + this.poin + " pts");
        
        if (this.poin > 100) {
            System.out.println("Status      : Member Gold");
        } else {
            System.out.println("Status      : Member Silver");
        }
        System.out.println("=====================================");
    }
}

public class MainLibrary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Pendaftaran Member Baru ---");
        
        System.out.print("Masukkan ID Member : ");
        String id = input.nextLine();

        System.out.print("Masukkan Nama      : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Poin Awal : ");
        int poin = input.nextInt();

        MemberLibrary memberBaru = new MemberLibrary(id, nama, poin);

        memberBaru.cetakKartu();

        input.close();
    }
}
