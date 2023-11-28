package com.xworkz.owncompany;

import com.xworkz.owncompany.abstractimp.OwnCompany;
import com.xworkz.owncompany.runner.MyCompany;

public class OwnCompanyRunner {
	public static void main(String[] args) {
		OwnCompany o=new MyCompany();
		o.strategizeGrowth();
		o.manageEmployees();
	}

}
