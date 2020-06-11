public class ArrayContainer implements Container
{
    String[] array = { "Element_One", "Element_Two", "Element_Three" };

    @Override
    public Iterator getIterator() {
        return new ArrayIterator();
    }

    class ArrayIterator implements Iterator
    {
        int index;

        @Override
        public boolean hasNext() {
            return (index < array.length);
        }

        @Override
        public Object next() {
            if(hasNext())
            {
                return array[index++];
            }
            return null;
        }
    }
}
