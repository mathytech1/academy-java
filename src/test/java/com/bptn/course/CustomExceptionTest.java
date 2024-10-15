package com.bptn.course;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.bptn.course._12_exception_handling.CustomException;
import com.bptn.course._12_exception_handling.InsufficientBalanceException;

class CustomExceptionTest {

	@Test
	void testWithdraw() {
		// fail("Not yet implemented");
		CustomException ce = new CustomException(1000.0);
		assertThrows(InsufficientBalanceException.class, () -> {
			ce.withdraw(5000);
		});
	}

}
