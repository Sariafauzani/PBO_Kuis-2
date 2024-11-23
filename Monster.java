import java.util.Random;
class Monster extends DamageableObject {
    int threatLevel;
    String color;

    public Monster(String name, int posX, int posY, int maxHealth, int threatLevel, String color) {
        super(name, posX, posY, maxHealth);
        this.threatLevel = threatLevel;
        this.color = color;
    }

    @Override
    public void onKilled() {
        System.out.println("\n==========================");
        System.out.println("| " + name + " telah dikalahkan! |");
        System.out.println("==========================");
    }

    public void attack(Player player) {
        Random random = new Random();
        int damage = random.nextInt(25) + 5; // Kerusakan antara 5-30
        System.out.println(name + " menyerang " + player.name + " sebesar " + damage + " kerusakan!");
        player.takeDamage(damage);
    }

    public String makeNoise() {
        return name + " menggeram dengan ganas.\nRawr Rawr!";
    }
}