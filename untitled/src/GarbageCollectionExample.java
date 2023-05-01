public class GarbageCollectionExample {

    public static void main(String[] args) {
        GarbageCollectionExample garbageCollectionExample = new GarbageCollectionExample();
        GarbageCollectionExample garbageCollectionExample1 = new GarbageCollectionExample();
        GarbageCollectionExample garbageCollectionExample2 = new GarbageCollectionExample();
        garbageCollectionExample1 = null;
        garbageCollectionExample = null;
        garbageCollectionExample2 = null;

        // the two objects created now have no reference pointing to them
        // so they are orphan objects
        // and garbage collector will pick them up for garbage collection
        // which method will garbage collect them?
        // the Object class' finalize method, which we overrode below

        System.gc();

        System.out.println("hey");
    }

    public void finalize() {
        System.out.println("clearing");
    }
}
