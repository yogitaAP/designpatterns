public class SingletonTester {
   public static void main(String[] args) {
        //Create the 1st instance
        SingletonClass instance1 = SingletonClass.getInstance();
        
        //Create 2nd instance using Java Reflection API.
        SingletonClass instance2 = null;
        try {
            Class<SingletonClass> cls = SingletonClass.class;
            Constructor<SingletonClass> cons = cls.getDeclaredConstructor();
            cons.setAccessible(true);
            instance2 = cons.newInstance();
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        //now lets check the hash key.
        System.out.println("Instance 1 hash:" + instance1.hashCode());
        System.out.println("Instance 2 hash:" + instance2.hashCode());

        //keys will be different - implies failure of singleton
   }
}
