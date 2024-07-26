package packageBoundedTypes;

// second parameter name usually is named 'V'
public class myGenericClassTwo <T extends Number, V extends Number> {
    // T = Thing
    // V
    T x;
    V y;

    myGenericClassTwo(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public V getValue() {
        return y;
    }
}
    /*
    public V getY(){
        return y;
    }

     */