/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stir.cscu9t4assignment2021;

import java.awt.event.ActionEvent;
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
public class RefSystemGUITest {
    
    public RefSystemGUITest() {
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
     * Test of main method, of class RefSystemGUI.
     * Just tests if the GUI initiates without explicit fail
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        RefSystemGUI.main(args);
    }

    /**
     * Test of actionPerformed method, of class RefSystemGUI.
     * You might want to add an action and a few more test cases with 
     * different actions
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent event = null;
        RefSystemGUI instance = new RefSystemGUI();
        instance.actionPerformed(event);
    }
    
}
