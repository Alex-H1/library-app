package reflections;

import entity.Library;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflection {
    public final static Logger LOG = LogManager.getLogger(reflection.class);

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Library> constructor = Library.class.getConstructor();
        Library library = constructor.newInstance();
        Field[] libraryFields = library.getClass().getDeclaredFields();
        for(Field f : libraryFields){
            LOG.info(f);
        }
        LOG.info("\n");
        Constructor[] libraryConstructors = library.getClass().getDeclaredConstructors();
        for(Constructor c : libraryConstructors){
            LOG.info(c);
        }
        LOG.info("\n");
        Method[] libraryMethods = library.getClass().getDeclaredMethods();
        for(Method m : libraryMethods){
            LOG.info(m);
        }

    }
}
