package ru.staheeva.geometry;

public class PointZ extends Point {
    private int z;

    // Конструктор с int координатами
    public PointZ(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "{" + getX() + ";" + getY() + ";" + z + "}";
    }
}
