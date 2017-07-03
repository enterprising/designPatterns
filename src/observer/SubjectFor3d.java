package observer;

import java.util.Observable;

/**
 * Java自带了观察者模式，这里使用的是Java自带的。之前从来都没用过。
 */
public class SubjectFor3d extends Observable{
    private String msg;

    public String getMsg(){
        return msg;
    }

    /**
     * 主题更新消息
     * @param msg
     */
    public void setMsg(String msg){
        this.msg = msg;
        setChanged();
        notifyObservers();
    }
}
