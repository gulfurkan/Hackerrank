public class javaGenericMethodSolution {
    private <E> void _printArray(E[] inputArray){
        for (E element : inputArray) {
            System.out.println(element);
        }
    }

    public void run(){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        this._printArray(intArray);
        this._printArray(stringArray);
    }
}
