package model;

public class Click_model {
    private String enter;
    private int count;

    public Click_model(String enter, int count) {
        this.enter = enter;
        this.count = count;
    }

    public Click_model() {
    }

    public String getEnter() {
        return enter;
    }

    public void setEnter(String enter) {
        this.enter = enter;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public void NumOfClick(){
        this.count++;
    }
    public void Enter(){
        this.enter="Yes";
    }
    public void Exit(){
        this.enter="No";
    }
}
