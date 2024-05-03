public class interface_2 {
    public static void main(String args[]){
        Beer b = new Beer();
        b.eatgrass();
        b.eatmeat();
    }
}

interface Herbivore{  //interface -1
    void eatmeat();
}

interface Carnivore{  //interface -2
    void eatgrass();
}

class Beer implements Herbivore,Carnivore{  
    //doing multiple inheritance (inherit both interface)
    public void eatgrass(){
        System.out.println("eat grass");
    }
    public void eatmeat(){
        System.out.println("eat meat");
    }
}