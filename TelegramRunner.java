package com.xworkz.september.driver;

import java.util.Date;

import com.xworkz.september.things.Telegram;

public class TelegramRunner {
	public static void main(String[] args) {
		new Telegram();
		new Telegram("ramyap");
		new Telegram("Rmayp_123","ramyap@123","21","rramyap@gamil.com",6366276883l);
		new Telegram("Rmayp_123","ramyap@123","21","rramyap@gamil.com",6366276883l,new Date(),"12/12/2001");
	}

}
