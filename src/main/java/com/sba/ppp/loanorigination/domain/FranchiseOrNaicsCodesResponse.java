package com.sba.ppp.loanorigination.domain;

import java.util.List;

import com.sba.ppp.loanorigination.domain.SbaPPPLoanMessagesResponse.SbaPPPLoanMessagesResponseBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FranchiseOrNaicsCodesResponse {

	 private Integer count;
	 
	 private String next;
	 
	 private String previous;
	 
	 private List<FranchiseOrNaicsCodes> results;
}
