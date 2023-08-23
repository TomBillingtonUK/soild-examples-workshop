package liskov;

public class Square extends Rectangle {

    public Square() {};

    public Square (int size) {
        this.height = size;
        this.width = size;
    }

    @Override
    public void setWidth(int width){
        this.height = width;
        this.width = width;
    }

    @Override
    public void setHeight(int height){
        this.height = height;
        this.width = height;
    }
}
