public class LabIterator
{
    public static void main(String[] args)
    {
        ArrayContainer arrayContainer = new ArrayContainer();
        Iterator iterator = arrayContainer.getIterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
