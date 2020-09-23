public void Dado(){
    double a;
    a = (Math.random()*5)+1;
    if (a < 2){
        System.out.println ("A");
    }else if (a < 3){
        System.out.println ("B");
    }else if (a < 4){
        System.out.println ("C");
    }else if (a < 5){
        System.out.println ("D");
    }else if (a < 6){
        System.out.println ("E");
    }else{
        System.out.println ("F");
    }
}	
