//Revisa si un numero entero es primo o no.
boolean isPrime(int n) {
    //revisa si n es multiplo de 2
    if (n%2==0) return false;
    //si no, solo revisa los impares
    for(int i=3;i*i<=n;i+=2) {
        if(n%i==0)
            return false;
    }
    return true;
}