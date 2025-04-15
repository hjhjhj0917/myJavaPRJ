package week3;

class Rabbit {

    //    String shape;
    //    int xPos;
    //    int yPos;
    //
    //    Rabbit(String shape) {
    //        this.shape = shape;
    //    }
    
    private String shape; // private은 해당 클래스에서만 사용하고, 외부에서 접근 불가
    private int xPos;
    private int yPos;

    public void setShape(String shape) {
        this.shape = shape;
    }
    public String getShape() {
        return this.shape;
    } // return은 뒤에 코드가 있으면, 실행하고 해당 클래스를 종료한다는 의미
    void setPosition(int x, int y) {  // void는 return할 값이 없을 때 사용, 값이 존재하면 return할 값의 형태에 맞춰 사용함
        xPos = x;
        yPos = y;
    }
    public int getX() {
        return this.xPos;
    } // public은 외부에서도 접근 가능함, default랑 다른점은 public은 전체 package에서 사용가능하고
    public int getY() {
        return this.yPos;
    } // default는 그 package안에서만 사용이 가능하다.
}
