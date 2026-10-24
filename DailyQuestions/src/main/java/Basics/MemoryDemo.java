package Basics;

import java.lang.ref.WeakReference;

public class MemoryDemo {
    public static void main(String[] args) {
        // Strong reference 
        StringBuilder cachedData = new StringBuilder("Heavy Object!");

        // Weak Reference Wrapper
        WeakReference<StringBuilder> weakRef = new WeakReference<>(cachedData);

        // Make the object eligible for GC by removing the strong reference
        cachedData = null;

        // Suggesting Garbage Collection (for demonstration)
        System.gc();

        // If GC occurred, weakRef.get() will immediately return null
        if (weakRef.get() == null) {
            System.out.println("Object was aggresively reclaimed by Garbage Collection");
        }
    }
}