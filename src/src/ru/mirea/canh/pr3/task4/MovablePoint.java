package src.ru.mirea.canh.pr3.task4;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint(){}
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        if(xSpeed >= 0) this.xSpeed = xSpeed;
        else this.xSpeed = -xSpeed;
        if(ySpeed >= 0) this.ySpeed = ySpeed;
        else this.ySpeed = -ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint: x = " + x + ", y = " + y + ", xSpeed = " + xSpeed + ", ySpeed = " + ySpeed;
    }

    @Override
    public void moveUp() {
        y+=ySpeed;
    }

    @Override
    public void moveDown() {
        y-=ySpeed;
    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
    }

    @Override
    public void moveRight() {
        x+=xSpeed;
    }
}
