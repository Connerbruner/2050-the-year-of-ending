import sun.misc.Unsafe;
class Crash {
private static final Unsafe unsafe = Unsafe.getUnsafe();
public Crash() {
    unsafe.putAddress(0, 0); 
}

}

