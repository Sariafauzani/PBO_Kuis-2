class GameObject {
    String name;
    int posX;
    int posY;

    public GameObject(String name, int posX, int posY) {
        this.name = name;
        this.posX = posX;
        this.posY = posY;
    }

    public void despawn() {
        System.out.println(name + " telah dihapus dari permainan.");
    }
}