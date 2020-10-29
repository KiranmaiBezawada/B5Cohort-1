package com.wellsfargo.pms.service;

import com.wellsfargo.pms.model.InvestorDetails;

public interface IInvestorService {
	InvestorDetails verifyLogin(InvestorDetails investorDetails);
	InvestorDetails verifyDoubleRegistration(InvestorDetails investorDetails);

}
