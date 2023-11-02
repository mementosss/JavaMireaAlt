package Study_Java.Task13.z4;

public class Shirt {
    private String idOfItem;
    private String modelType;
    private String color;
    private String size;

    public Shirt(String idOfItem, String modelType, String color, String size) {
        this.idOfItem = idOfItem;
        this.modelType = modelType;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Item ID = " + idOfItem + ", Type = " + modelType + ", color = " + color + ", size = " + size;
    }
}