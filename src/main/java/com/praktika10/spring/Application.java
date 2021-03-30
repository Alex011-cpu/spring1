package com.praktika10.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SortConfig.class);

        QuickSort quickSort = applicationContext.getBean("quickSort",QuickSort.class);
        MergeSort mergeSort = applicationContext.getBean(MergeSort.class);
        InsertionSort insertionSort = applicationContext.getBean(InsertionSort.class);

        quickSort.doSort();
        mergeSort.doSort();
        insertionSort.doSort();
    }

}
