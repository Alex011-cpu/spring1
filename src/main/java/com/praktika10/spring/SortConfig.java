package com.praktika10.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SortConfig {

    @Bean
    public MergeSort mergeSort() {
        return new MergeSort();
    }

    @Bean
    public InsertionSort insertionSort() {
        return new InsertionSort();
    }

    @Bean
    public QuickSort quickSort() {
        return new QuickSort();
    }

}
