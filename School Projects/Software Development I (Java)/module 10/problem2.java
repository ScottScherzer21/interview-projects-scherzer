public class problem2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Animal[] list = new Animal[5]; 
        list[0] = new Chicken(); 
        list[0].setWeight(4.5);
        
        list[1] = new Tiger(); 
        list[1].setWeight(46.6);
       
        list[2] = new Chicken(); 
        list[2].setWeight(1.5);
        
        list[3] = (Animal)(list[0].clone()); 
        list[3].setWeight(7.5);
        
        list[4] = (Animal)(list[1].clone());
        
        java.util.Arrays.sort(list);
        
        for (int i = 0; i < list.length; i++) {
            System.out.println("weight: " + list[i].getWeight()); 
        }
    }
}

class Animal implements Cloneable, Comparable{

    double weight;

    // popuate the object or instance
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // return the weight
    public double getWeight() {
        return this.weight;
    }

    //create the clone method
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }
}

class Chicken extends Animal{
    }

class Tiger extends Animal{
    }
