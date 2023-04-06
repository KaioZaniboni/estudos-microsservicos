package br.com.zaniboni.payrollapi.resources;

import br.com.zaniboni.payrollapi.domain.Payroll;
import br.com.zaniboni.payrollapi.services.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResources {

    private final PayrollService payrollService;

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayments(@PathVariable Long workerId, @RequestBody Payroll payment) {
        return ResponseEntity.ok().body(payrollService.getPayment(workerId, payment));
    }
}
