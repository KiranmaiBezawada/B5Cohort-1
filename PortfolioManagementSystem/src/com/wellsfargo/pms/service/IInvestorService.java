package com.wellsfargo.pms.service;

import com.wellsfargo.pms.model.InvestorloginDetails;

public interface IInvestorService {
	InvestorloginDetails verifyLogin(InvestorloginDetails investorDetails);
	InvestorloginDetails verifyDoubleRegistration(InvestorloginDetails investorDetails);

}
