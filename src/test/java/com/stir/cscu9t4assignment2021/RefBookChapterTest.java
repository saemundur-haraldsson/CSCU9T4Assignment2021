/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stir.cscu9t4assignment2021;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author saemundur
 */
public class RefBookChapterTest {
    
    public RefBookChapterTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of 
     */
    
    /**
     * Test of getBook method, of class RefBookChapter.
     * Also tests the constructor without date added
     */
    @Test
    public void testGetBook() {
        System.out.println("getBook");
        String title = "Some Book Chapter";
        String book = "Some book about stuff";
        String authors = "Saemi Haraldsson, Ragnheidur Brynjolfsdottir";
        String doi = "10.123456/9876";
        String publisher = "Springer";
        String editor = "Scooby Doo";
        int pubyear = 2002;
        RefBookChapter instance = new RefBookChapter(title,book,authors,doi,
                                                    publisher,editor,pubyear);
        String expResult = "Some book about stuff";
        String result = instance.getBook();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCitation method, of class RefBookChapter.
     * Also tests the constructor without date added
     */
    @Test
    public void testGetCitation() {
        System.out.println("getCitation");
        String title = "Some Book Chapter";
        String book = "Some book about stuff";
        String authors = "Saemi Haraldsson, Ragnheidur Brynjolfsdottir";
        String doi = "10.123456/9876";
        String publisher = "Springer";
        String editor = "Scooby Doo";
        int pubyear = 2002;
        int day = 1;
        int month = 1;
        int year = 2021;
        RefBookChapter instance = new RefBookChapter(title,book,authors,doi,
                                                     publisher,editor,pubyear,
                                                     day,month,year
                                                    );
        String expResult = "Saemi Haraldsson, Ragnheidur Brynjolfsdottir (2002),"
                           +" Some Book Chapter, in Some book about stuff, Springer ,"
                            +" ed: Scooby Doo, doi:10.123456/9876";
        String result = instance.getCitation();
        assertEquals(expResult, result);
    }
    
}
