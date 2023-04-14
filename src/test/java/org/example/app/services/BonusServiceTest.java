package org.example.app.services;

        import org.junit.jupiter.api.AfterEach;
        import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.DisplayName;
        import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {
    private BonusService service;

    @BeforeEach
    void setUp() { service = new BonusService(); }
    @DisplayName("Test calculate bonus sales with unexpected result.")
    @Test
    void test_Calculate_Bonus_Sales_Unexpected_Result(){assertNotEquals(12,service.calcBonus(100.00)); }

    @DisplayName("Test calculate bonus sales with expected result.")
    @Test
    void test_Calculate_Bonus_Sales_Expected_Result(){assertEquals(10,service.calcBonus(100.00)); }
    @AfterEach
    void tearDown() { service = null; }
}