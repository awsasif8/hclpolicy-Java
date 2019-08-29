package com.hcl.policyDescription;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.dto.PolicyIdDto;
import com.hcl.repository.PolicyRepository;
import com.hcl.repository.TermDetailsRepository;
import com.hcl.service.PolicyDetailsServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class PolicyDescriptionTest {
	
	@InjectMocks
	PolicyDetailsServiceImpl policyService;
	
	@Mock
	PolicyRepository policyRepository;
	
	@Mock
	TermDetailsRepository termRepository;
	
	public PolicyIdDto policyIdDto()
	{
		PolicyIdDto policy = new PolicyIdDto();
		policy.setPolicyId(1);
		policy.setPolicyName("Test");
		return policy;
	}

}
