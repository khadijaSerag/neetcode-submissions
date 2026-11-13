class MyHashSet {
    Integer[] a;

    public MyHashSet() {
        a = new Integer[1000001];
    }
    
    public void add(int key) {
        a[key] = key;
    }
    
    public void remove(int key) {
        a[key]= null;
    }
    
    public boolean contains(int key) {
        return a[key] != null ? true : false ;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */