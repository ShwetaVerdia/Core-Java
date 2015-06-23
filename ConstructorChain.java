
class ConstructorChain {
    public static void main(String[] args) {
      new Child();
    }
}


class Child extends Parent {
    Child() {
        System.out.println("Child() constructor");
    }
}


class Parent extends Grandparent {
    Parent() {
        this(25);
        System.out.println("Parent() constructor");
    }
    
    Parent(int x) {
        System.out.println("Parent(" + x + ") constructor");
    }
}


class Grandparent {
    Grandparent() {
        System.out.println("Grandparent() constructor");
    }
}