import java.util.Random;
class Player extends DamageableObject {
    int score;
    int livesRemaining;

    public Player(String name, int posX, int posY, int maxHealth, int livesRemaining) {
        super(name, posX, posY, maxHealth);
        this.livesRemaining = livesRemaining;
        this.score = 0;
    }

    @Override
    public void onKilled() {
        livesRemaining--;
        System.out.println(name + " telah mati!\nSisa nyawa: " + livesRemaining);
        if (livesRemaining > 0) {
            System.out.println(name + " sedang dihidupkan kembali...");
            health = maxHealth; // Menghidupkan kembali pemain
        } else {
            System.out.println("\n==================================================");
            System.out.println("| " + name + " kehabisan nyawa! Permainan berakhir. |");
            System.out.println("==================================================");
        }
    }

    public void attack(Monster monster) {
        Random random = new Random();
        int damage = random.nextInt(30) + 10; // Kerusakan antara 10-40
        System.out.println(name + " menyerang " + monster.name + " sebesar " + damage + " kerusakan!");
        monster.takeDamage(damage);
        if (monster.isDead()) {
            score += 100;
            System.out.println("\n==================================================");
            System.out.println("| "+name + " mendapatkan 100 poin! Total skor: " + score +" |");
            System.out.println("==================================================");
        }
    }
}