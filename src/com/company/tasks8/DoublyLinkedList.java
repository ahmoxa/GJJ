package com.company.tasks8;


public class DoublyLinkedList {
    int size;
    Entry first;
    Entry last;

    public int add(int e){
        Entry l = last;
        Entry newEntry = new Entry(l, null, e);
        last = newEntry;
        if(l == null){
            first = newEntry;
        }else{
            l.next = newEntry;
        }
        return size++;
    }

    public void add(int index, int e){
        if(index == 0){
            addFirst(e);
        }else  if(index == size){
            add(e);
        }else if (index < size){
            Entry oldEntry = getEntryByIndex(index);
            Entry newEntry = new Entry(oldEntry.prev, oldEntry, e);
            oldEntry.prev.next = newEntry;
            oldEntry.prev = newEntry;
            size++;
        }
    }

    public void addFirst(int e){
        Entry f = first;
        Entry newEntry = new Entry(null, f, e);
        first = newEntry;
        if(f == null){
            last = newEntry;
        }else{
            f.prev = newEntry;
        }
        size++;
    }

    public int get(int index){
        return getEntryByIndex(index).value;
    }

    public int remove(int index){
        Entry removeEntry = getEntryByIndex(index);
        int removeEntryValue = removeEntry.value;
        unlink(removeEntry);
        return removeEntryValue;
    }

    public int removeElement(int e){
        int index = 0;
        Entry curEntry = first;
        while (curEntry.next != null){
            if(curEntry.value == e){
               unlink(curEntry);
                return index;
            }
            index++;
            curEntry = curEntry.next;
        }

        return -1;
    }

    public int indexOf (int e){
        int index = 0;
        Entry curEntry = first;
        while (curEntry.next != null){
            if(curEntry.value == e){
                return index;
            }
            index++;
            curEntry = curEntry.next;
        }

        return -1;
    }

    public boolean contains (int e){
        return indexOf(e) != -1;
    }

    public int set(int i, int e){
        Entry entry = getEntryByIndex(i);
        int oldVal = entry.value;
        entry.value = e;
        return oldVal;
    }

    public int size(){
        return size;
    }

    private void unlink(Entry e){
        Entry prev = e.prev;
        Entry next = e.next;

        if(prev == null){
            first = next;
        }else{
            prev.next = next;
            e.prev = null;
        }

        if(next == null){
            last = prev;
        }else{
            next.prev = prev;
            e.next = null;
        }
        size--;
    }

    private Entry getEntryByIndex(int index){
        if(index <= size / 2){
            Entry oldEntry = first;
            for (int i = 0; i < index; i++) {
                oldEntry = oldEntry.next;
            }
            return oldEntry;
        }else {
            Entry oldEntry = last;
            for (int i = size; i > index + 1; i--) {
                oldEntry = oldEntry.prev;
            }
            return oldEntry;
        }
    }


    @Override
    public String toString() {
        if(first == null){
            return "Empty";
        }
        Entry curEntry = first;
        String result = "";
        while (curEntry != null){
            result+=curEntry + " -> ";
            curEntry = curEntry.next;
        }
        return result;
    }


    private static class Entry{
        private Entry prev;
        private Entry next;
        private int value;

        private Entry(Entry prev, Entry next, int value) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }

        private Entry(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" +
                    "value=" + value +
                    '}';
        }
    }
}
