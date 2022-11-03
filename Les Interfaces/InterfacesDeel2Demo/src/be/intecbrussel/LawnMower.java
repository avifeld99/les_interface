package be.intecbrussel;

// interface aggregation
public interface LawnMower extends Switch, Motor{
    void adjustHeight(int height);
}
