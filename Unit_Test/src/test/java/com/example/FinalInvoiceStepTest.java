package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

public class FinalInvoiceStepTest {
	
	private Invoice invoice;	
	private Customer customer;
	private EmailService emailService;
	private PrinterService printerService;
	
	@Before
	public void createTestDoubles() {
		invoice = mock(Invoice.class);	
		customer = mock(Customer.class);
		emailService = mock(EmailService.class);
		printerService = mock(PrinterService.class);
	}
	
	@Test
	public void testCustomerPrefersEmails() {
		FinalInvoiceStep finalInvoiceStep = new FinalInvoiceStep(printerService, emailService);
		when(customer.prefersEmails()).thenReturn(true);
		when(customer.getEmail()).thenReturn("test@test.com");
		finalInvoiceStep.handleInvoice(invoice, customer);
		verify(emailService).sendInvoice(invoice, "test@test.com");
	}
	
	@Test
	public void testCustomerPrefersPrinter() {
		FinalInvoiceStep finalInvoiceStep = new FinalInvoiceStep(printerService, emailService);
		when(customer.prefersEmails()).thenReturn(false);
		finalInvoiceStep.handleInvoice(invoice, customer);
		verify(printerService).printInvoice(invoice);
	}

}
