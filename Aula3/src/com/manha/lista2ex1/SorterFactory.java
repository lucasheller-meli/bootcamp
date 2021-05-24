package com.manha.lista2ex1;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.Properties;

public class SorterFactory {
    static <T> Sorter<T> getInstance() throws IOException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Properties properties = new Properties();
        String rootPath = Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource("")).getPath();
        properties.load(new FileInputStream(rootPath + "com/manha/lista2ex1/factory.properties"));
        String sorter = properties.getProperty("sorter");

        Class<Sorter<T>> sorterClass = (Class<Sorter<T>>) Class.forName(sorter);

        return sorterClass.getConstructor().newInstance();
    }
}
