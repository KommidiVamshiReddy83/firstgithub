package AbstractionUsingInterface;

 interface Animal {
     void sound();
     void name();
     default void sleep(){
         System.out.println("the animal sleep");
     }
}
