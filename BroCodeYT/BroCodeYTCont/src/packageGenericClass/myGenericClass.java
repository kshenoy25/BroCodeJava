package packageGenericClass;

// second parameter name usually is named 'V'
public class myGenericClass <T, V> {
    // T = Thing
    // V
    T x;
    V y;
    myGenericClass(T x, V y){
        this.x=x;
        this.y=y;
    }
    public V getValue(){
        return y;
    }
    /*
    public V getY(){
        return y;
    }

     */


}
