//La suma de los elementos enteros del array
private int method (int[] array) {
    int var = 0;
    for(int i = 0; i < array.length; i++){
        var+=array[i];
    }
    return var;
}