package br.com.panvel.slides.array;

public class Test_adapter {
    public static void main(String[] args) {

        ArrayAdapter arrayAdapter = new ArrayAdapter();

        arrayAdapter.add(5);
        arrayAdapter.add(6);
        arrayAdapter.add(7);
        arrayAdapter.add(8);

        System.out.println("SIZE: " + arrayAdapter.size());

        for (int i = 0; i < arrayAdapter.size(); i++) {
            System.out.println(arrayAdapter.get(i));
        }

        arrayAdapter.remove(2);

        System.out.println("SIZE: " + arrayAdapter.size());

        for (int i = 0; i < arrayAdapter.size(); i++) {
            System.out.println(arrayAdapter.get(i));
        }


    }
}





class ArrayAdapter{
    private Object[] array;
    private int size;

    public ArrayAdapter(){
        array = new Object[1000];
        size = 0;
    }

    public void add(Object obj)
    {
        if(size == array.length)
            return;
        array[size] = obj;
        size++;
    }

    public void remove(int index)
    {
        for (int i = 0; i < size-1; i++) {
            array[index+i] = array[index+i+1];
        }
        size--;
    }

    public Object get(int index)
    {
        return array[index];
    }

    public int size()
    {
        return size;
    }


}
