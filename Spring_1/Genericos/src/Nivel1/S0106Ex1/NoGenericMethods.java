
package Nivel1.S0106Ex1;

public class NoGenericMethods {
    Animal animal;
    Animal animal1;
    Animal animal2;
    private Animal[] ordenAnimal = new Animal[3];

    public NoGenericMethods(Animal animal, Animal animal1, Animal animal2) {
        this.animal = animal;
        this.animal1 = animal1;
        this.animal2 = animal2;

        ordenAnimal[0]= this.animal;
        ordenAnimal[1]= this.animal1;
        ordenAnimal[2]= this.animal2;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal1() {
        return animal1;
    }

    public void setAnimal1(Animal animal1) {
        this.animal1 = animal1;
    }



    public Animal getAnimal2() {
        return animal2;
    }

    public void setAnimal2(Animal animal2) {
        this.animal2 = animal2;
    }

    public Animal[] getOrdenAnimal() {
        return ordenAnimal;
    }

    public void setOrdenAnimal(Animal[] ordenAnimal) {
        this.ordenAnimal = ordenAnimal;
    }

}
