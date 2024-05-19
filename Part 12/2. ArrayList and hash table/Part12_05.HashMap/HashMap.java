
public class HashMap<K, V> {
    
    // Private fields
    private List<Pair<K, V>>[] values;
    private int firstFreeIndex;
    
    // Constructor with an initial size of 32
    public HashMap(K key, V value) {
        this.values = new List[32];
        this.firstFreeIndex = 0;
    }
    
    public V get(K key) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        if (valuesAtIndex == null) {
            return null;
        }
        
        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.value(i).getKey().equals(key)) {
                return valuesAtIndex.value(i).getValue();
            }
        }
        
        return null;
    }
    
    public void add(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);
        
        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.value(index).setValue(value);
        }
        
        if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
            grow();
        }
    }
    
    private List<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            this.values[hashValue] = new List<>();
        }
        
        return this.values[hashValue];
    }
    
    private int getIndexOfKey(List<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.value(i).getKey().equals(key)) {
                return i;
            }
        }
        
        return -1;
    }
    
    private void grow() {
        List<Pair<K, V>>[] newArray = new List[this.values.length * 2];
        for (int i = 0; i < this.values.length; i++) {
            copy(newArray, i);
        }
        
        this.values = newArray;
    }
    
    public void copy(List<Pair<K, V>>[] newOne, int fromIdx) {
        for (int i = 0; i < this.values[fromIdx].size(); i++) {
            Pair<K, V> value = this.values[fromIdx].value(i);

            int hashValue = Math.abs(value.getKey().hashCode() % newOne.length);
            if(newOne[hashValue] == null) {
                newOne[hashValue] = new List<>();
            }

            newOne[hashValue].add(value);
        }
    }
    
    public V remove(K key) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        if (valuesAtIndex == null) {
            return null;
        }
        
        int indexOfKey = getIndexOfKey(valuesAtIndex, key);
        if (indexOfKey < 0) {
            return null;
        }
       
        Pair<K, V> pair = valuesAtIndex.value(indexOfKey);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }
}
