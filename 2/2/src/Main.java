import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        TextContainer ts = new TextContainer();

        final Class<?> cls = TextContainer.class;


        if (cls.isAnnotationPresent(SaveTo.class)) {
            SaveTo st = cls.getAnnotation(SaveTo.class);


            Method[] methods = cls.getDeclaredMethods();


            for (Method method : methods) {
                if (method.isAnnotationPresent(Saver.class)) {
                    method.invoke(ts, st.path());
                }
            }
        }
    }


    }
