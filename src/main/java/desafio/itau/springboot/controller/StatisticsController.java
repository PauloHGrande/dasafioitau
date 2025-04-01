package desafio.itau.springboot.controller;

import java.util.DoubleSummaryStatistics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.itau.springboot.dto.StatisticasResponse;
import desafio.itau.springboot.service.TransactionService;

@RestController
@RequestMapping("/estatistica")
public class StatisticsController {

	@Autowired
	private TransactionService transactionService;
	
	@GetMapping
	public ResponseEntity<StatisticasResponse> getStatistics() {
		DoubleSummaryStatistics stats = transactionService.getStatistics();
		return ResponseEntity.ok(new StatisticasResponse(stats));
	}
}
