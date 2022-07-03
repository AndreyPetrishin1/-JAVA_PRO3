import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
    Exemple exemple = new Exemple();
        final Class <?> cls = Exemple.class;

        Method [] methods = cls.getMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(Test.class)){

                Test anTest = method.getAnnotation(Test.class);
                method.invoke(exemple,anTest.param1(),  anTest.param2());

            }
        }
                exemple.show();
    }
}