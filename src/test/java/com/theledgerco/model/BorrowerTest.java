package com.theledgerco.model;

import com.theledgerco.Borrower;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(PowerMockRunner.class)
public class BorrowerTest {

    @Mock
    private Payment payment;
    @Mock
    private Loan loan;
    @InjectMocks
    private Borrower borrower;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        payment = mock(Payment.class);
        loan = mock(Loan.class);
        when(payment.getLump_sum()).thenReturn(1000.0);
        when(payment.getEmi_no()).thenReturn(3);
        when(loan.getNo_of_years()).thenReturn(3);
        when(loan.getPricipal()).thenReturn(10000.0);
        when(loan.getRate_of_interest()).thenReturn(7);
        when(loan.getEmi_per_month()).thenReturn(337L);
    }

    @Test
    public void calculateBalanceTest() {
        borrower.calculateBalance(3);
        assertEquals(borrower.getBalance().getAmount_paid(), 0.0);
    }
}
