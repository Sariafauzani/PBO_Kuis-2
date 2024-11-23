import java.util.Scanner;
public class GameDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player("Pahlawan", 0, 0, 100, 3);
        Monster monster = new Monster("Naga", 10, 10, 150, 5, "Merah");

        System.out.println("==========================================================");
        System.out.println("|               Selamat datang di Permainan!             |");
        System.out.println("==========================================================");
        System.out.println(player.name + " bertemu dengan monster berwarna " + monster.color + ": " + monster.name + "!");
        System.out.println(monster.makeNoise() + "\n");

        while (!monster.isDead() && player.livesRemaining > 0) {
            System.out.println("-----------------------------------");
            System.out.println("\nPilih tindakan Anda:");
            System.out.println("1. Serang Monster");
            System.out.println("2. Lari");
            System.out.print("Masukkan pilihan Anda: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                player.attack(monster);
                if (!monster.isDead()) {
                    monster.attack(player);
                }
            } else if (choice == 2) {
                System.out.println("================================================");
                System.out.println("| " +player.name + " berhasil melarikan diri dengan aman! |");
                System.out.println("================================================");
                break;
            } else {
                System.out.println("Pilihan tidak valid! Coba lagi.");
            }
        }

        if (monster.isDead() && player.livesRemaining > 0) {
            System.out.println("\n==================================================");
            System.out.println("SELAMAT! \n" + player.name + " telah mengalahkan " + monster.name + "!");
            System.out.println("Skor Akhir: " + player.score);
            System.out.println("==================================================");
        } else if (player.livesRemaining <= 0) {
            System.out.println("----------------------------------------------------------");
            System.out.println("\n| Permainan Berakhir! Semoga lebih beruntung lain kali. |");
            System.out.println("----------------------------------------------------------");
        }

        scanner.close();
    }
}