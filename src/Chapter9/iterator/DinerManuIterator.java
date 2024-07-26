package Chapter9.iterator;

import java.util.Iterator;

public class DinerManuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position = 0;

    public DinerManuIterator(MenuItem[] items) {
        this.items = items;
    }
    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
}